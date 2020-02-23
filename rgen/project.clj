(defproject cljs-oss/canary-rgen "0.1.0-SNAPSHOT"
  :description "A tool for generating readme overview from canary reports."
  :url "https://github.com/cljs-oss/canary"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.cli "1.0.194"]
                 [funcool/cuerdas "2.2.1"]
                 [clansi "1.0.0"]
                 [me.raynes/fs "1.4.6"]]
  :source-paths ["src"]
  :main canary.rgen)
