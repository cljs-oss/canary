(ns cljs-oss.tools.build
  "Special task for building ClojureScript compiler."
  (:require [cljs-oss.tools.print :as print :refer [announce with-task-printing]]
            [cljs-oss.tools.utils :as utils]
            [cljs-oss.tools.shell :as shell]
            [clojure.java.io :as io]
            [cljs-oss.tools.env :as env]))

(def build-script-path "scripts/build_compiler.sh")

(defn build-compiler! [build-task compiler-rev compiler-repo options]
  ; note it seemed to be easier to resort to shell for building the compiler
  (let [script (io/file (utils/canonical-path build-script-path))
        env {"COMPILER_REPO"     compiler-repo
             "COMPILER_REV"      compiler-rev
             "CANARY_VERBOSITY"  (str (:verbosity options))
             "CANARY_REPO_TOKEN" (env/get "CANARY_REPO_TOKEN")}                                                               ; we want to get advantage of .env files
        build-launcher (shell/make-shell-launcher script env)
        result (build-launcher (with-meta options build-task))]
    (if (= (:exit-code result) 0)
      (println "success!")
      (throw (ex-info "compiler build failed" {})))))

(defn prepare-compiler! [options]
  (let [{:keys [compiler-rev compiler-repo]} options]
    (announce (str (print/emphasize "building") " compiler rev " compiler-rev " from " compiler-repo))
    (let [build-task {:name  "compiler build"
                      :color :cyan}]
      (with-task-printing build-task options
        (build-compiler! build-task compiler-rev compiler-repo options)))))
