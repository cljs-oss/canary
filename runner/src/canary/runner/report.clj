(ns canary.runner.report
  (:require [canary.runner.print :as print :refer [announce with-task-printing]]
            [canary.runner.shell :as shell]
            [clojure.java.io :as io]
            [canary.runner.utils :as utils]
            [canary.runner.env :as env]
            [clojure.string :as string]
            [canary.runner.i18n :as i18n]
            [me.raynes.fs :as fs])
  (:import (java.net URLEncoder)))

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
        env {"CANARY_RESULT_DIR" (:workdir options)
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
        (announce (i18n/report-commit-script-failed-msg exit-code))
        nil))))

; -- report building --------------------------------------------------------------------------------------------------------

(defn about-travis [build-result]
  (when (some? build-result)
    (let [{:keys [travis-build-url]} build-result]
      (if (= travis-build-url "n/a")
        "travis n/a"
        (str "[travis log](" travis-build-url ")")))))

(defn about-job [job-id job-sha canary-repo-commit-url build-result]
  (let [trigger-source (if (empty? job-sha)
                         "local"
                         (str "[jobs/" (utils/short-sha job-sha) "](" canary-repo-commit-url "/" job-sha ")"))
        travis-info (about-travis build-result)]
    (str "\n"
         "Job: **#" job-id "** "
         "| " trigger-source " "
         "| [options](options.edn) "
         "| [tasks](tasks.edn)"
         (if (some? travis-info)
           (str " | " travis-info))
         ".")))

(defn about-compiler [build-result]
  (when (some? build-result)
    (let [{:keys [compiler-rev-url github-release-name github-release-tag build-download-url]} build-result
          release-page-url (str "https://github.com/cljs-oss/canary/releases/tag/" github-release-tag)
          lines [""
                 (str "Compiler: **" github-release-name "** "
                      "| [release page](" release-page-url ") "
                      "| [jar download](" build-download-url ") "
                      "| [source](" compiler-rev-url ").")]]
      (string/join \newline (keep identity lines)))))

(defn report-header [options]
  (let [job-sha (env/get "CANARY_JOB_COMMIT")
        job-id (:job-id options)
        build-result (:build-result options)
        canary-repo-commit-url "https://github.com/cljs-oss/canary/commit"
        lines [(str "## Report for job #" job-id)
               (about-job job-id job-sha canary-repo-commit-url build-result)
               (about-compiler build-result)]]
    (string/join \newline (keep identity lines))))

(defn task-passed? [task]
  (= (get-in task [:result :state]) :passed))

(defn report-enabled-tasks [tasks options]
  (when-not (empty? tasks)
    (let [header [""
                  "### Executed Tasks"
                  ]
          render-check-mark (fn [task]
                              (if (task-passed? task) "&#x2714;" "&#x2718;"))
          * (fn [task]
              (str "\n" "#### " (render-check-mark task) " " (:name task) "\n" (get-in task [:result :report])))
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

(defn report-summary [tasks options]
  (let [enabled-tasks (filter :enabled tasks)
        disabled-tasks (remove :enabled tasks)
        passed-tasks (filter task-passed? enabled-tasks)
        failed-tasks (remove task-passed? enabled-tasks)
        all-passed? (= (count enabled-tasks) (count passed-tasks))
        happy-msg (str "All tasks passed!")
        unhappy-msg (str "Some tasks failed!")
        total-msg (str " of total " (count tasks) " tasks.")
        passed-msg (str "Passed " (count passed-tasks) " / " (count enabled-tasks) " (executed)" total-msg)
        failed-msg (str "Failed " (count failed-tasks) " / " (count enabled-tasks) " (executed)" total-msg)
        failed-linkifier (fn [task]
                           (let [name (:name task)]
                             (str "[" name "](#-" (URLEncoder/encode name) ")")))
        failed-links (string/join " | " (map failed-linkifier failed-tasks))
        face (if all-passed? "☺" "☹")
        lines [""
               (str "### " face " Summary")
               ""
               (if all-passed?
                 (str happy-msg " " passed-msg)
                 (str unhappy-msg " " failed-msg "\n\nFailed tasks: " failed-links "."))]]
    (string/join \newline (keep identity lines))))

(defn prepare-complete-report [tasks options]
  (let [header (report-header options)
        summary (report-summary tasks options)
        enabled-tasks (filter :enabled tasks)
        disabled-tasks (remove :enabled tasks)
        passed-tasks (filter task-passed? enabled-tasks)
        failed-tasks (remove task-passed? enabled-tasks)
        enabled-tasks (report-enabled-tasks (concat failed-tasks passed-tasks) options)
        disabled-tasks (report-disabled-tasks disabled-tasks options)
        all-parts [header summary enabled-tasks disabled-tasks]
        content (string/join \newline (keep identity all-parts))]
    {:content content}))

; -- main api ---------------------------------------------------------------------------------------------------------------

(defn prepare-report-for-exception [e]
  (let [stacktrace (utils/stacktrace-str e)]
    (str "```\n"
         "Exception: " stacktrace "\n"
         "```")))

(defn prepare-dummy-report [task]
  (str "a dummy report from task " (:name task)))

(defn prepare-and-commit-complete-report! [tasks options]
  (let [{:keys [test]} options
        commit-task {:name  "commit report"
                     :color :red}
        report (prepare-complete-report tasks options)]
    (announce (i18n/report-dump-msg report) 1 options)
    (write-file-to-workdir! (utils/pp options) options-file options)
    (write-file-to-workdir! (utils/pp tasks) tasks-file options)
    (write-file-to-workdir! (:content report) report-file options)
    (if test
      (do
        (announce (i18n/skipping-report-commit-msg))
        nil)
      (do
        (announce (i18n/performing-report-commit-msg))
        (with-task-printing commit-task options
          (commit-report! commit-task options))))))
