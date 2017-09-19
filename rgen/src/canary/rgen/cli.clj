(ns canary.rgen.cli
  "Command-line interface helpers.")

; -- parsers & validators ---------------------------------------------------------------------------------------------------

(defn count-cli-parser [str-val]
  (assert (string? str-val))
  (Long/parseLong str-val))

(def count-cli-validator [#(not (neg? %)) "Count must be a positive number or zero (to disable it)."])

; -- helpers for constructing cli options -----------------------------------------------------------------------------------

(defn count-cli-option [cli-spec]
  (concat cli-spec [:parse-fn count-cli-parser
                    :validate count-cli-validator]))

(defn normal-cli-option [cli-spec]
  cli-spec)

(defn verbosity-cli-option [cli-spec]
  (concat cli-spec [:id :verbosity
                    :default 0
                    :assoc-fn (fn [m k _] (update m k inc))]))
