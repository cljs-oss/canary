(ns canary.tests.helpers
  (:require [clojure.test :refer :all]
            [canary.runner.defaults :as defaults]))

(def default-options
  {:projects         defaults/projects-dir
   :workdir          defaults/work-dir
   :cachedir         defaults/cache-dir
   :verbosity        0
   :job-id           "0"
   :timeout          defaults/timeout
   :polling-interval defaults/polling-interval
   :spawning-delay   defaults/spawning-delay})
