(ns cljs-oss.tools.build
  "Special task for building ClojureScript compiler."
  (:require [cljs-oss.tools.print :as print :refer [announce with-task-printing]]
            [cljs-oss.tools.utils :as utils]
            [cljs-oss.tools.shell :as shell]
            [clojure.java.io :as io]))

(def build-script-path "scripts/build_compiler.sh")
(def default-compiler-repo "https://github.com/clojure/clojurescript.git")
(def default-compiler-rev "master")

(defn build-compiler! [build-task compiler-rev options]
  ; note it seemed to be easier to resort to shell for building the compiler
  (let [script (io/file (utils/canonical-path build-script-path))
        env {"COMPILER_REPO" (or (:compiler-repo options) default-compiler-repo)
             "COMPILER_REV"  compiler-rev
             "CANARY_VERBOSITY" (str (:verbosity options))}
        build-launcher (shell/make-shell-launcher script env)
        result (build-launcher (with-meta options build-task))]
    (if (= (:exit-code result) 0)
      (println "success!")
      (println "fail!"))))

(defn prepare-compiler! [options]
  (let [compiler-rev (or (:compiler options) default-compiler-rev)]
    (announce (str (print/emphasize "building") " compiler " compiler-rev))
    (let [build-task {:name  "compiler build"
                      :color :bright}]
      (with-task-printing build-task options
        (build-compiler! build-task compiler-rev options)))))
