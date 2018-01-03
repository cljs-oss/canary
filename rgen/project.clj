(defproject cljs-oss/canary-rgen "0.1.0-SNAPSHOT"
  :description "A tool for generating readme overview from canary reports."
  :url "https://github.com/cljs-oss/canary"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [funcool/cuerdas "2.0.4"]
                 [clansi "1.0.0"]
                 [me.raynes/fs "1.4.6"]]
  :source-paths ["src"]
  :main canary.rgen)
