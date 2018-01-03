(ns canary.rgen.overview
  "Overview generator for readme."
  (:require [canary.rgen.utils :as utils]
            [canary.rgen.print :as print :refer [announce]]
            [me.raynes.fs :as fs]
            [clojure.string :as string]
            [canary.rgen.i18n :as i18n]))

(def task-edn-re #".*/reports/(\d+)/(\d+)/(\d+)/job-(\d+)-([0-9.]+)-([0-9a-f]+)/tasks.edn")

(defn parse-task-info-from-file [file]
  (let [file-path (str file)]                                                                                                 ; is something like '/Users/darwin/temp/canary/reports/2017/07/19/job-000067-1.9.822-b3c7667/tasks.edn'
    (if-some [match (re-matches task-edn-re file-path)]
      (let [[year month day job-id compiler-version compiler-sha] (rest match)]
        {:tasks-edn-path   file-path
         :date             (string/join "-" [year month day])
         :job-id           (utils/parse-int job-id)
         :compiler-version compiler-version
         :compiler-sha     compiler-sha}))))

(defn parse-job-infos [files]
  (keep parse-task-info-from-file files))

(defn get-relevant-job-infos [task-infos options]
  (let [{:keys [recent]} options
        sorted-task-infos (reverse (sort-by :job-id task-infos))]
    (if (pos? recent)
      (take recent sorted-task-infos)
      sorted-task-infos)))

(defn try-read-edn [path]
  (try
    (read-string (slurp path))
    (catch Exception e
      (binding [*out* *err*]
        (println (str "Unable to read and parse: '" path "' => " (.getMessage e))))
      nil)))

(defn fetch-job-info-tasks-data [task-info]
  (let [{:keys [tasks-edn-path]} task-info]
    (if-some [tasks-edn (try-read-edn tasks-edn-path)]
      (assoc task-info :tasks tasks-edn))))

(defn fetch-job-infos-tasks-data [task-infos]
  (keep fetch-job-info-tasks-data task-infos))

(defn job-ids [jobs]
  (map :job-id jobs))

(defn job-tasks [job]
  (map :name (:tasks job)))

(defn all-tasks [jobs]
  (dedupe (sort (flatten (map job-tasks jobs)))))

(defn get-job-with-id [jobs job-id]
  (first (filter #(= job-id (:job-id %)) jobs)))

(defn get-task-with-name [tasks task-name]
  (first (filter #(= task-name (:name %)) tasks)))

(defn task-result [task]
  (:result task))

(defn task-passed? [task]
  (= (get-in task [:result :status]) :passed))

(defn task-failed? [task]
  (= (get-in task [:result :status]) :failed))

(defn task-errored? [task]
  (= (get-in task [:result :status]) :errored))

(defn task-canceled? [task]
  (= (get-in task [:result :status]) :canceled))

(defn generate-status-matrix-cell [jobs task-name job-id]
  (let [selected-job (get-job-with-id jobs job-id)
        _ (assert (some? selected-job))
        selected-task (get-task-with-name (:tasks selected-job) task-name)]
    (cond
      (nil? selected-task) :missing
      (nil? (task-result selected-task)) :disabled
      (task-passed? selected-task) :passed
      (task-failed? selected-task) :failed
      (task-errored? selected-task) :errored
      (task-canceled? selected-task) :canceled
      :else :unknown)))

(defn generate-status-matrix-row [jobs job-ids task-name]
  (map (partial generate-status-matrix-cell jobs task-name) job-ids))

(defn generate-status-matrix [jobs task-names job-ids]
  (map (partial generate-status-matrix-row jobs job-ids) task-names))

(defn table-row-to-markup [table-row]
  (str "| " (string/join " | " table-row) " |"))

(defn extract-relative-job-report-path [path]
  (if-some [match (re-matches #".*/reports/(.*)/tasks\.edn" path)]
    (second match)))

(defn prepare-job-report-link [job]
  (let [relative-job-report-path (extract-relative-job-report-path (:tasks-edn-path job))                                     ; something like 2017/08/16/job-000078-1.9.906-56a880c
        link (str "reports/" relative-job-report-path)]
    link))

(defn table-to-markup [table]
  ; see https://help.github.com/articles/organizing-information-with-tables
  (let [header (first table)
        body (rest table)
        _ (assert (pos? (count header)))
        separator (cons ":---" (repeat (dec (count header)) ":---:"))
        lines (concat [(table-row-to-markup header)]
                      [(table-row-to-markup separator)]
                      (map table-row-to-markup body))]
    (string/join "\n" lines)))

(defn render-status-matrix-cell [options jobs task-name status job-id]
  (let [assets-url (:assets options)
        status-name (name status)
        selected-job (get-job-with-id jobs job-id)
        job-link (prepare-job-report-link selected-job)
        task-link (str job-link "#-" task-name)                                                                               ; TODO: html/markdown/url sanitize task name here
        status-image-link (str assets-url "/s-" status-name ".svg")]
    (str "<a href=\"" task-link "\"><img title=\"" status-name "\" src=\"" status-image-link "\"><a>")))

(defn render-status-matrix-rows [jobs job-ids task-names status-matrix options]
  (assert (= (count task-names) (count status-matrix)))
  (let [* (fn [task-name status-matrix-row]
            (concat [task-name] (map (partial render-status-matrix-cell options jobs task-name) status-matrix-row job-ids)))]
    (map * task-names status-matrix)))

(defn prepare-job-title [job]
  (let [{:keys [job-id date compiler-version compiler-sha]} job
        compiler (str compiler-version "-" compiler-sha)]
    (str "job #" job-id " finished on " date)))

(defn render-job-link [jobs job-id]
  (let [selected-job (get-job-with-id jobs job-id)
        link (prepare-job-report-link selected-job)
        title (prepare-job-title selected-job)]
    (str "<a href=\"" link "\" title=\"" title "\">" job-id "</a>")))

(defn render-job-links [jobs job-ids]
  (map (partial render-job-link jobs) job-ids))

(defn generate-status-table-markup [jobs task-names job-ids status-matrix options]
  (let [header (concat ["task \\ job"] (render-job-links jobs job-ids))
        body (render-status-matrix-rows jobs job-ids task-names status-matrix options)
        table (concat [header] body)]
    (table-to-markup table)))

(defn try-write-output [file-path content]
  (try
    (fs/mkdirs (fs/parent file-path))
    (spit file-path content)
    0
    (catch Throwable e
      (binding [*out* *err*]
        (println (str "Unable to write '" file-path "' => " (.getMessage e)))
        36))))

(defn generate! [options]
  (announce (i18n/overview-options-msg options) 2 options)
  (let [{:keys [reports output]} options
        jobs-task-files (fs/find-files reports #".*tasks\.edn")
        job-infos (parse-job-infos jobs-task-files)
        relevant-job-infos (get-relevant-job-infos job-infos options)
        jobs (fetch-job-infos-tasks-data relevant-job-infos)
        job-ids (job-ids jobs)
        all-tasks (all-tasks jobs)
        status-matrix (generate-status-matrix jobs all-tasks job-ids)
        status-table-markup (generate-status-table-markup jobs all-tasks job-ids status-matrix options)
        use-stdout? (or (empty? output) (= output "-"))]
    (if use-stdout?
      (do
        (println status-table-markup)
        0)
      (let [output-path (utils/canonical-path output)
            exit-code (try-write-output output-path status-table-markup)]
        (if (zero? exit-code)
          (announce (str "Wrote generated overview to " (print/file-path output-path))))
        exit-code))))
