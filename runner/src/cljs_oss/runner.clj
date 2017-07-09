(ns cljs-oss.runner
  (:require [clojure.string :as string]
            [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def cli-options
  [["-i" "--input " "TODO" :default "something"]
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

(defn exit [status msg]
  (println msg)
  (System/exit status))

(defn run-job! [options]
  (println "TODO: run job with options: " options))

(defn -main [& args]
  (let [{:keys [options errors summary]} (parse-opts args cli-options)]
    (cond
      (:help options) (exit 0 (usage summary))
      errors (exit 1 (error-msg errors)))
    (run-job! options)))
