(ns canary.tests.runner.utils
  (:require [clojure.test :refer :all]
            [canary.runner.utils :refer :all]))

(deftest test-short-sha
  (are [full short] (= short (short-sha full))
    "123456" "123456"
    "1234567" "1234567"
    "12345678" "1234567"))

(deftest test-sanitize-as-filename
  (are [wild sanitized] (= sanitized (sanitize-as-filename wild))
    "" ""
    " " "_"
    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890"
    "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890"
    "!@#$%^&*abc  xxx" "_abc_xxx"))

(deftest test-canonical-path
  (let [prefix (System/getProperty "user.dir")]
    (are [partial canonical] (= canonical (canonical-path partial))
      "." prefix
      "src/canary" (str prefix "/src/canary")
      "src/canary/projects/../runner" (str prefix "/src/canary/runner"))))
