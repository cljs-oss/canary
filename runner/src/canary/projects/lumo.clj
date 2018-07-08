(ns canary.projects.lumo
  (:require [canary.runner.travis :as travis]))

#_(defn ^{:task true :homepage "anmonteiro/lumo"} lumo [options]
  (travis/request-build! "anmonteiro/lumo" "CANARY_LUMO_TRAVIS_TOKEN" options))
