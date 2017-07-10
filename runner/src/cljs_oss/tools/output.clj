(ns cljs-oss.tools.output
  (:require [clojure.java.io :as io])
  (:import (java.util.concurrent TimeUnit)))

; -- helpers ----------------------------------------------------------------------------------------------------------------

(def printing-lock (Object.))

(defn synchronized-println [& args]
  (locking printing-lock
    (apply println args)))

(defn print-stream-as-lines! [stream printer]
  (future
    (let [output (io/reader stream)]
      (loop []
        (let [out (.readLine output)]
          (when (some? out)
            (printer out))
          (recur))))))

(defn flush-outputs! []
  ; TODO: how to make sure our piped writers get properly flushed?
  (.flush *out*)
  (.flush *err*)
  (.sleep TimeUnit/SECONDS 1))
