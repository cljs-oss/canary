(ns canary.runner.build
  "A special task for building ClojureScript compiler."
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [canary.runner.print :refer [announce with-task-printing]]
            [canary.runner.utils :as utils]
            [canary.runner.shell :as shell]
            [canary.runner.env :as env]
            [canary.runner.i18n :as i18n]
            [canary.runner.defaults :as defaults]))

(defn read-build-result [workdir]
  (let [result-file-path (str workdir "/result.edn")
        edn-file (io/file result-file-path)]
    (try
      (let [data (edn/read-string (slurp edn-file))]
        (assert (map? data))
        data)
      (catch Throwable e
        (throw (utils/ex (i18n/result-file-problem-msg result-file-path (str e))))))))

(defn launch-compiler-build-script! [build-task compiler-rev compiler-repo options]
  ; note it seemed to be easier to resort to shell for building the compiler
  (let [script (io/file (utils/canonical-path defaults/build-script-path))
        env {"CANARY_COMPILER_REPO" compiler-repo
             "CANARY_COMPILER_REV"  compiler-rev
             "CANARY_RESULT_DIR"    (:workdir options)
             "CANARY_REPO_TOKEN"    (env/get "CANARY_REPO_TOKEN")                                                             ; we want to get advantage of .env files
             "CANARY_VERBOSITY"     (str (:verbosity options))
             "CANARY_CACHE_DIR"     (str (:cachedir options))
             "CANARY_PRODUCTION"    (str (:production options))}
        launch-build! (shell/make-shell-launcher script env)
        result (launch-build! (with-meta options build-task))
        exit-code (:exit-code result)]
    (if (zero? exit-code)
      (read-build-result (:workdir options))
      (throw (utils/ex (i18n/compiler-build-failed exit-code))))))

(defn build-compiler! [options]
  (let [{:keys [compiler-rev compiler-repo]} options
        build-task {:name  "compiler build"
                    :color :cyan}]
    (announce (i18n/building-compiler-msg compiler-rev compiler-repo))
    (with-task-printing build-task options
      (launch-compiler-build-script! build-task compiler-rev compiler-repo options))))
