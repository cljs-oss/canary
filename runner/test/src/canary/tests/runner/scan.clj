(ns canary.tests.runner.scan
  (:require [clojure.test :refer :all]
            [canary.tests.helpers :refer :all]
            [canary.runner.scan :refer :all]))

(defn enabled-map [tasks]
  (into {} (map #(do [(:name %) (:enabled %)]) tasks)))

(deftest test-collect-and-analyze-all-tasks!
  (let [prefix (System/getProperty "user.dir")]
    (testing "case01"
      (let [options (assoc default-options :projects (str prefix "/test/fixtures/projects/case01"))
            tasks (collect-and-analyze-all-tasks! options)]
        (is (= ["check-cljs-devtools"
                "check-cljs-oops"
                "check-planck"
                "failing-shell"
                "java-throwing-task"
                "shell-example"
                "throwing-task"]
               (vec (sort (map :name tasks)))))
        (is (= {"check-cljs-devtools" true,
                "check-cljs-oops"     true,
                "check-planck"        true,
                "failing-shell"       true,
                "java-throwing-task"  true,
                "shell-example"       true,
                "throwing-task"       true}
               (enabled-map tasks)))))
    (testing "filtering on case01"
      (let [options (assoc default-options :projects (str prefix "/test/fixtures/projects/case01")
                                           :only "check task"
                                           :except "planck")
            tasks (collect-and-analyze-all-tasks! options)]
        (is (= {"check-cljs-devtools" true,
                "check-cljs-oops"     true,
                "check-planck"        false,
                "failing-shell"       false,
                "java-throwing-task"  true,
                "shell-example"       false,
                "throwing-task"       true}
               (enabled-map tasks))))
      (let [options (assoc default-options :projects (str prefix "/test/fixtures/projects/case01")
                                           :include "^check.*"
                                           :exclude ".*cljs.*")
            tasks (collect-and-analyze-all-tasks! options)]
        (is (= {"check-cljs-devtools" false,
                "check-cljs-oops"     false,
                "check-planck"        true,
                "failing-shell"       false,
                "java-throwing-task"  false,
                "shell-example"       false,
                "throwing-task"       false}
               (enabled-map tasks))))
      (let [options (assoc default-options :projects (str prefix "/test/fixtures/projects/case01")
                                           :exclude ".*cljs.*"
                                           :except "shell java")
            tasks (collect-and-analyze-all-tasks! options)]
        (is (= {"check-cljs-devtools" false,
                "check-cljs-oops"     false,
                "check-planck"        true,
                "failing-shell"       false,
                "java-throwing-task"  false,
                "shell-example"       false,
                "throwing-task"       true}
               (enabled-map tasks)))))))
