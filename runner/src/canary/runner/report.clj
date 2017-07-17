(ns canary.runner.report
  (:require [canary.runner.print :as print :refer [announce with-task-printing]]
            [canary.runner.shell :as shell]
            [clojure.java.io :as io]
            [canary.runner.utils :as utils]
            [canary.runner.env :as env]
            [clojure.string :as string]
            [me.raynes.fs :as fs]))

(def commit-script-path "scripts/commit_report.sh")
(def report-file "README.md")
(def options-file "options.edn")
(def tasks-file "tasks.edn")

(defn write-file-to-workdir! [content name options]
  (let [workdir (:workdir options)
        path (str workdir "/" name)]
    (fs/mkdirs workdir)
    (spit path content)))

; -- commit script ----------------------------------------------------------------------------------------------------------

(defn commit-report! [commit-task options]
  ; note it seemed to be easier to resort to shell
  (let [script (io/file (utils/canonical-path commit-script-path))
        env {"RESULT_DIR"        (:workdir options)
             "CANARY_VERBOSITY"  (str (:verbosity options))
             "CANARY_PRODUCTION" (str (:production options))
             "CANARY_JOB_ID"     (str (:job-id options))
             "CANARY_BUILD_ID"   (str (get-in options [:build-result :build-id]))
             "CANARY_REPO_TOKEN" (env/get "CANARY_REPO_TOKEN")}                                                               ; we want to get advantage of .env files
        build-launcher (shell/make-shell-launcher script env)
        result (build-launcher (with-meta options commit-task))
        exit-code (:exit-code result)]
    (if (zero? exit-code)
      true
      (do
        (announce (str "report commit script failed (exit code " exit-code ")"))
        nil))))

; -- report building --------------------------------------------------------------------------------------------------------

(defn about-job [job-commit canary-repo-commit-url]
  (let [trigger-source (if (empty? job-commit)
                         "locally"
                         (str "by [this commit](" canary-repo-commit-url "/" job-commit ")"))]
    (str "The job was triggered " trigger-source
         "| [options](options.edn) "
         "| [tasks](tasks.edn)"
         ".")))

(defn about-compiler [build-result]
  (when (some? build-result)
    (let [{:keys [compiler-rev-url github-release-name github-release-tag build-download-url]} build-result
          release-page-url (str "https://github.com/cljs-oss/canary/releases/tag/" github-release-tag)
          lines [(str "The job prepared a test build of [" github-release-name "](" release-page-url ")"
                      "| [jar download](" build-download-url ") "
                      "| [compiler source](" compiler-rev-url ")"
                      ".")]]
      (string/join \newline (keep identity lines)))))

(defn about-travis [build-result]
  (when (some? build-result)
    (let [{:keys [travis-build-url]} build-result]
      (when (not= travis-build-url "n/a")
        (str "Full job trace can be retrieved via Travis [build log](" travis-build-url ").")))))

(defn report-header [options]
  (let [job-commit (env/get "CANARY_JOB_COMMIT")
        canary-repo-commit-url "https://github.com/cljs-oss/canary/commit"
        lines [(str "## Report for job #" (:job-id options))
               ""
               (about-job job-commit canary-repo-commit-url)
               (about-compiler (:build-result options))
               (about-travis (:build-result options))]]
    (string/join \newline (keep identity lines))))

(defn report-enabled-tasks [tasks options]
  (when-not (empty? tasks)
    (let [header [""
                  "### Executed Tasks"
                  ]
          * (fn [task]
              (str "\n" "#### " (:name task) "\n" (get-in task [:result :report])))
          list (map * tasks)]
      (string/join \newline (concat header list)))))

(defn report-disabled-tasks [tasks options]
  (when-not (empty? tasks)
    (let [header [""
                  "### Disabled Tasks"
                  "| Task | Reason |"
                  "| :--- | :--- |"]
          * (fn [task]
              (str "| " (:name task) " | " (:enabled-reason task) " |"))
          list (map * tasks)]
      (string/join \newline (concat header list)))))

(defn prepare-report [tasks options]
  (let [header (report-header options)
        enabled-tasks (report-enabled-tasks (filter :enabled tasks) options)
        disabled-tasks (report-disabled-tasks (remove :enabled tasks) options)
        all-parts [header enabled-tasks disabled-tasks]
        content (string/join \newline (keep identity all-parts))]
    {:content content}))

(defn report-for-exception [e]
  (let [stacktrace (utils/stacktrace-str e)]
    (str "```\n"
         "Exception: " stacktrace "\n"
         "```")))

; -- main api ---------------------------------------------------------------------------------------------------------------

(defn prepare-and-commit-report! [tasks options]
  (let [{:keys [test]} options
        commit-task {:name  "commit report"
                     :color :red}
        report (prepare-report tasks options)]
    (announce (str "report:\n" (utils/pp report)) 1 options)
    (write-file-to-workdir! (utils/pp options) options-file options)
    (write-file-to-workdir! (utils/pp tasks) tasks-file options)
    (write-file-to-workdir! (:content report) report-file options)
    (if test
      (do
        (announce (str (print/emphasize "skipping") " report commit"))
        nil)
      (do
        (announce (str (print/emphasize "performing") " report commit"))
        (with-task-printing commit-task options
          (commit-report! commit-task options))))))
