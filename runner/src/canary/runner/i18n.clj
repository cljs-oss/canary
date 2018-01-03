(ns canary.runner.i18n
  "Localizable messages."
  (:require [clojure.string :as string]
            [canary.runner.print :as print]
            [canary.runner.utils :as utils]))

; -- pluralization ----------------------------------------------------------------------------------------------------------

; poor man's solution to pluralization
; didn't want to bring in full-features inflections library as a new dependency

(def pluralization-table
  {"task" "tasks"})

(defn ^:dynamic pluralize [name count]
  (if (= count 1)
    name
    (if-let [plural-form (get pluralization-table name)]
      plural-form
      (do
        (assert false (str "Missing plural form for '" name "'. Please update pluralization-table."))
        name))))

; -- announcements ----------------------------------------------------------------------------------------------------------

(defn ^:dynamic running-task-msg [task verbosity]
  (let [details (str " " (print/task-description task))
        msg (str (print/emphasize "Running") " task " (print/task-name task))]
    (str msg (if (>= verbosity 1) details))))

(defn ^:dynamic skipping-task-msg [task verbosity]
  (let [reason (str " (" (:enabled-reason task) ")")
        msg (str (print/emphasize "Skipping") " task " (print/task-name task))]
    (str msg (if (>= verbosity 1) reason))))

(defn ^:dynamic waiting-for-tasks-msg [running-tasks]
  (let [task-count (count running-tasks)
        remaining-count (str task-count " remaining " (pluralize "task" task-count))
        remaining-tasks-list-items (map print/task-name running-tasks)
        remaining-tasks-list (if (> task-count 1)
                               (str (string/join ", " (butlast remaining-tasks-list-items))
                                    " and "
                                    (last remaining-tasks-list-items))
                               (first remaining-tasks-list-items))]
    (assert (pos? task-count))
    (str "Still waiting for " remaining-count "... (" remaining-tasks-list ")")))

(defn ^:dynamic job-timeout-error-msg [timeout]
  (str "Job timeouted (after " timeout "ms)"))

(defn ^:dynamic completed-task-msg [task]
  (str (print/emphasize "Completed") " task " (print/task-name task)))

(defn ^:dynamic job-completed-msg [result-tasks]
  (str "Job completed:\n" (print/dump (utils/pp result-tasks))))

(defn ^:dynamic job-failed-due-exception-msg [e]
  (str "Job failed due to an exception:\n" (utils/stacktrace-str e)))

(defn ^:dynamic running-job-msg [job-id]
  (str (print/emphasize "running") " " (print/job-name job-id)))

(defn ^:dynamic job-options-msg [options]
  (str "Job options:\n" (print/dump (utils/pp options))))

(defn ^:dynamic list-options-msg [options]
  (str "List options:\n" (print/dump (utils/pp options))))

(defn ^:dynamic building-compiler-msg [compiler-rev compiler-repo]
  (str (print/emphasize "Building")
       " compiler rev " (print/rev compiler-rev)
       " from " (print/url compiler-repo)))

(defn ^:dynamic report-commit-script-failed-msg [exit-code]
  (str "Report commit script failed (exit code " exit-code ")"))

(defn ^:dynamic report-dump-msg [report]
  (str "Report dump:\n" (print/dump (utils/pp report))))

(defn ^:dynamic performing-report-commit-msg []
  (str (print/emphasize "Performing") " report commit"))

(defn ^:dynamic requiring-namespace-msg [namespace]
  (str "Requiring namespace '" namespace "'"))

(defn ^:dynamic shell-task-exit-code [name status]
  (str "Shell task " name " exit-code: " status))

(defn ^:dynamic curl-command-msg [args]
  (str "> curl " (vec args)))

(defn ^:dynamic travis-response-msg [response production]
  (let [mocked-label (if-not production " (mocked)" "")]
    (str "Travis response" mocked-label ":\n" (print/dump (utils/pp response)))))

(defn ^:dynamic polling-travis-api-for-request-info-msg [slug request-id]
  (str "Polling Travis API for request info " (print/request-label slug request-id)))

(defn ^:dynamic travis-request-response-dump-msg [request-response]
  (str "Travis request response dump:\n" (print/dump (utils/pp request-response))))

(defn ^:dynamic travis-request-is-running-msg [request-response]
  (str "Travis request " (print/request-label request-response) " is running"))

(defn ^:dynamic travis-request-is-done-msg [request-response]
  (str "Travis request " (print/request-label request-response) " is done"))

(defn ^:dynamic travis-build-update-msg [slug build-number build-state]
  (str "Travis build " (print/repo-slug slug) (print/travis-build-number build-number) " => " build-state))

(defn ^:dynamic travis-build-url-msg [url]
  (str "Travis build url: " (print/travis-url url)))

(defn ^:dynamic travis-report-data-dump-msg [report-data]
  (str "Travis report data:\n" (print/dump (utils/pp report-data))))

(defn ^:dynamic triggering-travis-build-msg [slug]
  (str "Triggering Travis build of " (print/repo-slug slug) " and waiting for results..."))

(defn ^:dynamic trigger-travis-build-inspect-msg [slug token-var-name options]
  (str "Invoked trigger-build! " slug " " token-var-name "\n" (print/dump (utils/pp options))))

; -- exceptions -------------------------------------------------------------------------------------------------------------

(defn ^:dynamic cli-errors-msg [errors]
  (str "The following errors occurred while parsing your command:\n"
       (string/join \newline (map #(str "  * " %) errors))))

(defn ^:dynamic cli-validation-msg [errors]
  (str "The following issues occurred while interpreting your command:\n"
       (string/join \newline (map #(str "  * " %) errors))))

(defn ^:dynamic api-invalid-json-response-msg [error response]
  (str "Travis API responded with invalid JSON: " error "\n" response))

(defn ^:dynamic api-token-not-set-msg [token-var-name]
  (str "Travis API token '" token-var-name "' not set in the environment"))

(defn ^:dynamic curl-failed-msg [curl-args error]
  (str "Error: curl failed while talking to Travis:\n" (vec curl-args) "\n" error))

(defn ^:dynamic env-file-problem-msg [path reason]
  (str "Unable to to read env EDN file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn ^:dynamic result-file-problem-msg [path reason]
  (str "Unable to to read env EDN file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn ^:dynamic projects-dir-not-exists-msg [projects-dir]
  (str "Projects directory does not exist at '" projects-dir "'"))

(defn ^:dynamic projects-dir-not-dir-msg [projects-dir]
  (str "Projects directory does not seem to be a readable directory at '" projects-dir "'"))

(defn ^:dynamic compiler-build-failed [exit-code]
  (str "Compiler build failed (exit code " exit-code))

(defn ^:dynamic unable-to-mock-travis-api-msg [cmd args]
  (str "Unable to mock Travis API: " cmd " " (pr-str args)))

(defn ^:dynamic received-unrecognized-travis-request-state [travis-state]
  (str "Received unrecognized Travis request state '" travis-state "'"))

; -- cli --------------------------------------------------------------------------------------------------------------------

(defn ^:dynamic cli-usage-msg [options-summary]
  (string/join \newline ["Exercises ClojureScript projects with a pinned ClojureScript version."
                         ""
                         "Usage: ./run.sh [action] [options]"
                         ""
                         "Actions:"
                         "  job         Run a new job with given options"
                         "  list        List available tasks (and test filters from options)"
                         "  help        Print this usage info"
                         ""
                         "Options:"
                         options-summary]))

(defn ^:dynamic no-cli-actions []
  "Received no command-line action argument. See `./run.sh help` for available actions.")

(defn ^:dynamic too-many-cli-actions [arguments]
  (str "Received too many command-line actions: " (vec arguments) ". See `./run.sh help` for available actions.\""))

(defn ^:dynamic compiler-rev-cli-desc []
  "Pin ClojureScript compiler to specific revision")

(defn ^:dynamic compiler-repo-cli-desc []
  "Git repo to fetch compiler sources from")

(defn ^:dynamic projects-cli-desc []
  "Path to projects directory")

(defn ^:dynamic workdir-cli-desc []
  "Path to working directory")

(defn ^:dynamic cachedir-cli-desc []
  "Path to caching directory. Persists state between runs for speedup")

(defn ^:dynamic only-cli-desc []
  "Enable tasks matching a substring (or any of space separated substrings)")

(defn ^:dynamic except-cli-desc []
  "Disable tasks matching a substring (or any of space separated substrings)")

(defn ^:dynamic include-cli-desc []
  "Enable tasks matching a regex")

(defn ^:dynamic exclude-cli-desc []
  "Disable tasks matching a regex")

(defn ^:dynamic job-id-cli-desc []
  "Optional job id")

(defn ^:dynamic polling-interval-cli-desc []
  "Polling interval for job status (in seconds)")

(defn ^:dynamic timeout-cli-desc []
  "Total timeout for job to complete (in seconds)")

(defn ^:dynamic production-cli-desc []
  "Will not commit into results branch")

(defn ^:dynamic verbosity-cli-desc []
  "Verbosity level; may be specified multiple times")

