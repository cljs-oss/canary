(ns canary.runner.env
  (:refer-clojure :exclude [get])
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]
            [canary.runner.utils :as utils]))

(def default-env-file ".env")

(defn make-env-file-problem-msg [path reason]
  (str "Unable to to read env edn file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn- read-env-file [path]
  (let [full-path (utils/canonical-path path)]
    (if-some [env-file (io/file full-path)]
      (if (.exists env-file)
        (try
          (let [data (edn/read-string (slurp env-file))]
            (assert (map? data))
            data)
          (catch Throwable e
            (let [reason (.getMessage e)
                  info {:path   full-path
                        :file   env-file
                        :reason reason}]
              (throw (ex-info (make-env-file-problem-msg full-path reason) info)))))))))

(defn get-env-vars []
  (merge {}
         (read-env-file default-env-file)
         (System/getenv)
         (System/getProperties)))

(def memoized-get-env-vars (memoize get-env-vars))

(defn get [name]
  (clojure.core/get (memoized-get-env-vars) name))
