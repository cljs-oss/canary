(defproject cljs-oss/canary-runner "0.1.0-SNAPSHOT"
  :description "A tool for smoke-testing ClojureScript projects with a pinned ClojureScript version."
  :url "https://github.com/cljs-oss/canary"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.4.490"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.clojure/data.json "0.2.6"]
                 [me.raynes/conch "0.8.0"]
                 [me.raynes/fs "1.4.6"]
                 [clansi "1.0.0"]
                 [funcool/cuerdas "2.2.0"]
                 [indole "1.0.0"]]
  :source-paths ["src"]
  :test-paths ["test/src" "test/fixtures/projects"]
  :main canary.runner)
