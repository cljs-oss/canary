(ns canary.runner
  "Command-line interface and the main entry point."
  (:require [clojure.string :as string]
            [clojure.tools.cli :as cli]
            [canary.tools.jobs :as jobs]
            [canary.tools.utils :as utils]
            [canary.tools.cli :refer [timeout-cli-option normal-cli-option verbosity-cli-option]]
            [canary.tools.output :as output])
  (:gen-class))

(def default-compiler-rev "master")
(def default-compiler-repo "https://github.com/clojure/clojurescript.git")
(def default-projects-dir "src/canary/projects")
(def default-work-dir ".workdir")
(def default-timeout (utils/seconds-to-msec (* 60 60)))                                                                       ; 60min
(def default-polling-interval (utils/seconds-to-msec (* 60 5)))                                                               ; 5min, travis kills a job when no output is presented in last 10min

(def cli-options
  [(normal-cli-option
     ["-r" "--compiler-rev REV" "Pin ClojureScript compiler to specific revision" :default default-compiler-rev])
   (normal-cli-option
     [nil "--compiler-repo URL" "Git repo to fetch compiler sources from" :default default-compiler-repo])
   (normal-cli-option
     ["-p" "--projects DIR" "Path to projects directory" :default default-projects-dir])
   (normal-cli-option
     [nil "--workdir DIR" "Path to working directory" :default default-work-dir])
   (normal-cli-option
     [nil "--only SUBSTR" "Run only tasks matching a substring"])
   (normal-cli-option
     [nil "--job-id ID" "Optional job id" :default "test"])
   (timeout-cli-option
     [nil "--polling-interval SECONDS" "Polling interval for job status (in seconds)" :default default-polling-interval])
   (timeout-cli-option
     [nil "--timeout SECONDS" "Total timeout for job to complete (in seconds)" :default default-timeout])
   (normal-cli-option
     [nil "--production" "Will not commit into results branch"])
   (normal-cli-option
     ["-t" "--test" "Do not launch any tasks. Useful for testing which task will be executed."])
   (verbosity-cli-option
     ["-v" nil "Verbosity level; may be specified multiple times"])
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

(defn expand-paths [options]
  (assoc options
    :projects (utils/canonical-path (:projects options))
    :workdir (utils/canonical-path (:workdir options))))

(defn prevent-verbose-mode-in-production [options]
  (if (and (:production options) (pos? (:verbosity options)))
    (do
      (println (str "Note: Verbose mode is not allowed in production because it could leak secret env variables. "
                    "Using non-verbose mode instead."))
      (assoc options :verbosity 0))
    options))

(defn sanitize-options [options]
  (-> options
      (expand-paths)
      (prevent-verbose-mode-in-production)))

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
