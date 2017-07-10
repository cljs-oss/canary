(ns cljs-oss.tools.jobs
  "Interface for working with canary jobs."
  (:refer-clojure :exclude [run!])
  (:require [clojure.core.async :as async]
            [cljs-oss.tools.utils :refer [pp]]
            [cljs-oss.tools.scanner :as scanner]
            [cljs-oss.tools.tasks :as tasks]
            [cljs-oss.tools.utils :as utils]
            [cljs-oss.tools.printing :as printing :refer [announce with-job-printing with-task-printing]]))

(defn assign-task-colors [tasks]
  (map #(assoc %1 :color %2) tasks printing/palette))

(defn run-task! [task options]
  (when (:verbose options)
    (announce "running task" (printing/task-name task)))
  (with-task-printing task options
    (let [task-fn (:fn task)]
      (task-fn (with-meta options task)))))

(defn spawn-task! [task options]
  (async/thread (run-task! task options)))

(defn launch-tasks! [tasks options]
  (let [* (fn [task]
            [(spawn-task! task options) (assoc task :running true)])]
    (doall (into {} (map * tasks)))))

(with-out-str)

(defn run-tasks! [tasks options]
  ; TODO: present output in a nice way, like lein-cooper
  (loop [iteration 0
         running-tasks (launch-tasks! tasks options)                                                                          ; channel -> task mappings
         completed-tasks []]
    (if (empty? running-tasks)
      completed-tasks
      (let [timeout-channel (utils/timeout (:polling-interval options))
            all-channels (concat [timeout-channel] (keys running-tasks))]
        (let [[result completed-channel] (async/alts!! all-channels)]
          (if (= completed-channel timeout-channel)
            (do
              (announce "still waiting ..." iteration)
              (recur (inc iteration) running-tasks completed-tasks))
            (let [completed-task (get running-tasks completed-channel)
                  new-running-tasks (dissoc running-tasks completed-channel)
                  new-completed-tasks (conj completed-tasks (assoc completed-task
                                                              :result result
                                                              :running false))]
              (announce "completed task" (printing/task-name completed-task))
              (recur (inc iteration) new-running-tasks new-completed-tasks))))))))

(defn spawn-runner! [tasks options]
  (async/thread (run-tasks! tasks options)))

(defn timeout-error-message [options]
  (str "the job timeouted (after " (:timeout options) "ms)"))

(defn run! [options]
  (with-job-printing options
    (when (:verbose options)
      (announce "running a job with options:\n" (pp options)))
    (let [effective-tasks (scanner/collect-effective-tasks! options)
          colored-tasks (assign-task-colors effective-tasks)
          running-runner (spawn-runner! colored-tasks options)
          timeout-channel (utils/timeout (:timeout options))
          [result completed-channel] (async/alts!! [timeout-channel running-runner])]
      (if (= completed-channel timeout-channel)
        (do
          (announce (timeout-error-message options))
          2)
        (do
          (when (:verbose options)
            (announce "the job completed:\n" (utils/pp result)))
          ; TODO: process results
          0)))))
