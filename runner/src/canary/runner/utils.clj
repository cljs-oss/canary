(ns canary.runner.utils
  "Shared utility functions."
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]
            [clojure.core.async :as async])
  (:import (java.util.concurrent TimeUnit)
           (java.io StringWriter PrintWriter)))

(defn pp [data & [level length]]
  (with-out-str
    (binding [*print-level* (or level 10)                                                                                     ; we have to be careful here, data might contain circular references
              *print-length* (or length 200)]
      (pprint data))))

(defn canonical-path [path]
  (.getCanonicalPath (clojure.java.io/file path)))

(defn remove-extension [path]
  (string/replace-first path #"\.[^.]+$" ""))

(defn seconds-to-msec [seconds]
  (.toMillis TimeUnit/SECONDS seconds))

(defn timeout [msec]
  (if (zero? msec)
    (async/chan)                                                                                                              ; channel which never closes
    (async/timeout msec)))

(defn sanitize-as-filename [name]
  (-> name
      (string/replace #"[^a-zA-Z0-9]" "_")
      (string/replace #"_+" "_")))

(defn ex [message & [data cause]]
  (if (some? cause)
    (ex-info message (or data {}) cause)
    (ex-info message (or data {}))))

(defn stacktrace-str [^Throwable ex]
  (let [string-writer (StringWriter.)
        print-writer (PrintWriter. string-writer)]
    (.printStackTrace ex print-writer)
    (.toString string-writer)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (pp {:infinite (iterate inc 0)})

  (canonical-path ".")
  (canonical-path "src/canary")

  (sanitize-as-filename "!@#$%^&*abc  xxx"))
