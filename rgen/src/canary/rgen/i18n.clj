(ns canary.rgen.i18n
  "Localizable messages."
  (:require [clojure.string :as string]
            [canary.rgen.print :as print]
            [canary.rgen.utils :as utils]))

; -- exceptions -------------------------------------------------------------------------------------------------------------

(defn ^:dynamic cli-errors-msg [errors]
  (str "The following errors occurred while parsing your command:\n"
       (string/join \newline (map #(str "  * " %) errors))))

(defn ^:dynamic cli-validation-msg [errors]
  (str "The following issues occurred while interpreting your command:\n"
       (string/join \newline (map #(str "  * " %) errors))))

; -- announcements ----------------------------------------------------------------------------------------------------------

(defn ^:dynamic overview-options-msg [options]
  (str "Overview command options:\n" (print/dump (utils/pp options))))

; -- cli --------------------------------------------------------------------------------------------------------------------

(defn ^:dynamic cli-usage-msg [options-summary]
  (string/join \newline ["Generates canary reports."
                         ""
                         "Usage: ./run.sh [action] [options]"
                         ""
                         "Actions:"
                         "  overview    Generate overview from canary reports (for the main readme on github)"
                         "  help        Print this usage info"
                         ""
                         "Options:"
                         options-summary]))

(defn ^:dynamic no-cli-actions []
  "Received no command-line action argument. See `./run.sh help` for available actions.")

(defn ^:dynamic too-many-cli-actions [arguments]
  (str "Received too many command-line actions: " (vec arguments) ". See `./run.sh help` for available actions.\""))

(defn ^:dynamic reports-dir-cli-desc []
  "Path to reports directory")

(defn ^:dynamic output-path-cli-desc []
  "Output path. Use - for stdout.")

(defn ^:dynamic recent-count-cli-desc []
  "How many recent tasks should be considered")

(defn ^:dynamic assets-url-cli-desc []
  "Url prefix for img/svg assets")

(defn ^:dynamic verbosity-cli-desc []
  "Verbosity level; may be specified multiple times")

