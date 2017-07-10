(ns cljs-oss.tools.shell
  "High-level utils for working with shell."
  (:require [me.raynes.conch.low-level :as sh]
            [cljs-oss.tools.output :as output]
            [cljs-oss.tools.printing :refer [announce]]))

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn out-printer [& args]
  (apply println args))

(defn err-printer [& args]
  (binding [*out* *err*]
    (apply println args)))

(defn stream-proc-output! [proc]
  (output/print-stream-as-lines! (:out proc) out-printer)
  (output/print-stream-as-lines! (:err proc) err-printer))

(defn make-shell-launcher [file]
  (let [path (str file)
        name (.getName file)]
    (fn [options]
      (let [task (meta options)]
        (when (:verbose options)
          (announce (str "launching a shell task " name " at '" path "'")))
        ; TODO: run it in a sandboxed workdir
        ; TODO: pass some environment?
        (let [proc (sh/proc path :verbose (:verbose options))]
          (stream-proc-output! proc)
          (let [status (sh/exit-code proc)]
            (when (:verbose options)
              (announce (str "shell task " name " exit-code: " status)))
            {:exit-code status}))))))
