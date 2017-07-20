(ns case01.binaryage
  (:require [clansi])
  (:import (java.util.concurrent TimeUnit)))

(defn some-helper [x]
  (println (clansi/style "test cyan output from a clj task" :cyan))
  (binding [*out* *err*]
    (println "some error")))

(defn ^:task check-cljs-devtools [options]
  (println "TODO: check-cljs-devtools")
  (some-helper "xxx")
  (println "devtools done")
  {:status :failed
   :report "some result"})

(defn ^:task check-cljs-oops [options]
  (println "TODO: check-cljs-oops")
  (.sleep TimeUnit/SECONDS 7)
  (println "oops done")
  {:status :passed
   :report "oops ok"})

(defn ^:task throwing-task [options]
  (println "want to do something")
  (throw (ex-info "something went wrong" {})))

(defn ^:task java-throwing-task [options]
  (zero? nil))
