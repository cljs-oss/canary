(ns canary.runner
  "Command-line interface for runner."
  (:require [clojure.string :as string]
            [clojure.tools.cli :as cli]
            [canary.runner.jobs :as jobs]
            [canary.runner.utils :as utils]
            [canary.runner.cli :refer [timeout-cli-option normal-cli-option verbosity-cli-option]]
            [canary.runner.output :as output]
            [canary.runner.i18n :as i18n]
            [canary.runner.defaults :as defaults]
            [me.raynes.fs :as fs])
  (:gen-class))

(def cli-options
  [(normal-cli-option ["-r" "--compiler-rev REV" (i18n/compiler-rev-cli-desc) :default defaults/compiler-rev])
   (normal-cli-option [nil "--compiler-repo URL" (i18n/compiler-repo-cli-desc) :default defaults/compiler-repo])
   (normal-cli-option ["-p" "--projects DIR" (i18n/projects-cli-desc) :default defaults/projects-dir])
   (normal-cli-option [nil "--workdir DIR" (i18n/workdir-cli-desc) :default defaults/work-dir])
   (normal-cli-option [nil "--cachedir DIR" (i18n/cachedir-cli-desc) :default defaults/cache-dir])
   (normal-cli-option [nil "--only SUBSTR" (i18n/only-cli-desc)])
   (normal-cli-option [nil "--job-id ID" (i18n/job-id-cli-desc) :default "0"])
   (timeout-cli-option [nil "--polling-interval SECONDS" (i18n/polling-interval-cli-desc) :default defaults/polling-interval])
   (timeout-cli-option [nil "--timeout SECONDS" (i18n/timeout-cli-desc) :default defaults/timeout])
   (normal-cli-option [nil "--production" (i18n/production-cli-desc)])
   (normal-cli-option ["-t" "--test" (i18n/test-cli-desc)])
   (verbosity-cli-option ["-v" nil (i18n/verbosity-cli-desc)])
   (normal-cli-option ["-h" "--help"])])

(defn expand-paths [options]
  (assoc options
    :projects (utils/canonical-path (:projects options))
    :workdir (utils/canonical-path (:workdir options))
    :cachedir (utils/canonical-path (:cachedir options))))

(defn sanitize-options [options]
  (-> options
      (expand-paths)))

(defn validate-options [options]
  (let [projects-dir (:projects options)
        issues (cond-> []
                       (not (fs/exists? projects-dir)) (conj (i18n/projects-dir-not-exists-msg projects-dir))
                       (and (fs/exists? projects-dir)
                            (or (not (fs/directory? projects-dir))
                                (not (fs/readable? projects-dir)))) (conj (i18n/projects-dir-not-dir-msg projects-dir)))]
    (if-not (empty? issues)
      issues)))

(defn run-job-action! [options]
  (let [sanitized-options (sanitize-options options)
        validation-errors (validate-options sanitized-options)]
    (if (some? validation-errors)
      (utils/exit! 2 (i18n/cli-validation-msg validation-errors))
      (jobs/run! sanitized-options))))

(defn run-list-action! [options]
  ; TODO: implement this
  0)

; -- main entry point -------------------------------------------------------------------------------------------------------

(defn -main [& args]
  (let [{:keys [arguments options errors summary]} (cli/parse-opts args cli-options)
        action (first arguments)]
    (cond
      errors (utils/exit! 1 (i18n/cli-errors-msg errors))
      (zero? (count arguments)) (utils/exit! 3 (i18n/no-cli-actions))
      (> (count arguments) 1) (utils/exit! 3 (i18n/too-many-cli-actions arguments))
      (:help options) (utils/exit! 0 (i18n/cli-usage-msg summary))
      :else (case action
              "job" (utils/exit! (run-job-action! options))
              "list" (utils/exit! (run-list-action! options))
              "help" (utils/exit! 0 (i18n/cli-usage-msg summary))))))
