(ns canary.runner.build
  "Special task for building ClojureScript compiler."
  (:require [canary.runner.print :as print :refer [announce with-task-printing]]
            [canary.runner.utils :as utils]
            [canary.runner.shell :as shell]
            [clojure.java.io :as io]
            [canary.runner.env :as env]
            [clojure.edn :as edn]
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
        env {"COMPILER_REPO"     compiler-repo
             "COMPILER_REV"      compiler-rev
             "RESULT_DIR"        (:workdir options)
             "CANARY_VERBOSITY"  (str (:verbosity options))
             "CANARY_REPO_TOKEN" (env/get "CANARY_REPO_TOKEN")}                                                               ; we want to get advantage of .env files
        build-launcher (shell/make-shell-launcher script env)
        result (build-launcher (with-meta options build-task))
        exit-code (:exit-code result)]
    (if (zero? exit-code)
      (read-build-result options)
      (do
        (announce (str "compiler build failed wit exit code " exit-code))
        nil))))

(defn prepare-compiler! [options]
  (let [{:keys [compiler-rev compiler-repo test]} options
        build-task {:name  "compiler build"
                    :color :cyan}]
    (if test
      (let [build-result {:id      "?"
                          :skipped true}]
        (announce (str (print/emphasize "skipping") " building compiler rev " compiler-rev " from " compiler-repo))
        build-result)
      (do
        (announce (str (print/emphasize "building") " compiler rev " compiler-rev " from " compiler-repo))
        (with-task-printing build-task options
          (build-compiler! build-task compiler-rev compiler-repo options))))))
