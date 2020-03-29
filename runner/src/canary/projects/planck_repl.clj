(ns canary.projects.planck-repl
  (:require [canary.runner.travis :as travis]))

(defn ^{:task true :homepage "planck-repl/planck"} planck [options]
  (travis/request-build! "planck-repl/planck" "CANARY_PLANCK_TRAVIS_TOKEN" options))
