(ns canary.runner.output
  (:require [clojure.java.io :as io])
  (:import (java.util.concurrent TimeUnit)
           (java.util Scanner)
           (java.io Writer PipedReader PipedWriter PrintWriter)))

; -- line-based streaming ---------------------------------------------------------------------------------------------------

(defn print-stream-as-lines! [stream printer]
  (future
    (let [output (io/reader stream)
          scanner (.useDelimiter (Scanner. output) "\n")]
      (loop []
        (printer (.next scanner))
        (recur)))))

; -- synchronized printing --------------------------------------------------------------------------------------------------

; printer functions can be called from different threads printing into same target writer (e.g. *out* aka System/out)
; that is why we have to synchronize access to target writer
; http://yellerapp.com/posts/2014-12-11-14-race-condition-in-clojure-println.html

(defn synchronized-printer [printer target]
  (fn [& args]
    (locking target
      (apply printer args))))

(defn synchronized-out-printer [& args]
  (locking *out*
    (apply println args)))

(defn synchronized-err-printer [& args]
  (binding [*out* *err*]
    (locking *out*
      (apply println args))))

(defn make-print-writer! [printer target]
  (let [stream (PipedReader.)
        writer (PipedWriter. stream)]
    (print-stream-as-lines! stream (synchronized-printer printer target))
    (PrintWriter. writer)))

; -- flushing ---------------------------------------------------------------------------------------------------------------

(defn flush-outputs! []
  ; TODO: how to make sure our piped writers get properly flushed?
  (.flush ^Writer *out*)
  (.flush ^Writer *err*)
  (.sleep TimeUnit/SECONDS 1))
