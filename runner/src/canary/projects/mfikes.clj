(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^{:task true :homepage "mfikes/coal-mine"} coal-mine [options]
  (let [config-overrides {:env {:matrix ["PARTITION_FILTER=1"
                                         "PARTITION_FILTER=2"
                                         "PARTITION_FILTER=3"
                                         "PARTITION_FILTER=4"
                                         "PARTITION_FILTER=5"]}}
        options (assoc options :travis-config config-overrides)]
    (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN" options)))

#_(defn ^{:task true :homepage "mfikes/andare"} andare [options]
  (travis/request-build! "mfikes/andare" "CANARY_ANDARE_TRAVIS_TOKEN" options))

#_(defn ^{:task true :homepage "mfikes/closurecomp"} closurecomp [options]
  (travis/request-build! "mfikes/closurecomp" "CANARY_CLOSURELATEST_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "mfikes/closurelib"} closurelib [options]
  (travis/request-build! "mfikes/closurelib" "CANARY_CLOSURELATEST_TRAVIS_TOKEN" options))
