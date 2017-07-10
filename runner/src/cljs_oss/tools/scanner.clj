(ns cljs-oss.tools.scanner
  "Tools for scanning for available projects. We want to require them dynamically and sometimes selectively."
  (:require [clojure.string :as string]
            [clojure.java.io :as io]
            [clojure.java.shell :as shell]
            [clojure.tools.namespace.find :as find]
            [cuerdas.core :as cuerdas]
            [cljs-oss.tools.utils :as utils]
            [cljs-oss.tools.tasks :as tasks]))

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn task-name [kind namespace name]
  (str kind "|" namespace "/" name))

; -- clojure tasks ----------------------------------------------------------------------------------------------------------

(defn scan-for-project-namespaces [dir-path]
  (find/find-namespaces-in-dir (io/file dir-path)))

(defn task-name-from-var [task-var]
  (let [var-meta (meta task-var)
        name (:name var-meta)
        last-ns-segment (last (string/split (str (ns-name (:ns var-meta))) #"\."))]
    (task-name "clj" last-ns-segment name)))

(defn make-clojure-task [task-var]
  {:id (task-name-from-var task-var)
   :fn (var-get task-var)})

(defn collect-clojure-tasks-for-namespace! [options namespace]
  (when (:verbose options)
    (utils/announce (str "requiring '" namespace "'")))
  (require namespace)
  (map make-clojure-task (tasks/scan-tasks namespace)))

(defn collect-all-clojure-tasks! [options dir-path]
  (mapcat (partial collect-clojure-tasks-for-namespace! options) (scan-for-project-namespaces dir-path)))

; -- shell tasks ------------------------------------------------------------------------------------------------------------

(defn shell-project? [file]
  (.endsWith (str file) ".sh"))

(defn scan-for-shell-projects [dir-path]
  (->> (file-seq (io/file dir-path))
       (filter shell-project?)))

(defn make-shell-launcher [file]
  (let [path (str file)
        name (.getName file)]
    (fn [options]
      (when (:verbose options)
        (utils/announce (str "launching a shell task " name " at '" path "'")))
      ; TODO: run it in a sandboxed workdir
      ; TODO: pass some environment
      (let [result (shell/sh path)]
        (when (:verbose options)
          (utils/announce (str "shell task " name " result: " (utils/pp result))))
        ; TODO: we should stream stdout
        (print (:out result))
        (flush)
        result))))

(defn shell-tasks-for-file [options file]
  [{:id (task-name "sh" (cuerdas/kebab (utils/remove-extension (.getName file))) "script")
    :fn (make-shell-launcher file)}])

(defn collect-all-shell-tasks [options dir-path]
  (mapcat (partial shell-tasks-for-file options) (scan-for-shell-projects dir-path)))

; -- main API ---------------------------------------------------------------------------------------------------------------

(defn collect-all-tasks! [options]
  (let [dir-path (utils/canonical-path (:projects options))]
    (concat (collect-all-clojure-tasks! options dir-path)
            (collect-all-shell-tasks options dir-path))))

(defn collect-effective-tasks! [options]
  (let [all-tasks (collect-all-tasks! options)]
    (tasks/filter-tasks-based-on-options all-tasks options)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (scan-for-project-namespaces (utils/canonical-path "src/cljs_oss/projects"))
  (scan-for-shell-projects (utils/canonical-path "src/cljs_oss/projects"))
  (collect-all-tasks! {:projects (utils/canonical-path "src/cljs_oss/projects")
                       :verbose  true}))
