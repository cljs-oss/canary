(ns cljs-oss.tools.jobs
  "Interface for working with canary jobs."
  (:refer-clojure :exclude [run!])
  (:require [cljs-oss.tools.utils :refer [pp]]
            [cljs-oss.tools.scanner :as scanner]
            [cljs-oss.tools.tasks :as tasks]))

(defn run-task! [task options]
  (when (:verbose options)
    (println "running task" (:id task)))
  (let [task-fn (:fn task)]
    (task-fn options)))

(defn run-tasks! [tasks options]
  ; TODO: we should run them in parallel and present output in a nice way, like lein-cooper
  (doseq [task tasks]
    (run-task! task options)))

(defn run! [options]
  (when (:verbose options)
    (println "running a job with options:\n" (pp options)))
  (let [effective-tasks (scanner/collect-effective-tasks! options)]
    (run-tasks! effective-tasks options)))
