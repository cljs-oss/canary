(ns canary.projects.nathanmarz
  (:require [canary.runner.travis :as travis]))

(defn ^:task specter [options]
  (travis/request-build! "nathanmarz/specter" "CANARY_SPECTER_TRAVIS_TOKEN" options))
