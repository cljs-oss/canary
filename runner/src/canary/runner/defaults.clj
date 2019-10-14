(ns canary.runner.defaults
  "Various defaults."
  (:require [canary.runner.utils :as utils]))

(def compiler-rev "master")
(def compiler-repo "clojure/clojurescript")
(def projects-dir "src/canary/projects")
(def work-dir ".workdir")
(def cache-dir ".cachedir")
(def timeout (utils/seconds-to-msec (* 30 60)))                                                                               ; 30min - note that travis build gets killed after approx. 45minutes
(def polling-interval (utils/seconds-to-msec (* 1 60)))                                                                       ; 1min, travis kills a job when no output is presented in last 10min
(def spawning-delay (utils/seconds-to-msec 1))                                                                                ; 1sec, to help determinism when running jobs

(def build-script-path "scripts/build_compiler.sh")
(def commit-script-path "scripts/commit_report.sh")

(def env-file ".env")

(def palette (cycle [:green :blue :yellow :magenta :cyan]))
(def job-label-padding 10)
(def task-label-padding 20)
(def time-format "mm:ss.SSS")

(def report-file "README.md")
(def options-file "options.edn")
(def tasks-file "tasks.edn")

(def max-output-buffer 1000000)

(def travis-warmup-time (utils/seconds-to-msec 60))                                                                           ; TODO: make this configurable
(def travis-polling-time (utils/seconds-to-msec 30))                                                                          ; TODO: make this configurable

(def passed-symbol "&#x2713;")
(def failed-symbol "&#x2717;")
