(ns canary.runner.jobs
  "Interface for working with canary jobs."
  (:refer-clojure :exclude [run!])
  (:require [clojure.core.async :as async]
            [cuerdas.core :as cuerdas]
            [canary.runner.utils :refer [pp]]
            [canary.runner.scan :as scan]
            [canary.runner.tasks :as tasks]
            [canary.runner.utils :as utils]
            [canary.runner.build :as build]
            [canary.runner.report :as report]
            [canary.runner.print :refer [announce with-job-printing with-task-printing]]
            [canary.runner.threads :as threads]
            [canary.runner.i18n :as i18n]
            [canary.runner.defaults :as defaults])
  (:import (java.util.concurrent RejectedExecutionException)))

(defonce tasks-executor (threads/make-executor "canary-async-task-%d"))
(defonce runner-executor (threads/make-executor "canary-async-runner-%d"))

(defn execute-task! [task options]
  (with-task-printing task options
    (let [task-fn (:fn task)]
      ; TODO: validate task result here for cases when tasks return nothing or malformed result
      (task-fn (with-meta options task)))))

(defn try-execute-task! [task options]
  (try
    (announce (i18n/running-task-msg task (:verbosity options)))
    (let [result (execute-task! task options)]
      (announce (i18n/completed-task-msg task))
      result)
    (catch InterruptedException e
      (announce (i18n/interrupted-task-msg task (utils/stacktrace-str e)))
      {:status :interrupted})
    (catch RejectedExecutionException e
      (announce (i18n/interrupted-task-msg task (utils/stacktrace-str e)))
      {:status :interrupted})
    (catch Throwable e
      (announce (i18n/errored-task-msg task (utils/stacktrace-str e)))
      {:status :exception
       :report (report/prepare-report-for-exception e)})))

(defn spawn-task! [task options]
  (threads/spawn-thread tasks-executor
    (try-execute-task! task options)))

(defn launch-task! [task options]
  (spawn-task! task options))

(defn launch-tasks! [tasks state-atom options]
  (let [enabled-tasks (filter :enabled tasks)
        * (fn [tasks task]
            (case task
              ::delay (let [delay (:spawning-delay options)]
                        (if (pos? delay)
                          (Thread/sleep delay))
                        tasks)
              (let [new-tasks (assoc tasks (launch-task! task options) (assoc task :running true))]
                (swap! state-atom assoc :running-tasks (vals new-tasks))
                new-tasks)))]
    (doall (reduce * {} (interpose ::delay enabled-tasks)))))

(defn report-disabled-tasks [tasks options]
  (let [disabled-tasks (remove :enabled tasks)]
    (doseq [task disabled-tasks]
      (announce (i18n/skipping-task-msg task (:verbosity options))))))

(defn run-tasks! [tasks state-atom options]
  (report-disabled-tasks tasks options)
  (loop [running-tasks-mapping (launch-tasks! tasks state-atom options)                                                       ; channel -> task mappings
         completed-tasks (vec (remove :enabled tasks))]                                                                       ; disabled tasks are considered instantly completed
    (reset! state-atom {:running-tasks   (vals running-tasks-mapping)
                        :completed-tasks completed-tasks})
    (if (empty? running-tasks-mapping)
      completed-tasks
      (let [timeout-channel (utils/timeout (:polling-interval options))
            all-channels (concat [timeout-channel] (keys running-tasks-mapping))]
        (let [[result completed-channel] (async/alts!! all-channels)]
          (if (= completed-channel timeout-channel)
            (do
              (announce (i18n/waiting-for-tasks-msg (tasks/sort-tasks (vals running-tasks-mapping))))
              (recur running-tasks-mapping completed-tasks))
            (let [completed-task (dissoc (get running-tasks-mapping completed-channel) :running)
                  new-running-tasks (dissoc running-tasks-mapping completed-channel)
                  new-completed-tasks (conj completed-tasks (assoc completed-task
                                                              :result result))]
              (recur new-running-tasks new-completed-tasks))))))))

(defn try-execute-runner! [tasks state-atom options]
  (try
    (run-tasks! tasks state-atom options)
    (catch InterruptedException _e
      (announce (i18n/interrupted-task-runner-msg))
      nil)))

(defn spawn-runner! [tasks state-atom options]
  (utils/rethrow-result-exceptions
    (threads/spawn-thread runner-executor
      (utils/catch-exceptions-as-result
        (try-execute-runner! tasks state-atom options)))))

(defn cleanup-result-tasks [tasks]
  (let [cleanup (fn [task]
                  (dissoc task :fn :color))]
    (map cleanup tasks)))

(defn build-compiler-if-needed! [options]
  (if (some? (:build-result options))
    options
    (assoc options :build-result (build/build-compiler! options))))

(defn mark-task-as-timeouted [task]
  (assoc task :result {:status :timeout
                       :report "The task has timeouted."}))

(defn interrupt-all-tasks [timeout-ms]
  (threads/interrupt-executor tasks-executor timeout-ms))

(defn interrupt-runner [timeout-ms]
  (threads/interrupt-executor runner-executor timeout-ms))

(defn interrupt-background-threads [_options]
  (interrupt-all-tasks (utils/seconds-to-msec 10))
  (Thread/sleep (utils/seconds-to-msec 3))
  (interrupt-runner (utils/seconds-to-msec 10)))

(defn run-naked! [options]
  (with-job-printing options
    (announce (i18n/running-job-msg (:job-id options)))
    (announce (i18n/job-options-msg options) 2 options)
    (let [runner-state-atom (atom {:running-tasks   []
                                   :completed-tasks []})
          options-with-build-result (build-compiler-if-needed! options)
          analyzed-tasks (scan/collect-and-analyze-all-tasks! options-with-build-result)
          running-runner (spawn-runner! analyzed-tasks runner-state-atom options-with-build-result)
          timeout-channel (utils/timeout (:timeout options-with-build-result))
          [result completed-channel] (async/alts!! [timeout-channel running-runner])]
      (if (= completed-channel timeout-channel)
        (let [runner-state-snapshot @runner-state-atom]
          (announce (i18n/job-timeout-error-msg (:timeout options-with-build-result)))
          (announce (i18n/interrupting-all-tasks-msg))
          (interrupt-background-threads options)

          ; we attempt to prepare at least partial report where we present completed tasks as usual
          ; and unfinished tasks marked as timeouted
          ; we use runner-state-atom to get latest state from spawn-runner!
          (announce (i18n/mark-interrupted-tasks-msg))
          (let [interrupted-tasks (get runner-state-snapshot :running-tasks)
                completed-tasks (get runner-state-snapshot :completed-tasks)
                timeouted-tasks (map mark-task-as-timeouted interrupted-tasks)
                all-tasks (concat completed-tasks timeouted-tasks)
                result-tasks (tasks/sort-tasks (cleanup-result-tasks all-tasks))]
            (announce (i18n/job-completed-msg result-tasks) 1 options-with-build-result)
            (report/prepare-and-commit-complete-report! result-tasks options-with-build-result))
          2)
        (let [result-tasks (tasks/sort-tasks (cleanup-result-tasks result))
              enabled-tasks (filter :enabled result-tasks)
              all-passed? (every? tasks/task-passed? enabled-tasks)]
          (announce (i18n/job-completed-msg result-tasks) 1 options-with-build-result)
          ; TODO: add timing info
          (let [report-ok? (report/prepare-and-commit-complete-report! result-tasks options-with-build-result)]
            (if report-ok?
              (if all-passed? 0 1)
              33)))))))

(defn run! [options]
  (try
    (run-naked! options)
    (catch Throwable e
      (announce (i18n/job-failed-due-exception-msg e))
      9)))

(defn list! [options]
  (announce (i18n/list-options-msg options) 2 options)
  (let [tasks (scan/collect-and-analyze-all-tasks! options)]
    (println (str "Available tasks found at '" (:projects options) "'"))
    (doseq [task tasks]
      (let [padded-name (cuerdas/pad (:name task) {:type   :right
                                                   :length defaults/task-label-padding})
            enabled-marker (if (:enabled task) "\u2713" "\u2717")]
        (println (str "  " enabled-marker " " padded-name "  " (:description task)))))
    (if (zero? (:verbosity options))
      (do
        (println)
        (println "Tasks marked with \u2713 would be executed. They are matching your filtering options.")
        (print "You may run this command in verbose mode to see the exact reason."))
      (do
        (println)
        (println "Reasons for filtering:")
        (doseq [task tasks]
          (let [padded-name (cuerdas/pad (:name task) {:type   :right
                                                       :length defaults/task-label-padding})
                enabled-marker (if (:enabled task) "\u2713" "\u2717")]
            (println (str "  " enabled-marker " " padded-name "  " (:enabled-reason task)))))))
    (println)
    0))
