(ns canary.projects.chkup
  (:require [canary.runner.travis :as travis]))

(defn ^:task cuerdas [options]
  (travis/request-build! "chkup/cuerdas" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task specter [options]
  (travis/request-build! "chkup/specter" "CANARY_CHKUP_TRAVIS_TOKEN" options))
