(ns canary.rgen.utils
  "Shared utility functions."
  (:require [clojure.pprint :refer [pprint]])
  (:import (java.util.concurrent TimeUnit)
           (java.io Writer)))

(defn pp [data & [level length]]
  (with-out-str
    (binding [*print-level* (or level 10)                                                                                     ; we have to be careful here, data might contain circular references
              *print-length* (or length 200)
              clojure.pprint/*print-right-margin* 126]                                                                        ; don't limit right margin
      (pprint data))))

(defn parse-int [s]
  (Integer/parseInt s))

(defn canonical-path [path]
  (.getCanonicalPath (clojure.java.io/file path)))

(defn flush-outputs! []
  ; TODO: how to make sure our piped writers get properly flushed?
  (.flush ^Writer *out*)
  (.flush ^Writer *err*)
  (.sleep TimeUnit/SECONDS 1))

(defn exit! [status & [msg]]
  (if (some? msg)
    (println msg))
  (flush-outputs!)
  (System/exit status))
