(ns canary.runner.utils
  "Shared utility functions."
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]
            [clojure.core.async :as async])
  (:import (java.util.concurrent TimeUnit)
           (java.io StringWriter PrintWriter)
           (java.net URLEncoder)))

; -- raw low-level printing -------------------------------------------------------------------------------------------------

(def ^:private printing-lock (Object.))

; printer functions can be called from different threads / also Thread$UncaughtExceptionHandler can interrupt Clojure printing
; that is why we want to use lower-level printing with synchronisation to avoid interleaved output
; http://yellerapp.com/posts/2014-12-11-14-race-condition-in-clojure-println.html

(defmacro with-synchronized-printing [& body]
  `(locking printing-lock
     ~@body))

(def ^:dynamic *current-raw-out* System/out)

(defmacro with-raw-stderr-printing [& body]
  `(binding [*current-raw-out* System/err]
     ~@body))

(defn raw-println [s]
  (with-synchronized-printing
    (.print *current-raw-out* (str s "\n"))))

(defn raw-stderr-println [s]
  (with-raw-stderr-printing
    (raw-println s)))

; -- utilities --------------------------------------------------------------------------------------------------------------

(defn pp [data & [level length]]
  (with-out-str
    (binding [*print-level* (or level 10)                                                                                     ; we have to be careful here, data might contain circular references
              *print-length* (or length 200)
              clojure.pprint/*print-right-margin* 126]                                                                        ; don't limit right margin
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
    (str (.toString string-writer) "---\n")))

(defn short-sha [sha]
  (if (< (count sha) 7)                                                                                                       ; prevent exceptions
    sha
    (subs sha 0 7)))

; https://dev.clojure.org/jira/browse/CLJ-1468
(defn deep-merge
  "Like merge, but merges maps recursively."
  [& maps]
  (if (every? map? maps)
    (apply merge-with deep-merge maps)
    (last maps)))

(defn url-encode [s]
  (URLEncoder/encode s "UTF-8"))

(defn exit! [status & [msg]]
  (if (some? msg)
    (raw-println msg))
  (.sleep TimeUnit/SECONDS 1)
  (System/exit status))

(defmacro kill-process-on-failure [& body]
  `(try
     ~@body
     (catch Throwable e#
       (raw-stderr-println (str "FATAL:\n" (stacktrace-str e#)))
       (System/exit 99))))                                                                                                    ; instant death

(defmacro catch-exceptions-as-result [& body]
  `(try
     ~@body
     (catch Exception e#
       e#)))

(defmacro rethrow-result-exceptions [& body]
  `(let [result# ~@body]
     (if (instance? Throwable result#)
       (throw result#)
       result#)))

; -- tests ------------------------------------------------------------------------------------------------------------------

(comment
  (pp {:infinite (iterate inc 0)})

  (canonical-path ".")
  (canonical-path "src/canary")

  (short-sha "0bed4a1f4a51b0ee08aa7f9e3421c0fe51fa5897")
  (short-sha "123456")
  (short-sha "1234567")
  (short-sha "12345678")

  (sanitize-as-filename "!@#$%^&*abc  xxx"))
