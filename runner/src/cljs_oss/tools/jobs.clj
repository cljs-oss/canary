(ns cljs-oss.tools.jobs
  "Interface for working with canary jobs."
  (:refer-clojure :exclude [run!])
  (:require [clojure.core.async :as async]
            [cljs-oss.tools.utils :refer [pp]]
            [cljs-oss.tools.scanner :as scanner]
            [cljs-oss.tools.tasks :as tasks]
            [cljs-oss.tools.utils :as utils]))

(defn run-task! [task options]
  (when (:verbose options)
    (utils/announce "running task" (:id task)))
  (let [task-fn (:fn task)]
    (task-fn options)))

(defn spawn-task! [task options]
  (async/thread (run-task! task options)))

(defn launch-tasks! [tasks options]
  (let [* (fn [task]
            [(spawn-task! task options) (assoc task :running true)])]
    (doall (into {} (map * tasks)))))

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
              (utils/announce "still waiting ..." iteration)
              (recur (inc iteration) running-tasks completed-tasks))
            (let [completed-task (get running-tasks completed-channel)
                  new-running-tasks (dissoc running-tasks completed-channel)
                  new-completed-tasks (conj completed-tasks (assoc completed-task
                                                              :result result
                                                              :running false))]
              (utils/announce "completed task" (:id completed-task))
              (recur (inc iteration) new-running-tasks new-completed-tasks))))))))

(defn spawn-runner! [tasks options]
  (async/thread (run-tasks! tasks options)))

(defn timeout-error-message [options]
  (str "the job timeouted (after " (:timeout options) "ms)"))

(defn run! [options]
  (when (:verbose options)
    (utils/announce "running a job with options:\n" (pp options)))
  (let [effective-tasks (scanner/collect-effective-tasks! options)
        running-runner (spawn-runner! effective-tasks options)
        timeout-channel (utils/timeout (:timeout options))
        [result completed-channel] (async/alts!! [timeout-channel running-runner])]
    (if (= completed-channel timeout-channel)
      (do
        (utils/announce (timeout-error-message options))
        2)
      (do
        (when (:verbose options)
          (utils/announce "the job completed:\n" (utils/pp result)))
        ; TODO: process results
        0))))
