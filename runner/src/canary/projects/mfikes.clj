(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task planck [options]
  ; using just Travis matrix.include will run all default matrix job combinations plus our matrix-job-linux-clang
  ; there seems to be no sane way how to disable default matrix auto-generated jobs
  ; some people proposed various workaround with different trade-offs
  ; see https://github.com/travis-ci/travis-ci/issues/4681#issuecomment-273104167
  (let [matrix-job-linux-clang {:os       "linux"
                                :compiler "clang"}
        config-overrides {:env {:matrix ["TRAVIS_4681_WORKAROUND=1"]}
                          :matrix {:include [matrix-job-linux-clang]
                                   :exclude [{:env "TRAVIS_4681_WORKAROUND=1"}]}}
        options (assoc options :travis-config config-overrides)]
    (travis/request-build! "mfikes/planck" "CANARY_PLANCK_TRAVIS_TOKEN" options)))

(defn deep-merge-with [f & maps]
  (apply
    (fn m [& maps]
      (if (every? map? maps)
        (apply merge-with m maps)
        (apply f maps)))
    maps))

(defn add-partition-filter [options filter]
  (deep-merge-with merge options
    {:travis-config {:env {:global {"PARTITION_FILTER" "1"}}}}))

(defn ^:task coal-mine-01 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "1")))

(defn ^:task coal-mine-02 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "2")))

(defn ^:task coal-mine-03 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "3")))

(defn ^:task coal-mine-04 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "4")))

(defn ^:task coal-mine-05 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "5")))

(defn ^:task coal-mine-06 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "6")))

(defn ^:task coal-mine-07 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "7")))

(defn ^:task coal-mine-08 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "8")))

(defn ^:task coal-mine-09 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "9")))

(defn ^:task coal-mine-10 [options]
  (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN"
    (add-partition-filter options "10")))
