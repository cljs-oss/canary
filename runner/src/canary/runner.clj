(ns canary.runner
  "Command-line interface for runner."
  (:require [clojure.tools.cli :as cli]
            [canary.runner.jobs :as jobs]
            [canary.runner.utils :as utils]
            [canary.runner.cli :refer [timeout-cli-option normal-cli-option verbosity-cli-option]]
            [canary.runner.i18n :as i18n]
            [canary.runner.defaults :as defaults]
            [me.raynes.fs :as fs]
            [cuerdas.core :as cuerdas]
            [clojure.java.io :as io]
            [clojure.string :as string])
  (:gen-class)
  (:import (java.util.regex PatternSyntaxException)))

; -- command-line options ---------------------------------------------------------------------------------------------------

(def cli-options
  [(normal-cli-option ["-r" "--compiler-rev REV" (i18n/compiler-rev-cli-desc) :default defaults/compiler-rev])
   (normal-cli-option ["-c" "--compiler-repo URL" (i18n/compiler-repo-cli-desc) :default defaults/compiler-repo])
   (normal-cli-option ["-p" "--projects DIR" (i18n/projects-cli-desc) :default defaults/projects-dir])
   (normal-cli-option [nil "--workdir DIR" (i18n/workdir-cli-desc) :default defaults/work-dir])
   (normal-cli-option [nil "--cachedir DIR" (i18n/cachedir-cli-desc) :default defaults/cache-dir])
   (normal-cli-option [nil "--only SUBSTR" (i18n/only-cli-desc)])
   (normal-cli-option [nil "--except SUBSTR" (i18n/except-cli-desc)])
   (normal-cli-option [nil "--include REGEX" (i18n/include-cli-desc)])
   (normal-cli-option [nil "--exclude REGEX" (i18n/exclude-cli-desc)])
   (normal-cli-option [nil "--job-id ID" (i18n/job-id-cli-desc) :default "0"])
   (timeout-cli-option [nil "--polling-interval SECONDS" (i18n/polling-interval-cli-desc) :default defaults/polling-interval])
   (timeout-cli-option [nil "--timeout SECONDS" (i18n/timeout-cli-desc) :default defaults/timeout])
   (timeout-cli-option [nil "--spawning-delay SECONDS" (i18n/spawning-delay-cli-desc) :default defaults/spawning-delay])
   (normal-cli-option [nil "--production" (i18n/production-cli-desc)])
   (verbosity-cli-option ["-v" nil (i18n/verbosity-cli-desc)])
   (normal-cli-option ["-h" "--help"])])

; -- options validation -----------------------------------------------------------------------------------------------------

(defn expand-paths [options]
  (assoc options
    :projects (utils/canonical-path (:projects options))
    :workdir (utils/canonical-path (:workdir options))
    :cachedir (utils/canonical-path (:cachedir options))))

(defn expand-compiler-repo [repo]
  (cond
    (string/includes? repo "://") repo                                                                                        ; assume full git repo url e.g. https://github.com/clojure/clojurescript.git
    (string/includes? repo "/") (str "https://github.com/" repo ".git")                                                       ; assume short github repo location e.g. frenchy64/clojurescript
    :else (str "https://github.com/" repo "/clojurescript.git")))                                                             ; assume github fork name only e.g. frenchy64

(defn resolve-compiler-repo [options]
  (assoc options
    :compiler-repo (expand-compiler-repo (:compiler-repo options))))

(defn make-regex [val]
  (try
    (re-pattern (str val))
    (catch PatternSyntaxException e
      ; a map value represents an error for check-filters
      {:val     val
       :message (first (cuerdas/lines (.getMessage e)))})))

(defn make-regexs [options]
  (cond-> options
          (some? (:include options)) (update :include make-regex)
          (some? (:exclude options)) (update :exclude make-regex)))

(defn check-projects-dir [options]
  (let [projects-dir (:projects options)]
    (cond-> []
            (not (fs/exists? projects-dir)) (conj (i18n/projects-dir-not-exists-msg projects-dir))
            (and (fs/exists? projects-dir)
                 (or (not (fs/directory? projects-dir))
                     (not (fs/readable? projects-dir)))) (conj (i18n/projects-dir-not-dir-msg projects-dir)))))

(defn check-filters [options]
  (let [{:keys [include exclude]} options]
    (cond-> []
            (map? include) (conj (str "Invalid regex pattern --include '" (:val include) "': " (:message include)))
            (map? exclude) (conj (str "Invalid regex pattern --exclude '" (:val exclude) "': " (:message exclude))))))

(defn add-root-dir [options]
  (let [root-dir (utils/canonical-path (str (.getCanonicalFile (io/file ".")) "/.."))]
    (assert (and (not (empty? root-dir))
                 (fs/directory? root-dir)
                 (fs/exists? (str root-dir "/runner/run.sh"))))
    (assoc options :rootdir root-dir)))

(defn sanitize-and-validate-options [options]
  (let [sanitized-options (-> options
                              (expand-paths)
                              (resolve-compiler-repo)
                              (make-regexs)
                              (add-root-dir))
        errors (concat (check-projects-dir sanitized-options)
                       (check-filters sanitized-options))]
    [sanitized-options errors]))

(defn check-options! [options]
  (let [[sanitized-options validation-errors] (sanitize-and-validate-options options)]
    (if (empty? validation-errors)
      sanitized-options
      (utils/exit! 2 (i18n/cli-validation-msg validation-errors)))))

; -- actions ----------------------------------------------------------------------------------------------------------------

(defn perform-job-action! [options]
  (let [sanitized-options (check-options! (assoc options :action :job))]
    (jobs/run! sanitized-options)))

(defn perform-list-action! [options]
  (let [sanitized-options (check-options! (assoc options :action :list))]
    (jobs/list! sanitized-options)))

; -- main entry point -------------------------------------------------------------------------------------------------------

(defn -main [& args]
  (utils/install-uncaught-exception-handler!)
  (let [{:keys [arguments options errors summary]} (cli/parse-opts args cli-options)
        action (first arguments)]
    (cond
      errors (utils/exit! 1 (i18n/cli-errors-msg errors))
      (zero? (count arguments)) (utils/exit! 3 (i18n/no-cli-actions))
      (> (count arguments) 1) (utils/exit! 4 (i18n/too-many-cli-actions arguments))
      (:help options) (utils/exit! 0 (i18n/cli-usage-msg summary))
      :else (case action
              "job" (utils/exit! (perform-job-action! options))
              "list" (utils/exit! (perform-list-action! options))
              "help" (utils/exit! 0 (i18n/cli-usage-msg summary))))))
