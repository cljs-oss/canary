(ns canary.runner.i18n
  "Localizable messages."
  (:require [clojure.string :as string]
            [canary.runner.print :as print]
            [canary.runner.utils :as utils]))

; -- announcements ----------------------------------------------------------------------------------------------------------

(defn ^:dynamic running-task-msg [task verbosity]
  (let [details (str " " (print/task-description task))
        msg (str (print/emphasize "running") " task " (print/task-name task))]
    (str msg (if (>= verbosity 1) details))))

(defn ^:dynamic skipping-task-msg [task verbosity]
  (let [reason (str " (" (:enabled-reason task) ")")
        msg (str (print/emphasize "skipping") " task " (print/task-name task))]
    (str msg (if (>= verbosity 1) reason))))

(defn ^:dynamic still-waiting-msg [iteration]
  (str "still waiting ... #" iteration))

(defn ^:dynamic job-timeout-error-msg [timeout]
  (str "the job timeouted (after " timeout "ms)"))

(defn ^:dynamic dummy-test-task-msg []
  (str "[test mode] not executing, just providing a dummy report"))

(defn ^:dynamic completed-task-msg [task]
  (str (print/emphasize "completed") " task " (print/task-name task)))

(defn ^:dynamic job-completed-msg [result-tasks]
  (str "the job completed:\n" (utils/pp result-tasks)))


(defn ^:dynamic job-failed-due-exception-msg [e]
  (str "Job failed due to an exception:\n" (utils/stacktrace-str e)))

(defn ^:dynamic running-job-msg [job-id]
  (str (print/emphasize "running") " " (print/job-name job-id)))

(defn ^:dynamic job-options-msg [options]
  (str "job options:\n" (utils/pp options)))

(defn ^:dynamic skipping-building-compiler-msg [compiler-rev compiler-repo]
  (str (print/emphasize "skipping building")
       " compiler rev " (print/rev compiler-rev)
       " from " (print/url compiler-repo)))

(defn ^:dynamic building-compiler-msg [compiler-rev compiler-repo]
  (str (print/emphasize "building")
       " compiler rev " (print/rev compiler-rev)
       " from " (print/url compiler-repo)))

(defn ^:dynamic report-commit-script-failed-msg [exit-code]
  (str "report commit script failed (exit code " exit-code ")"))

(defn ^:dynamic report-dump-msg [report]
  (str "report:\n" (utils/pp report)))

(defn ^:dynamic skipping-report-commit-msg []
  (str (print/emphasize "skipping") " report commit"))

(defn ^:dynamic performing-report-commit-msg []
  (str (print/emphasize "performing") " report commit"))

(defn ^:dynamic requiring-namespace-msg [namespace]
  (str "requiring namespace '" namespace "'"))

(defn ^:dynamic shell-task-exit-code [name status]
  (str "shell task " name " exit-code: " status))

(defn ^:dynamic curl-command-msg [args]
  (str "> curl " (vec args)))

(defn ^:dynamic travis-response-msg [response production]
  (let [mocked-label (if-not production "(mocked) " "")]
    (str mocked-label "Travis response:\n" (utils/pp response))))

(defn ^:dynamic polling-travis-api-for-request-info-msg [slug request-id]
  (str "Polling travis API for request info " (print/request-label slug request-id)))

(defn ^:dynamic travis-request-is-running-msg [request-response]
  (str "Travis request " (print/request-label request-response) " is running"))

(defn ^:dynamic travis-request-response-dump-msg [request-response]
  (utils/pp request-response))

(defn ^:dynamic travis-request-is-done-msg [request-response]
  (str "Travis request " (print/request-label request-response) " is done"))

(defn ^:dynamic travis-build-update-msg [slug build-number build-state]
  (str "Travis build " (print/repo-slug slug) (print/travis-build-number build-number)
       " => " build-state))

(defn ^:dynamic travis-build-url-msg [url]
  (str "Travis build url: " (print/travis-url url)))

(defn ^:dynamic travis-report-data-dump-msg [report-data]
  (str "report data:\n" (utils/pp report-data)))

(defn ^:dynamic triggering-travis-build-msg [slug]
  (str "Triggering Travis build of " (print/repo-slug slug) " and waiting for results..."))

(defn ^:dynamic trigger-travis-build-inspect-msg [slug token-var-name options]
  (str "trigger-build! " slug " " token-var-name "\n" (utils/pp options)))

; -- exceptions -------------------------------------------------------------------------------------------------------------

(defn ^:dynamic cli-usage-msg [options-summary]
  (string/join \newline ["Exercises ClojureScript projects with a pinned ClojureScript version."
                         ""
                         "Usage: ./run.sh job [options]"
                         ""
                         "Options:"
                         options-summary]))

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
  (str "Unable to to read env edn file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn ^:dynamic result-file-problem-msg [path reason]
  (str "Unable to to read env edn file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn ^:dynamic projects-dir-not-exists-msg [projects-dir]
  (str "Projects directory does not exist at '" projects-dir "'"))

(defn ^:dynamic projects-dir-not-dir-msg [projects-dir]
  (str "Projects directory does not seem to be a readable directory at '" projects-dir "'"))

(defn ^:dynamic compiler-build-failed [exit-code]
  (str "compiler build failed (exit code " exit-code))

(defn ^:dynamic unable-to-mock-travis-api-msg [cmd args]
  (str "Unable to mock Travis API: " cmd " " (pr-str args)))

(defn ^:dynamic travis-request-didnt-complete-in-time [slug request-id]
  (str "Travis request #" request-id " for " slug " didn't complete in time"))

(defn ^:dynamic received-unrecognized-travis-request-state [travis-state]
  (str "Received unrecognized Travis request state '" travis-state "'"))
