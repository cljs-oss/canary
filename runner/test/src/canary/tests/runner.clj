(ns canary.tests.runner
  (:require [clojure.test :refer :all]
            [canary.tests.helpers :refer :all]
            [canary.runner :refer :all]
            [canary.runner.defaults :as defaults])
  (:import (java.util.regex Pattern)))

(deftest test-sanitize-and-validate-options
  (let [prefix (System/getProperty "user.dir")]
    (testing "paths canonization"
      (let [[options errors] (sanitize-and-validate-options default-options)]
        (is (empty? errors))
        (is (= (str prefix "/" (:projects default-options)) (:projects options)))
        (is (= (str prefix "/" (:workdir default-options)) (:workdir options)))
        (is (= (str prefix "/" (:cachedir default-options)) (:cachedir options)))))
    (testing "projects dir existence checks"
      (let [[_ errors] (sanitize-and-validate-options (merge default-options {:projects "some/non-existent-dir"}))]
        (is (= 1 (count errors)))
        (is (re-matches #".*directory does not exist.*" (first errors))))
      (let [[_ errors] (sanitize-and-validate-options (merge default-options {:projects "src/canary/runner.clj"}))]
        (is (= 1 (count errors)))
        (is (re-matches #".*directory does not seem to be a readable directory.*" (first errors)))))
    (testing "regex validation / conversion"
      (let [[options errors] (sanitize-and-validate-options (merge default-options {:include ".*" :exclude ""}))]
        (is (empty? errors))
        (is (instance? Pattern (:include options)))
        (is (instance? Pattern (:exclude options))))
      (let [[options errors] (sanitize-and-validate-options default-options)]
        (is (empty? errors))
        (is (nil? (:include options)))
        (is (nil? (:exclude options))))
      (let [[options errors] (sanitize-and-validate-options (merge default-options {:include "**" :exclude "["}))]
        (is (= (count errors) 2))
        (is (re-matches #".*Invalid regex pattern --include.*Dangling meta character.*" (first errors)))
        (is (re-matches #".*Invalid regex pattern --exclude.*Unclosed character class.*" (second errors)))))))

