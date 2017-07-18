(ns canary.runner.build
  "Special task for building ClojureScript compiler."
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [canary.runner.print :as print :refer [announce with-task-printing]]
            [canary.runner.utils :as utils]
            [canary.runner.shell :as shell]
            [canary.runner.env :as env]
            [canary.runner.i18n :as i18n]))

(def build-script-path "scripts/build_compiler.sh")

(defn read-build-result [options]
  (let [workdir (:workdir options)
        result-file-path (utils/canonical-path (str workdir "/result.edn"))
        edn-file (io/file result-file-path)]
    (try
      (let [data (edn/read-string (slurp edn-file))]
        (assert (map? data))
        data)
      (catch Throwable e
        (throw (utils/ex (i18n/result-file-problem-msg result-file-path (.getMessage e))))))))

(defn build-compiler! [build-task compiler-rev compiler-repo options]
  ; note it seemed to be easier to resort to shell for building the compiler
  (let [script (io/file (utils/canonical-path build-script-path))
        env {"CANARY_COMPILER_REPO" compiler-repo
             "CANARY_COMPILER_REV"  compiler-rev
             "CANARY_RESULT_DIR"    (:workdir options)
             "CANARY_REPO_TOKEN"    (env/get "CANARY_REPO_TOKEN")                                                             ; we want to get advantage of .env files
             "CANARY_VERBOSITY"     (str (:verbosity options))
             "CANARY_CACHE_DIR"     (str (:cachedir options))
             "CANARY_PRODUCTION"    (str (:production options))}
        build-launcher (shell/make-shell-launcher script env)
        result (build-launcher (with-meta options build-task))
        exit-code (:exit-code result)]
    (if (zero? exit-code)
      (read-build-result options)
      (throw (utils/ex (i18n/compiler-build-failed exit-code))))))

(defn prepare-compiler! [options]
  (let [{:keys [compiler-rev compiler-repo test]} options
        build-task {:name  "compiler build"
                    :color :cyan}]
    (if test
      (do
        (announce (i18n/skipping-building-compiler-msg compiler-rev compiler-repo))
        {:build-id "1.9.000-deadbeef"})
      (do
        (announce (i18n/building-compiler-msg compiler-rev compiler-repo))
        (with-task-printing build-task options
          (build-compiler! build-task compiler-rev compiler-repo options))))))
