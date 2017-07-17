(ns canary.runner.shell
  "High-level utils for working with shell."
  (:require [me.raynes.conch.low-level :as sh]
            [me.raynes.fs :as fs]
            [canary.runner.output :as output]
            [canary.runner.print :refer [announce]]
            [canary.runner.utils :as utils]
            [clojure.java.io :as io])
  (:import (java.io InputStream)))

(def max-output-buffer 1M)

; -- helpers ----------------------------------------------------------------------------------------------------------------

(defn stream-output! [^InputStream stream]
  (assert (.markSupported stream))
  (.mark stream max-output-buffer)
  (output/print-stream-as-lines! stream output/synchronized-out-printer))

(defn stream-proc-output! [proc]
  (stream-output! (:out proc))
  (stream-output! (:err proc)))

(defn determine-workdir-for-task [task options]
  (let [job-slug (utils/sanitize-as-filename (or (:job-id options) "_local-job"))
        task-slug (utils/sanitize-as-filename (:name task))
        task-workdir (str (:workdir options) "/" "jobs" "/" job-slug "/" "tasks" "/" task-slug)]
    task-workdir))

(defn ensure-clean-workdir! [path]
  (when (fs/exists? path)
    (assert (fs/directory? path))
    (fs/delete-dir path))
  (fs/mkdirs path))

(defn prepare-workdir! [task options]
  (let [workdir-path (determine-workdir-for-task task options)]
    (ensure-clean-workdir! workdir-path)
    workdir-path))

(defn reset-stream [proc which]
  (let [stream (proc which)]
    (.reset stream)
    stream))

(defn extract-outputs [result proc]
  (let [rewind-proc (partial reset-stream proc)]
    (assoc result
      :out (sh/stream-to-string rewind-proc :out)
      :err (sh/stream-to-string rewind-proc :err))))

(defn make-shell-launcher [file & [env]]
  (let [path (str file)
        name (.getName file)]
    (fn [options]
      (let [task (meta options)]
        (let [workdir (prepare-workdir! task options)
              proc (sh/proc path :verbose false :dir workdir :env env)]
          (stream-proc-output! proc)
          (let [status (sh/exit-code proc)]
            (announce (str "shell task " name " exit-code: " status) 2 options)
            (-> {:exit-code status}
                (extract-outputs proc))))))))

(defn launch! [cmd args & [options]]
  (let [proc (apply sh/proc cmd args)]
    (when (:stream-output options)
      (stream-proc-output! proc))
    (let [status (sh/exit-code proc)]
      (-> {:exit-code status}
          (extract-outputs proc)))))
