(ns cljs-oss.tools.jobs
  "Interface for working with canary jobs."
  (:refer-clojure :exclude [run!])
  (:require [clojure.core.async :as async]
            [cljs-oss.tools.utils :refer [pp]]
            [cljs-oss.tools.scanner :as scanner]
            [cljs-oss.tools.tasks :as tasks]
            [cljs-oss.tools.utils :as utils]
            [cljs-oss.tools.printing :as printing :refer [announce with-job-printing with-task-printing]]))

(defn just-test-task [task options]
  (announce "[test mode] not executing, just providing a dummy report")
  {:report (str "test report from task " (:name task))})

(defn execute-task! [task options]
  (let [task-fn (:fn task)]
    (task-fn (with-meta options task))))

(defn run-task! [task options]
  (with-task-printing task options
    (if (:test options)
      (just-test-task task options)
      (execute-task! task options))))

(defn try-run-task! [task options]
  (try
    (run-task! task options)
    (catch Exception e
      ; convert exceptions to task results in production
      (if (:production options)
        {:status    :exception
         :exception (.getMessage e)}
        (throw e)))))

(defn spawn-task! [task options]
  (async/thread (try-run-task! task options)))

(defn launch-task! [task options]
  (let [details (str " " (printing/task-description task))
        announcement (str (printing/emphasize "running") " task " (printing/task-name task))]
    (announce (str announcement (if (:verbose options) details))))
  (spawn-task! task options))

(defn launch-tasks! [tasks options]
  (let [enabled-tasks (filter :enabled tasks)
        * (fn [tasks task]
            (assoc tasks (launch-task! task options) (assoc task :running true)))]
    (doall (reduce * {} enabled-tasks))))

(defn report-disabled-tasks [tasks options]
  (let [disabled-tasks (remove :enabled tasks)]
    (doseq [task disabled-tasks]
      (let [reason (str " (" (:reason task) ")")
            announcement (str (printing/emphasize "skipping") " task " (printing/task-name task))]
        (announce (str announcement (if (:verbose options) reason)))))))

(defn run-tasks! [tasks options]
  (report-disabled-tasks tasks options)
  (loop [iteration 0
         running-tasks (launch-tasks! tasks options)                                                                          ; channel -> task mappings
         completed-tasks (vec (remove :enabled tasks))]                                                                       ; disabled tasks are considered instantly completed
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
              (when (:verbose options)
                (announce "completed task" (printing/task-name completed-task)))
              (recur (inc iteration) new-running-tasks new-completed-tasks))))))))

(defn spawn-runner! [tasks options]
  (async/thread (run-tasks! tasks options)))

(defn timeout-error-message [options]
  (str "the job timeouted (after " (:timeout options) "ms)"))

(defn preprocess-result-tasks [tasks]
  (let [* (fn [task]
            (dissoc task :fn))]
    (map * tasks)))

(defn run! [options]
  (with-job-printing options
    (when (:verbose options)
      (announce "running a job with options:\n" (pp options)))
    (let [analyzed-tasks (scanner/collect-analyzed-tasks! options)
          running-runner (spawn-runner! analyzed-tasks options)
          timeout-channel (utils/timeout (:timeout options))
          [result completed-channel] (async/alts!! [timeout-channel running-runner])]
      (if (= completed-channel timeout-channel)
        (do
          (announce (timeout-error-message options))
          2)
        (let [result-tasks (preprocess-result-tasks result)]
          (when (:verbose options)
            (announce "the job completed:\n" (utils/pp result-tasks)))
          ; TODO: process results
          ; TODO: add timing info
          0)))))
