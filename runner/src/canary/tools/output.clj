(ns canary.tools.output
  (:require [clojure.java.io :as io])
  (:import (java.util.concurrent TimeUnit)
           (java.util Scanner)))

; -- line-based streaming ---------------------------------------------------------------------------------------------------

(defn print-stream-as-lines! [stream printer]
  (future
    (let [output (io/reader stream)
          scanner (.useDelimiter (Scanner. output) "\n")]
      (loop []
        (printer (.next scanner))
        (recur)))))

; -- flushing ---------------------------------------------------------------------------------------------------------------

(defn flush-outputs! []
  ; TODO: how to make sure our piped writers get properly flushed?
  (.flush *out*)
  (.flush *err*)
  (.sleep TimeUnit/SECONDS 1))
