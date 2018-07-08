(ns canary.runner.scan
  "Tools for scanning for available tasks. We want to require them dynamically and sometimes selectively."
  (:require [clojure.string :as string]
            [clojure.java.io :as io]
            [clojure.tools.namespace.find :as find]
            [cuerdas.core :as cuerdas]
            [canary.runner.utils :as utils]
            [canary.runner.tasks :as tasks]
            [canary.runner.shell :as shell]
            [canary.runner.i18n :as i18n]
            [canary.runner.print :refer [announce]]))

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn task-name [_kind _namespace name]
  name)

; -- clojure tasks ----------------------------------------------------------------------------------------------------------

(defn scan-for-project-namespaces [dir-path]
  (find/find-namespaces-in-dir (io/file dir-path)))

(defn task-name-from-var [task-var]
  (let [var-meta (meta task-var)
        name (str (:name var-meta))
        last-ns-segment (last (string/split (str (ns-name (:ns var-meta))) #"\."))]
    (task-name :clj last-ns-segment name)))

(defn task-description-from-var [task-var]
  (let [{:keys [name doc file line]} (meta task-var)
        position (if (some? line) (str ":" line))
        location (if (some? file) (str file position))
        generated-doc (str "function " name " from " location)]
    (if (some? doc)
      (str (first (cuerdas/lines doc)) " - " generated-doc)
      generated-doc)))

(defn expand-homepage [url]
  (cond
    (string/includes? url "://") url                                                                                          ; assume full url e.g. https://github.com/clojure/clojurescript
    :else (str "https://github.com/" url)))                                                                                   ; assume short github repo location e.g. frenchy64/clojurescript

(defn sanitize-metadata [metadata]
  (cond-> metadata
          (some? (:homepage metadata)) (update :homepage expand-homepage)))

(defn task-meta-from-var [task-var]
  (let [full-meta (or (meta task-var) {})
        interesting-meta-keys [:homepage]]
    (sanitize-metadata (select-keys full-meta interesting-meta-keys))))

(defn make-clojure-task [task-var]
  {:name        (task-name-from-var task-var)
   :description (task-description-from-var task-var)
   :meta        (task-meta-from-var task-var)
   :fn          (var-get task-var)})

(defn collect-clojure-tasks-for-namespace! [options namespace]
  (announce (i18n/requiring-namespace-msg namespace) 2 options)
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

(defn task-result-maker [shell-task]
  (fn [& args]
    (let [shell-result (apply shell-task args)                                                                                ; TODO: catch exceptions?
          out (:out shell-result)
          err (:err shell-result)
          passed? (zero? (:exit-code shell-result))]
      {:status (if passed? :passed :failed)
       :report (str "```\n" out (if-not (empty? err) (str "\n" err)) "```\n")})))

(defn shell-tasks-for-file [options file]
  (let [normalized-name (cuerdas/kebab (utils/remove-extension (.getName file)))]
    [{:name        (task-name :sh "shell" normalized-name)
      :description (str "shell script at '" (str file) "'")
      :fn          (task-result-maker (shell/make-shell-launcher file))}]))

(defn collect-all-shell-tasks [options dir-path]
  (mapcat (partial shell-tasks-for-file options) (scan-for-shell-projects dir-path)))

; -- main API ---------------------------------------------------------------------------------------------------------------

(defn collect-all-tasks! [options]
  (let [dir-path (:projects options)]
    (concat (collect-all-clojure-tasks! options dir-path)
            (collect-all-shell-tasks options dir-path))))

(defn collect-and-analyze-all-tasks! [options]
  (let [all-tasks (collect-all-tasks! options)]
    (tasks/analyze-tasks all-tasks options)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (scan-for-project-namespaces (utils/canonical-path "src/canary/projects"))
  (scan-for-shell-projects (utils/canonical-path "src/canary/projects"))
  (collect-all-tasks! {:projects (utils/canonical-path "src/canary/projects")
                       :verbose  true}))
