(ns canary.rgen
  "Command-line interface for rgen."
  (:require [clojure.string :as string]
            [clojure.tools.cli :as cli]
            [canary.rgen.utils :as utils]
            [canary.rgen.cli :refer [normal-cli-option count-cli-option verbosity-cli-option]]
            [canary.rgen.i18n :as i18n]
            [canary.rgen.defaults :as defaults]
            [canary.rgen.overview :as overview]
            [me.raynes.fs :as fs]
            [cuerdas.core :as cuerdas])
  (:gen-class))

; -- command-line options ---------------------------------------------------------------------------------------------------

(def cli-options
  [(normal-cli-option ["-r" "--reports DIR" (i18n/reports-dir-cli-desc) :default defaults/reports-dir])
   (normal-cli-option ["-o" "--output PATH" (i18n/output-path-cli-desc) :default defaults/output-path])
   (count-cli-option ["-c" "--recent COUNT" (i18n/recent-count-cli-desc) :default defaults/recent-count])
   (normal-cli-option ["-a" "--assets URL" (i18n/assets-url-cli-desc) :default defaults/assets-url])
   (verbosity-cli-option ["-v" nil (i18n/verbosity-cli-desc)])
   (normal-cli-option ["-h" "--help"])])

; -- options validation -----------------------------------------------------------------------------------------------------

(defn expand-paths [options]
  (assoc options
    :reports (utils/canonical-path (:reports options))))

(defn add-root-dir [options]
  (let [root-dir (utils/canonical-path (str (System/getProperty "user.dir") "/.."))]                                          ; user.dir should be the 'rgen' directory
    (assert (and (not (empty? root-dir))
                 (fs/directory? root-dir)
                 (fs/exists? (str root-dir "/rgen/run.sh"))))
    (assoc options :rootdir root-dir)))

(defn sanitize-and-validate-options [options]
  (let [sanitized-options (-> options
                              (expand-paths)
                              (add-root-dir))
        errors []]                                                                                                            ; TODO: validate that reports dir exists
    [sanitized-options errors]))

(defn check-options! [options]
  (let [[sanitized-options validation-errors] (sanitize-and-validate-options options)]
    (if (empty? validation-errors)
      sanitized-options
      (utils/exit! 2 (i18n/cli-validation-msg validation-errors)))))

; -- actions ----------------------------------------------------------------------------------------------------------------

(defn perform-overview-action! [options]
  (let [sanitized-options (check-options! (assoc options :action :overview))]
    (overview/generate! sanitized-options)))

; -- main entry point -------------------------------------------------------------------------------------------------------

(defn -main [& args]
  (let [{:keys [arguments options errors summary]} (cli/parse-opts args cli-options)
        action (first arguments)]
    (cond
      errors (utils/exit! 1 (i18n/cli-errors-msg errors))
      (zero? (count arguments)) (utils/exit! 3 (i18n/no-cli-actions))
      (> (count arguments) 1) (utils/exit! 4 (i18n/too-many-cli-actions arguments))
      (:help options) (utils/exit! 0 (i18n/cli-usage-msg summary))
      :else (case action
              "overview" (utils/exit! (perform-overview-action! options))
              "help" (utils/exit! 0 (i18n/cli-usage-msg summary))))))
