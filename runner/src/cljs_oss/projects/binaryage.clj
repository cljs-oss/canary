(ns cljs-oss.projects.binaryage
  (:require [cljs-oss.tools.support :refer [trigger-travis-build!]]))

(defn ^:task cljs-devtools [options]
  (trigger-travis-build! "binaryage/cljs-devtools" "CLJS_DEVTOOLS_TRAVIS_TOKEN" options))
