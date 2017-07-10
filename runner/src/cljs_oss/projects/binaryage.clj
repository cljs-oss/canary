(ns cljs-oss.projects.binaryage
  (:import (java.util.concurrent TimeUnit)))

(defn some-helper [x]
  (binding [*out* *err*]
    (println "some error")))

(defn ^:task check-cljs-devtools [options]
  (println "TODO: check-cljs-devtools")
  (some-helper "xxx")
  (println "devtools done")
  "some result")

(defn ^:task check-cljs-oops [options]
  (println "TODO: check-cljs-oops")
  (.sleep TimeUnit/SECONDS 7)
  (println "oops done"))
