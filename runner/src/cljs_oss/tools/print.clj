(ns cljs-oss.tools.print
  (:require [clojure.string :as string]
            [cljs-oss.tools.output :as output]
            [cuerdas.core :as cuerdas]
            [clansi])
  (:import (java.text SimpleDateFormat)
           (java.util Date)
           (java.io PipedReader PipedWriter PrintWriter)))

(def palette (cycle [:green :blue :yellow :magenta :red]))
(def job-label-padding 10)
(def task-label-padding 20)
(def time-formatter (SimpleDateFormat. "HH:mm:ss"))

; -- announcement printing --------------------------------------------------------------------------------------------------

(defn announce [message & [verbosity options]]
  (when (or (nil? verbosity) (<= verbosity (:verbosity options)))
    (println message)))

; -- styling wrappers -------------------------------------------------------------------------------------------------------

(defn task-name [task]
  (clansi/style (:name task) (:color task)))

(defn task-description [task]
  (clansi/style (:description task) :black))

(defn job-name [options]
  (string/trim (str "job " (:job-id options))))

(defn emphasize [text]
  (clansi/style text :bright))

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn format-current-time []
  (.format time-formatter (Date.)))

(defn make-print-writer! [printer]
  (let [stream (PipedReader.)
        writer (PipedWriter. stream)]
    (output/print-stream-as-lines! stream printer)
    (PrintWriter. writer)))

(defn mark-errors [kind options content]
  (if (:mark-errors options)
    (let [prefix (if (= kind :err) "!" " ")
          style (if (= kind :err) :red :default)]
      (clansi/style (str prefix content) style))
    (str " " content)))

(defmacro bind-target [target kind & body]
  `(binding [~(if (= kind :err) '*err* '*out*) ~target]
     ~@body))

(defn process-passthrough-content [content]
  ; we want to handle travis folding command gracefully
  (if-some [m (re-matches #"^(travis_.*\r\033\[0K)(.*)" content)]
    (do
      (print (nth m 1))
      (nth m 2))
    content))

; -- job printing -----------------------------------------------------------------------------------------------------------

(defn format-job-line [time label style content verbosity]
  (let [padded-label (cuerdas/pad label {:length job-label-padding
                                         :type   :right})
        prefix (case verbosity
                 0 "*"
                 1 (str "[" time "]")
                 (str "[" time "] " padded-label " |"))
        styles (if (sequential? style) (or style :default) [style])]
    (str (apply clansi/style prefix styles) content)))

(defn job-printer [target kind options content]
  (bind-target target kind
    (let [printable-content (process-passthrough-content content)
          line (format-job-line (format-current-time)
                                (job-name options)
                                nil
                                (mark-errors kind options printable-content)
                                (:verbosity options))]
      ; TODO: implement line wrapping for travis web ui?
      (println line))))

(defn make-job-print-writer! [target kind options]
  (make-print-writer! (partial job-printer target kind options)))

(defmacro with-job-printing [options & body]
  `(let [options# ~options]
     (binding [*out* (make-job-print-writer! *out* :out options#)
               *err* (make-job-print-writer! *err* :err options#)]
       ~@body)))

; -- task printing ----------------------------------------------------------------------------------------------------------

(defn format-task-line [label style content]
  (let [padded-label (cuerdas/pad label {:length task-label-padding
                                         :type   :right})
        styles (if (sequential? style) style [style])]
    (str (apply clansi/style padded-label styles) " |" content)))

(defn task-printer [target kind task options content]
  (binding [*out* target]
    (let [printable-content (process-passthrough-content content)
          line (format-task-line (:name task) (:color task) (mark-errors kind options printable-content))]
      (println line))))

(defn make-task-print-writer! [target kind task options]
  (make-print-writer! (partial task-printer target kind task options)))

(defmacro with-task-printing [task options & body]
  `(let [task# ~task
         options# ~options]
     (binding [*out* (make-task-print-writer! *out* :out task# options#)
               *err* (make-task-print-writer! *err* :err task# options#)]
       ~@body)))
