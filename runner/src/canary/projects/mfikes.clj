(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task planck [options]
  (travis/request-build! "mfikes/planck" "CANARY_PLANCK_TRAVIS_TOKEN" options))
