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

; -- printing from streams --------------------------------------------------------------------------------------------------

(defn make-streaming-print-writer! [printer]
  (let [stream (PipedReader.)
        writer (PipedWriter. stream)]
    (print-stream-as-lines-in-background! stream printer)
    (PrintWriter. writer)))
