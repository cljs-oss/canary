(ns cljs-oss.runner
  "Command-line interface and the main entry point."
  (:require [clojure.string :as string]
            [clojure.tools.cli :as cli]
            [cljs-oss.tools.jobs :as jobs]
            [cljs-oss.tools.utils :as utils])
  (:gen-class))

(def cli-options
  [["-c" "--compiler" "Pin ClojureScript compiler git SHA" :default "HEAD"]
   ["-p" "--projects" "Path to projects directory" :default "src/cljs_oss/projects"]
   ["-v" "--verbose"]
   ["-h" "--help"]])

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
  (System/exit status))

(defn sanitize-options [options]
  (assoc options
    :projects (utils/canonical-path (:projects options))))

(defn run-job! [options]
  (let [sanitized-options (sanitize-options options)]
    (jobs/run! sanitized-options)))

; -- main entry point -------------------------------------------------------------------------------------------------------

(defn -main [& args]
  (let [{:keys [options errors summary]} (cli/parse-opts args cli-options)]
    (cond
      errors (exit 1 (error-msg errors))
      (:help options) (exit 0 (usage summary))
      :else (run-job! options)))
  (exit 0))
