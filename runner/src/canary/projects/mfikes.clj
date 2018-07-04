(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task coal-mine [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN" options))

#_(defn ^:task andare [options]
  (travis/request-build! "mfikes/andare" "CANARY_ANDARE_TRAVIS_TOKEN" options))

(defn ^:task closurecomp [options]
  (travis/request-build! "mfikes/closurecomp" "CANARY_CLOSURELATEST_TRAVIS_TOKEN" options))

(defn ^:task closurelib [options]
  (travis/request-build! "mfikes/closurelib" "CANARY_CLOSURELATEST_TRAVIS_TOKEN" options))
