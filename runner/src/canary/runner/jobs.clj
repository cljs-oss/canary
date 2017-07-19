(ns canary.runner.jobs
  "Interface for working with canary jobs."
  (:refer-clojure :exclude [run!])
  (:require [clojure.core.async :as async]
            [canary.runner.utils :refer [pp]]
            [canary.runner.scan :as scan]
            [canary.runner.tasks :as tasks]
            [canary.runner.utils :as utils]
            [canary.runner.build :as build]
            [canary.runner.report :as report]
            [canary.runner.print :as print :refer [announce with-job-printing with-task-printing]]
            [canary.runner.i18n :as i18n]
            [canary.runner.env :as env]))

(defn dev? []
  (some? (env/get "CANARY_DEBUG")))

(defn just-test-task [task options]
  (announce (i18n/dummy-test-task-msg))
  {:report (report/prepare-dummy-report task)})

(defn execute-task! [task options]
  (let [task-fn (:fn task)]
    ; TODO: validate task result here for cases when tasks return nothing or malformed result
    (task-fn (with-meta options task))))

(defn run-task! [task options]
  (if (:test options)
    (just-test-task task options)
    (execute-task! task options)))

(defn try-run-task! [task options]
  (with-task-printing task options
    (try
      (run-task! task options)
      (catch Throwable e
        (if (dev?)
          (throw e)
          (do
            (announce (utils/stacktrace-str e))
            {:status :exception
             :report (report/prepare-report-for-exception e)}))))))

(defn spawn-task! [task options]
  (async/thread (utils/kill-process-on-failure (try-run-task! task options))))

(defn launch-task! [task options]
  (announce (i18n/running-task-msg task (:verbosity options)))
  (spawn-task! task options))

(defn launch-tasks! [tasks options]
  (let [enabled-tasks (filter :enabled tasks)
        * (fn [tasks task]
            (assoc tasks (launch-task! task options) (assoc task :running true)))]
    (doall (reduce * {} enabled-tasks))))

(defn report-disabled-tasks [tasks options]
  (let [disabled-tasks (remove :enabled tasks)]
    (doseq [task disabled-tasks]
      (announce (i18n/skipping-task-msg task (:verbosity options))))))

(defn run-tasks! [tasks options]
  (report-disabled-tasks tasks options)
  (loop [running-tasks (launch-tasks! tasks options)                                                                          ; channel -> task mappings
         completed-tasks (vec (remove :enabled tasks))]                                                                       ; disabled tasks are considered instantly completed
    (if (empty? running-tasks)
      completed-tasks
      (let [timeout-channel (utils/timeout (:polling-interval options))
            all-channels (concat [timeout-channel] (keys running-tasks))]
        (let [[result completed-channel] (async/alts!! all-channels)]
          (if (= completed-channel timeout-channel)
            (do
              (announce (i18n/waiting-for-tasks-msg running-tasks))
              (recur running-tasks completed-tasks))
            (let [completed-task (dissoc (get running-tasks completed-channel) :running)
                  new-running-tasks (dissoc running-tasks completed-channel)
                  new-completed-tasks (conj completed-tasks (assoc completed-task
                                                              :result result))]
              (announce (i18n/completed-task-msg completed-task))                                                             ; TODO: add timing info
              (recur new-running-tasks new-completed-tasks))))))))

(defn spawn-runner! [tasks options]
  (async/thread (utils/kill-process-on-failure (run-tasks! tasks options))))

(defn cleanup-result-tasks [tasks]
  (let [cleanup (fn [task]
                  (dissoc task :fn))]
    (map cleanup tasks)))

(defn build-compiler-if-needed! [options]
  (if (some? (:build-result options))
    options
    (assoc options :build-result (build/prepare-compiler! options))))

(defn run-naked! [options]
  (with-job-printing options
    (announce (i18n/running-job-msg (:job-id options)))
    (announce (i18n/job-options-msg options) 1 options)
    (let [options-with-build-result (build-compiler-if-needed! options)
          analyzed-tasks (scan/collect-and-analyze-all-tasks! options-with-build-result)
          running-runner (spawn-runner! analyzed-tasks options-with-build-result)
          timeout-channel (utils/timeout (:timeout options-with-build-result))
          [result completed-channel] (async/alts!! [timeout-channel running-runner])]
      (if (= completed-channel timeout-channel)
        (do
          (announce (i18n/job-timeout-error-msg (:timeout options-with-build-result)))
          2)
        (let [result-tasks (cleanup-result-tasks result)
              enabled-tasks (filter :enabled result-tasks)
              all-passed? (every? tasks/task-passed? enabled-tasks)]
          (announce (i18n/job-completed-msg result-tasks) 1 options-with-build-result)
          ; TODO: add timing info
          (report/prepare-and-commit-complete-report! result-tasks options-with-build-result)
          (if all-passed? 0 1))))))

(defn run! [options]
  (try
    (run-naked! options)
    (catch Throwable e
      (if (dev?)
        (throw e)
        (do
          (announce (i18n/job-failed-due-exception-msg e))
          9)))))
