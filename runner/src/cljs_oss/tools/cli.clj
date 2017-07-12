(ns cljs-oss.tools.cli
  "Command-line interface helpers."
  (:require [cljs-oss.tools.utils :as utils]))

; -- parsers & validators ---------------------------------------------------------------------------------------------------

(defn timeout-cli-parser [str-val]
  (assert (string? str-val))
  (utils/seconds-to-msec (Long/parseLong str-val)))

(def timeout-cli-validator [#(not (neg? %)) "Timeout must be a positive number or zero (to disable it)."])

; -- helpers for constructing cli options -----------------------------------------------------------------------------------

(defn timeout-cli-option [cli-spec]
  (concat cli-spec [:parse-fn timeout-cli-parser
                    :validate timeout-cli-validator]))

(defn normal-cli-option [cli-spec]
  cli-spec)

(defn verbosity-cli-option [cli-spec]
  (concat cli-spec [:id :verbosity
                    :default 0
                    :assoc-fn (fn [m k _] (update m k inc))]))
