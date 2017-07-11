(ns cljs-oss.runner
  "Command-line interface and the main entry point."
  (:require [clojure.string :as string]
            [clojure.tools.cli :as cli]
            [cljs-oss.tools.jobs :as jobs]
            [cljs-oss.tools.utils :as utils]
            [cljs-oss.tools.cli :refer [timeout-cli-option normal-cli-option]]
            [cljs-oss.tools.output :as output])
  (:gen-class))

(def default-compiler-sha "HEAD")
(def default-projects-dir "src/cljs_oss/projects")
(def default-timeout (utils/seconds-to-msec (* 60 10)))
(def default-polling-interval (utils/seconds-to-msec 1))

(def cli-options
  [(normal-cli-option
     ["-c" "--compiler SHA" "Pin ClojureScript compiler git SHA" :default default-compiler-sha])
   (normal-cli-option
     ["-p" "--projects DIR" "Path to projects directory" :default default-projects-dir])
   (normal-cli-option
     [nil "--only SUBSTR" "Run only tasks matching a substring"])
   (normal-cli-option
     [nil "--job-id ID" "Optional job id"])
   (timeout-cli-option
     [nil "--polling-interval SECONDS" "Polling interval for job status (in seconds)" :default default-polling-interval])
   (timeout-cli-option
     [nil "--timeout SECONDS" "Total timeout for job to complete (in seconds)" :default default-timeout])
   (normal-cli-option
     [nil "--production" "Will not commit into results branch" :default true])
   (normal-cli-option
     ["-t" "--test" "Do not launch any tasks. Useful for testing which task will be executed."])
   (normal-cli-option
     ["-v" "--verbose"])
   (normal-cli-option
     ["-h" "--help"])])

(defn usage [options-summary]
  (string/join \newline ["Exercises ClojureScript libraries with pinned ClojureScript version."
                         ""
                         "Usage: ./run.sh job [options]"
                         ""
                         "Options:"
                         options-summary]))

(defn error-msg [errors]
  (str "The following errors occurred while parsing your command:\n\n"
       (string/join \newline errors)))

(defn exit [status & [msg]]
  (if (some? msg)
    (println msg))
  (output/flush-outputs!)
  (System/exit status))

(defn sanitize-options [options]
  (assoc options
    :projects (utils/canonical-path (:projects options))))

(defn run-job! [options]
  (let [sanitized-options (sanitize-options options)
        status (jobs/run! sanitized-options)]
    status))

; -- main entry point -------------------------------------------------------------------------------------------------------

(defn -main [& args]
  (let [{:keys [options errors summary]} (cli/parse-opts args cli-options)]
    (cond
      errors (exit 1 (error-msg errors))
      (:help options) (exit 0 (usage summary))
      :else (exit (run-job! options)))))
