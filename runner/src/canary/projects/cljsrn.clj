(ns canary.projects.cljsrn
  (:require [canary.runner.travis :as travis]))

(defn ^{:task true :homepage "cljsrn/side-fx"} side-fx [options]
  (travis/request-build! "cljsrn/side-fx" "CANARY_SIDE_FX_TRAVIS_TOKEN" options))
