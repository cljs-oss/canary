(ns canary.runner.threads
  (:require [clojure.core.async :as async]
            [clojure.core.async.impl.concurrent :as async-concurrent]
            [canary.runner.utils :as utils])
  (:import (java.util.concurrent Executors ThreadPoolExecutor TimeUnit)
           (clojure.lang Var)))

; inspired by core.async/thread

(defn make-executor ^ThreadPoolExecutor [naming-scheme]
  (Executors/newCachedThreadPool (async-concurrent/counted-thread-factory naming-scheme true)))

(defn spawn-thread-fn [^ThreadPoolExecutor executor f]
  (let [channel (async/chan 1)]
    (let [bindings (Var/getThreadBindingFrame)
          work (fn []
                 (Var/resetThreadBindingFrame bindings)
                 (try
                   (let [result (f)]
                     (when-not (nil? result)
                       (async/>!! channel result)))
                   (finally
                     (async/close! channel))))]
      (.execute executor work))
    channel))

(defmacro spawn-thread [executor & body]
  `(spawn-thread-fn ~executor (^:once fn* []
                                (utils/with-outputs-flushing
                                  ~@body))))

(defn interrupt-executor [^ThreadPoolExecutor executor timeout-ms]
  (.shutdownNow executor)
  (.awaitTermination executor timeout-ms TimeUnit/MILLISECONDS))
