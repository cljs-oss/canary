(ns canary.projects.binaryage
  (:require [canary.runner.travis :as travis]))

(defn ^:task cljs-devtools [options]
  (travis/request-build! "binaryage/cljs-devtools" "CANARY_CLJS_DEVTOOLS_TRAVIS_TOKEN" options))

(defn ^:task chromex [options]
  (travis/request-build! "binaryage/chromex" "CANARY_CHROMEX_TRAVIS_TOKEN" options))

(defn ^:task cljs-oops [options]
  (travis/request-build! "binaryage/cljs-oops" "CANARY_CLJS_OOPS_TRAVIS_TOKEN" options))

(defn ^:task env-config [options]
  (travis/request-build! "binaryage/env-config" "CANARY_ENV_CONFIG_TRAVIS_TOKEN" options))
