(ns canary.projects.binaryage
  (:require [canary.runner.travis :as travis]))

(defn ^:task cljs-devtools [options]
  (travis/request-build! "binaryage/cljs-devtools" "CANARY_CLJS_DEVTOOLS_TRAVIS_TOKEN" options))

(defn ^:task chromex [options]
  (travis/request-build! "binaryage/chromex" "CANARY_CHROMEX_TRAVIS_TOKEN" options))
