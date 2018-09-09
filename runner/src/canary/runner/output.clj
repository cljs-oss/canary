(ns canary.runner.output
  (:require [clojure.java.io :as io]
            [canary.runner.utils :as utils])
  (:import (java.util Scanner NoSuchElementException)
           (java.io PipedReader PipedWriter PrintWriter)))

; -- line-based streaming ---------------------------------------------------------------------------------------------------

(defn print-stream-as-lines-in-background! [stream printer]
  (future
    (utils/kill-process-on-failure
      (try
        (let [output (io/reader stream)
              scanner (Scanner. output)]
          (loop []
            (printer (.nextLine scanner))
            (recur)))
        (catch NoSuchElementException _)))))                                                                                  ; peacefully finish the thread

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

(defn make-streaming-print-writer! [printer target]
  (let [stream (PipedReader.)
        writer (PipedWriter. stream)]
    (print-stream-as-lines-in-background! stream (synchronized-printer printer target))
    (PrintWriter. writer)))
