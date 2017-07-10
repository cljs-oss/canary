(ns cljs-oss.tools.utils
  "Shared utility functions."
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]
            [clojure.core.async :as async])
  (:import (java.util.concurrent TimeUnit)))

(defn pp [data & [level length]]
  (with-out-str
    (binding [*print-level* (or level 5)                                                                                      ; we have to be careful here, data might contain circular references
              *print-length* (or length 200)]
      (pprint data))))

(defn canonical-path [path]
  (.getCanonicalPath (clojure.java.io/file path)))

(defn remove-extension [path]
  (string/replace-first path #"\.[^.]+$" ""))

(defn seconds-to-msec [seconds]
  (.toMillis TimeUnit/SECONDS seconds))

(defn timeout-cli-parser [str-val]
  (assert (string? str-val))
  (seconds-to-msec (Long/parseLong str-val)))

(def timeout-cli-validator [#(not (neg? %)) "Timeout must be a positive number or zero (to disable it)."])

(defn timeout-option [cli-spec]
  (concat cli-spec [:parse-fn timeout-cli-parser :validate timeout-cli-validator]))

(defn timeout [msec]
  (if (zero? msec)
    (async/chan)                                                                                                              ; channel which never closes
    (async/timeout msec)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (pp {:infinite (iterate inc 0)})

  (canonical-path ".")
  (canonical-path "src/cljs_oss"))
