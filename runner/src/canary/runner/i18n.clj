(ns canary.runner.i18n
  "Localizable messages."
  (:require [clojure.string :as string]))

(defn ^:dynamic cli-usage [options-summary]
  (string/join \newline ["Exercises ClojureScript projects with a pinned ClojureScript version."
                         ""
                         "Usage: ./run.sh job [options]"
                         ""
                         "Options:"
                         options-summary]))

(defn ^:dynamic cli-errors-msg [errors]
  (str "The following errors occurred while parsing your command:\n"
       (string/join \newline (map #(str "  * " %) errors))))

(defn ^:dynamic cli-validation-msg [errors]
  (str "The following issues occurred while interpreting your command:\n"
       (string/join \newline (map #(str "  * " %) errors))))

(defn ^:dynamic api-invalid-json-response-msg [error response]
  (str "Travis API responded with invalid JSON: " error "\n" response))

(defn ^:dynamic api-token-not-set-msg [token-var-name]
  (str "Travis API token '" token-var-name "' not set in the environment"))

(defn ^:dynamic curl-failed-msg [curl-args error]
  (str "Error: curl failed while talking to Travis:\n" (vec curl-args) "\n" error))

(defn ^:dynamic env-file-problem-msg [path reason]
  (str "Unable to to read env edn file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn ^:dynamic result-file-problem-msg [path reason]
  (str "Unable to to read env edn file at '" path "'" (if (some? reason) (str ", reason: " reason "."))))

(defn ^:dynamic projects-dir-not-exists-msg [projects-dir]
  (str "Projects directory does not exist at '" projects-dir "'"))

(defn ^:dynamic projects-dir-not-dir-msg [projects-dir]
  (str "Projects directory does not seem to be a readable directory at '" projects-dir "'"))

(defn ^:dynamic compiler-build-failed [exit-code]
  (str "compiler build failed (exit code " exit-code))

(defn ^:dynamic unable-to-mock-travis-api-msg [cmd args]
  (str "Unable to mock Travis API: " cmd " " (pr-str args)))

(defn ^:dynamic travis-request-didnt-complete-in-time [slug request-id]
  (str "Travis request #" request-id " for " slug " didn't complete in time"))

(defn ^:dynamic received-unrecognized-travis-request-state [travis-state]
  (str "Received unrecognized Travis request state '" travis-state "'"))
