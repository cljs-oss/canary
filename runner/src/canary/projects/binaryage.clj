(ns canary.projects.binaryage
  (:require [canary.runner.travis :as travis]))

(defn ^{:task true :homepage "binaryage/cljs-devtools"} cljs-devtools [options]
  (travis/request-build! "binaryage/cljs-devtools" "CANARY_DARWINS_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "binaryage/chromex"} chromex [options]
  (travis/request-build! "binaryage/chromex" "CANARY_DARWINS_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "binaryage/cljs-oops"} cljs-oops [options]
  (travis/request-build! "binaryage/cljs-oops" "CANARY_DARWINS_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "binaryage/cljs-zones"} cljs-zones [options]
  (travis/request-build! "binaryage/cljs-zones" "CANARY_DARWINS_TRAVIS_TOKEN" options))
