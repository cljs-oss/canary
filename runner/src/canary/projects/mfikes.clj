(ns canary.projects.mfikes
  (:require [canary.runner.travis :as travis]))

(defn ^{:task true :homepage "mfikes/coal-mine"} coal-mine [options]
  (let [config-overrides {:env {:matrix ["PARTITION_FILTER=1"
                                         "PARTITION_FILTER=2"
                                         "PARTITION_FILTER=3"
                                         "PARTITION_FILTER=4"
                                         "PARTITION_FILTER=5"]}}
        options (assoc options :travis-config config-overrides)]
    (travis/request-build! "mfikes/coal-mine" "CANARY_COAL_MINE_TRAVIS_TOKEN" options)))

(defn ^{:task true :homepage "mfikes/cljs-bean"} cljs-bean [options]
  (travis/request-build! "mfikes/cljs-bean" "CANARY_CLJS_BEAN_TRAVIS_TOKEN" options))
