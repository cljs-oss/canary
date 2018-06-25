(ns canary.projects.chkup
  (:require [canary.runner.travis :as travis]))

(defn ^:task cuerdas [options]
  (travis/request-build! "chkup/cuerdas" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task garden [options]
  (travis/request-build! "chkup/garden" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task hoplon [options]
  (travis/request-build! "chkup/hoplon" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task om [options]
  (travis/request-build! "chkup/om" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task re-frame [options]
  (travis/request-build! "chkup/re-frame" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task reagent [options]
  (travis/request-build! "chkup/reagent" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task spec-tools [options]
  (travis/request-build! "chkup/spec-tools" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task specter [options]
  (travis/request-build! "chkup/specter" "CANARY_CHKUP_TRAVIS_TOKEN" options))

(defn ^:task test-check [options]
  (travis/request-build! "chkup/test.check" "CANARY_CHKUP_TRAVIS_TOKEN" options))
