(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^:task planck [options]
  ; using just Travis matrix.include will run all default matrix job combinations plus our matrix-job-linux-clang
  ; there seems to be no sane way how to disable default matrix auto-generated jobs
  ; some people proposed various workaround with different trade-offs
  ; see https://github.com/travis-ci/travis-ci/issues/4681#issuecomment-273104167
  ; and https://github.com/travis-ci/travis-ci/issues/4681#issuecomment-278074360
  (let [matrix-job-linux-clang {:os       "linux"
                                :compiler "clang"}
        config-overrides {:mark-default-build true
                          :matrix             {:include [matrix-job-linux-clang]
                                               :exclude [{:mark-default-build true}]}}
        options (assoc options :travis-config config-overrides)]
    (travis/request-build! "mfikes/planck" "CANARY_PLANCK_TRAVIS_TOKEN" options)))
