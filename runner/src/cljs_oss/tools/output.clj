(ns cljs-oss.tools.output
  (:require [clojure.java.io :as io])
  (:import (java.util.concurrent TimeUnit)
           (java.io BufferedReader)))

; -- synchronized printing --------------------------------------------------------------------------------------------------

(def printing-lock (Object.))

(defn synchronized-println [& args]
  (locking printing-lock
    (apply println args)))

; -- line-based streaming ---------------------------------------------------------------------------------------------------

(defn print-stream-as-lines! [stream printer]
  (future
    (let [output (io/reader stream)]
      (loop []
        (let [out (.readLine ^BufferedReader output)]
          (when (some? out)
            (printer out))
          (recur))))))

; -- flushing ---------------------------------------------------------------------------------------------------------------

(defn flush-outputs! []
  ; TODO: how to make sure our piped writers get properly flushed?
  (.flush *out*)
  (.flush *err*)
  (.sleep TimeUnit/SECONDS 1))
