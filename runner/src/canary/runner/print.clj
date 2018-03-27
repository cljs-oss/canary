(ns canary.runner.print
  (:require [clojure.string :as string]
            [canary.runner.output :as output]
            [cuerdas.core :as cuerdas]
            [clansi]
            [canary.runner.defaults :as defaults])
  (:import (java.text SimpleDateFormat)
           (java.util Date)
           (java.io Writer)))

; -- announcement printing --------------------------------------------------------------------------------------------------

(def ^:private printing-lock (Object.))

; synchronized printing is only needed in rare cases like when forcibly interrupting threads
; under normal circumstances all our printing is synchronized via output/synchronized-printer
(defn- synchronized-println [& args]
  (locking printing-lock
    (apply println args)
    (.flush ^Writer *out*)))

(defn announce [message & [verbosity options]]
  (when (or (nil? verbosity) (<= verbosity (:verbosity options)))
    (synchronized-println message)))

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

(defn mark-errors [kind options content]
  (if (:mark-errors options)
    (let [prefix (if (= kind :err) "!" " ")
          style (if (= kind :err) :red :default)]
      (clansi/style (str prefix content) style))
    (str " " content)))

(defn process-passthrough-content [content]
  ; we want to handle travis folding command gracefully
  (if-some [m (re-matches #"^(travis_.*\r\033\[0K)(.*)" content)]
    (do
      (print (nth m 1))
      (nth m 2))
    content))

; -- job printing -----------------------------------------------------------------------------------------------------------

(defn format-job-line [time label style content verbosity]
  (let [padded-label (cuerdas/pad label {:length defaults/job-label-padding
                                         :type   :right})
        prefix (case verbosity
                 0 "*"
                 1 (str "[" time "]")
                 (str "[" time "] " padded-label " |"))
        styles (if (sequential? style) (or style :default) [style])]
    (str (apply clansi/style prefix styles) content)))

(defn job-printer [target kind options content]
  (binding [*out* target]
    (let [printable-content (process-passthrough-content content)
          current-time (Date.)
          line (format-job-line (format-time current-time (:time-format options))
                                (job-name (:job-id options))
                                nil
                                (mark-errors kind options printable-content)
                                (:verbosity options))]
      ; TODO: implement line wrapping for travis web ui?
      (println line))))

(defn make-job-print-writer! [target kind options]
  (output/make-print-writer! (partial job-printer target kind options) target))

(defmacro with-job-printing [options & body]
  `(let [options# ~options]
     (binding [*out* (make-job-print-writer! *out* :out options#)
               *err* (make-job-print-writer! *err* :err options#)]
       ~@body)))

; -- task printing ----------------------------------------------------------------------------------------------------------

(defn format-task-line [label style content]
  (let [padded-label (cuerdas/pad label {:length defaults/task-label-padding
                                         :type   :right})
        styles (if (sequential? style) style [style])]
    (str "  " (apply clansi/style padded-label styles) " |" content)))

(defn task-printer [target kind task options content]
  (binding [*out* target]
    (let [printable-content (process-passthrough-content content)
          line (format-task-line (:name task) (:color task) (mark-errors kind options printable-content))]
      (println line))))

(defn make-task-print-writer! [target kind task options]
  (output/make-print-writer! (partial task-printer target kind task options) target))

(defmacro with-task-printing [task options & body]
  `(let [task# ~task
         options# ~options]
     (binding [*out* (make-task-print-writer! *out* :out task# options#)
               *err* (make-task-print-writer! *err* :err task# options#)]
       ~@body)))
