(ns cljs-oss.tools.tasks
  "Tools for working with clojure tasks."
  (:require [cljs-oss.tools.utils :as utils]))

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

(defn filter-tasks-based-on-options [tasks options]
  ; TODO: implement filtering and cherry-picking
  tasks)

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (do
    (require 'cljs-oss.projects.binaryage)
    (scan-tasks 'cljs-oss.projects.binaryage)))
