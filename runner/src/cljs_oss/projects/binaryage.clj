(ns cljs-oss.projects.binaryage
  (:require [cljs-oss.tools.travis :as travis]))

(defn ^:task cljs-devtools [options]
  (travis/trigger-build! "binaryage/cljs-devtools" "CANARY_CLJS_DEVTOOLS_TRAVIS_TOKEN" "master" options))
