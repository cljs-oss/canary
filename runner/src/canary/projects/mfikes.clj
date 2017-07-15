(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task planck [options]
  (let [config-overrides {:matrix {:include [{:os       "linux"
                                              :compiler "clang"}]}}
        options (assoc options :travis-body {:request {:config config-overrides}})]
    (travis/trigger-build! "mfikes/planck" "CANARY_PLANCK_TRAVIS_TOKEN" "master" options)))
