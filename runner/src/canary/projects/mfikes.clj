(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn add-partition-filter [options filter]
  (assoc options :travis-config {:env {:global {"PARTITION_FILTER" filter}}}))

(defn ^:task coal-mine-1 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "1")))

(defn ^:task coal-mine-2 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "2")))

(defn ^:task coal-mine-3 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "3")))

(defn ^:task coal-mine-4 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "4")))

(defn ^:task coal-mine-5 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "5")))

#_(defn ^:task andare [options]
  (travis/request-build! "mfikes/andare" "CANARY_ANDARE_TRAVIS_TOKEN" options))

(defn ^:task closure-latest [options]
  (travis/request-build! "mfikes/closure-latest" "CANARY_CLOSURE_LATEST_TRAVIS_TOKEN" options))
