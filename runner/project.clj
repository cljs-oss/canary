(defproject cljs-oss/canary-runner "0.1.0-SNAPSHOT"
  :description "A tool for smoke-testing ClojureScript projects with a pinned ClojureScript version."
  :url "https://github.com/cljs-oss/canary"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.3.618"]
                 [org.clojure/tools.cli "1.0.206"]
                 [org.clojure/tools.namespace "1.1.0"]
                 [org.clojure/data.json "2.3.1"]
                 [me.raynes/conch "0.8.0"]
                 [me.raynes/fs "1.4.6"]
                 [clansi "1.0.0"]
                 [funcool/cuerdas "2021.05.29-0"]
                 [indole "1.0.0"]]
  :source-paths ["src"]
  :test-paths ["test/src" "test/fixtures/projects"]
  :main canary.runner)
