(ns canary.runner.print
  (:require [clojure.string :as string]
            [cuerdas.core :as cuerdas]
            [clansi]
            [canary.runner.defaults :as defaults]
            [canary.runner.utils :as utils])
  (:import (java.text SimpleDateFormat)
           (java.util Date)))

; -- decorated printing -----------------------------------------------------------------------------------------------------

(def ^:dynamic *current-decorated-println* utils/raw-println)

(defmacro wrap-decorated-printing [inner-decorator-fn & body]
  `(let [outer-decorator-fn# *current-decorated-println*]
     (binding [*current-decorated-println* (comp outer-decorator-fn# ~inner-decorator-fn)]
       ~@body)))

(defn decorated-println [s]
  (*current-decorated-println* s))

; -- announcement printing --------------------------------------------------------------------------------------------------

(defn announce [message & [verbosity options]]
  (when (or (nil? verbosity) (<= verbosity (:verbosity options)))
    (decorated-println message)))

; -- styling wrappers -------------------------------------------------------------------------------------------------------

(defn task-name [task]
  (clansi/style (:name task) (:color task)))

(defn task-description [task]
  (clansi/style (:description task) :black))

(defn job-name [job-id]
  (clansi/style (string/trim (str "job #" job-id)) :underline))

(defn emphasize [text]
  (clansi/style text :bright))

(defn repo-slug [text]
  (clansi/style text :cyan))

(defn travis-url [text]
  (clansi/style text :blue))

(defn travis-build-number [text]
  (clansi/style (str "#" text) :cyan :bright))

(defn rev [compiler-rev]
  (clansi/style compiler-rev :magenta))

(defn url [text]
  (clansi/style text :blue))

(defn dump [text]
  (->> text
       (cuerdas/lines)
       (map #(clansi/style % :black))
       (cuerdas/unlines)))

(defn request-label
  ([request] (request-label (get-in request ["repository" "slug"]) (get request "id")))
  ([slug request-id] (str slug "#" request-id)))

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn make-time-formatter [format]
  (SimpleDateFormat. format))

(def time-formatter (memoize make-time-formatter))

(defn format-time [time & [format]]
  (.format (time-formatter (or format defaults/time-format)) time))

(defn process-passthrough-content [content]
  ; we want to handle travis folding command gracefully
  (if-some [m (re-matches #"^(travis_.*\r\033\[0K)(.*)" content)]
    (do
      (print (nth m 1))
      (nth m 2))
    content))

(defn decorate-lines [decorator content]
  (->> (cuerdas/lines content)
       (map decorator)
       (cuerdas/unlines)))

; -- job printing -----------------------------------------------------------------------------------------------------------

(defn format-job-line [time label style verbosity content]
  (let [padded-label (cuerdas/pad label {:length defaults/job-label-padding
                                         :type   :right})
        prefix (case verbosity
                 0 "*"
                 1 (str "[" time "]")
                 (str "[" time "] " padded-label " |"))
        styles (if (sequential? style) (or style :default) [style])]
    (str (apply clansi/style prefix styles) " " content)))

(defn job-printing-decorator [options content]
  (let [printable-content (process-passthrough-content content)
        current-time (Date.)
        line-formatter (partial format-job-line
                                (format-time current-time (:time-format options))
                                (job-name (:job-id options))
                                nil
                                (:verbosity options))]
    ; TODO: implement line wrapping for travis web ui?
    (decorate-lines line-formatter printable-content)))

(defmacro with-job-printing [options & body]
  `(let [options# ~options]
     (wrap-decorated-printing (partial job-printing-decorator options#)
       ~@body)))

; -- task printing ----------------------------------------------------------------------------------------------------------

(defn format-task-line [label style content]
  (let [padded-label (cuerdas/pad label {:length defaults/task-label-padding
                                         :type   :right})
        styles (if (sequential? style) style [style])]
    (str "  " (apply clansi/style padded-label styles) " | " content)))

(defn task-printing-decorator [task _options content]
  (let [printable-content (process-passthrough-content content)
        line-formatter (partial format-task-line (:name task) (:color task))]
    (decorate-lines line-formatter printable-content)))

(defmacro with-task-printing [task options & body]
  `(let [task# ~task
         options# ~options]
     (wrap-decorated-printing (partial task-printing-decorator task# options#)
       ~@body)))

; -- error printing ----------------------------------------------------------------------------------------------------------

(defn format-error-line [options content]
  (if (:mark-errors options)
    (clansi/style (str "! " content) :red)
    content))

(defn error-printing-decorator [options content]
  (let [printable-content (process-passthrough-content content)
        line-formatter (partial format-error-line options)]
    (decorate-lines line-formatter printable-content)))

(defmacro with-error-printing [options & body]
  `(let [options# ~options]
     (wrap-decorated-printing (partial error-printing-decorator options#)
       ~@body)))

(defn decorated-error-println [options s]
  (with-error-printing options
    (decorated-println s)))
