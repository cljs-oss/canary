(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task planck [options]
  (travis/trigger-build! "mfikes/planck" "CANARY_PLANCK_TRAVIS_TOKEN" options))
