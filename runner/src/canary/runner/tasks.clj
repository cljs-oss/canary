(ns canary.runner.tasks
  "Tools for working with clojure tasks."
  (:require [canary.runner.utils :as utils]
            [clojure.string :as string]
            [canary.runner.print :as print]
            [canary.runner.defaults :as defaults]))

(defn task-passed? [task]
  (= (get-in task [:result :status]) :passed))

(defn var-task? [var]
  (assert (var? var))
  (true? (:task (meta var))))

(defn var-fn? [var]
  (assert (var? var))
  true)

(defn public-vars [namespace]
  (vals (ns-publics namespace)))

(defn scan-tasks [namespace]
  (->> (public-vars namespace)
       (filter var-task?)
       (filter var-fn?)))

(defn filter-via-only [task only]
  (let [active? (.contains (:name task) only)
        reason (if active?
                 (str "included because matching --only '" only "'")
                 (str "excluded because not matching --only '" only "'"))]
    (assoc task :enabled active?
                :enabled-reason reason)))

(defn filter-default [task]
  (assoc task :enabled true
              :enabled-reason "included by default"))

(defn task-filter [options task]
  (let [{:keys [only]} options]
    (cond
      (some? only) (filter-via-only task only)
      ; TODO: implement regex based exclusion/inclusion
      :else (filter-default task))))

(defn assign-task-colors [tasks]
  (map #(assoc %1 :color %2) tasks defaults/palette))

(defn activate-tasks-based-on-options [tasks options]
  (map (partial task-filter options) tasks))

(defn sort-active-first [tasks]
  (let [swap? (fn [x y] (and (:enabled y) (not (:enabled x))))]
    (sort (comparator swap?) tasks)))

(defn analyze-tasks [tasks options]
  (-> tasks
      (activate-tasks-based-on-options options)
      (sort-active-first)
      (assign-task-colors)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (do
    (require 'canary.projects.binaryage)
    (scan-tasks 'canary.projects.binaryage)))
