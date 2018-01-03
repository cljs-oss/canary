(ns canary.rgen.print
  (:require [cuerdas.core :as cuerdas]
            [clansi]))

; -- announcement printing --------------------------------------------------------------------------------------------------

(defn announce [message & [verbosity options]]
  (when (or (nil? verbosity) (<= verbosity (:verbosity options)))
    (println message)))

; -- styling wrappers -------------------------------------------------------------------------------------------------------

(defn file-path [text]
  (clansi/style text :yellow))

(defn dump [text]
  (->> text
       (cuerdas/lines)
       (map #(clansi/style % :black))
       (cuerdas/unlines)))
