(ns canary.projects.chkup
  (:require [canary.runner.travis :as travis]))

(defn ^{:task true :homepage "cerner/clara-rules"} clara-rules [options]
  (travis/request-build! "chkup/clara-rules" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "noprompt/garden"} garden [options]
  (travis/request-build! "chkup/garden" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "omcljs/om"} om [options]
  (travis/request-build! "chkup/om" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "metosin/spec-tools"} spec-tools [options]
  (travis/request-build! "chkup/spec-tools" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "clojure/test.check"} test-check [options]
  (travis/request-build! "chkup/test.check" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "clojure/core.async"} core-async [options]
  (travis/request-build! "chkup/core.async" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "clojure/core.rrb-vector"} core-rrb-vector [options]
  (travis/request-build! "chkup/core.rrb-vector" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "clojure/core.match"} core-match [options]
  (travis/request-build! "chkup/core.match" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "clojure/core.logic"} core-logic [options]
  (travis/request-build! "chkup/core.logic" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^{:task true :homepage "andrewmcveigh/cljs-time"} cljs-time [options]
  (travis/request-build! "chkup/cljs-time" "CANARY_CHKUP_TRAVIS_TOKEN" options))
