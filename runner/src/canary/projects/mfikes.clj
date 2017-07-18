(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task planck [options]
  (let [matrix-job-linux-clang {:os       "linux"
                                :compiler "clang"}
        config-overrides {:matrix {:include [matrix-job-linux-clang]}}
        options (assoc options :travis-config config-overrides)]
    (travis/request-build! "mfikes/planck" "CANARY_PLANCK_TRAVIS_TOKEN" options)))
