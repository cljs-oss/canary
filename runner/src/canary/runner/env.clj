(ns canary.runner.env
  (:refer-clojure :exclude [get])
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]
            [canary.runner.utils :as utils]
            [canary.runner.i18n :as i18n]))

(def default-env-file ".env")

(defn- read-env-file [path]
  (let [full-path (utils/canonical-path path)]
    (if-some [env-file (io/file full-path)]
      (if (.exists env-file)
        (try
          (let [data (edn/read-string (slurp env-file))]
            (assert (map? data))
            data)
          (catch Throwable e
            (throw (utils/ex (i18n/env-file-problem-msg full-path (.getMessage e))))))))))

(defn get-env-vars []
  (merge {}
         (read-env-file default-env-file)
         (System/getenv)
         (System/getProperties)))

(def memoized-get-env-vars (memoize get-env-vars))

(defn get [name]
  (clojure.core/get (memoized-get-env-vars) name))
