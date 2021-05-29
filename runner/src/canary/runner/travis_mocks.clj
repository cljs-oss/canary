(ns canary.runner.travis-mocks
  "Quick & dirty solution for mocking Travis requests at curl level."
  (:require [clojure.data.json :as json]
            [canary.runner.utils :as utils]
            [canary.runner.i18n :as i18n]))

; -- context ----------------------------------------------------------------------------------------------------------------

(def ^:dynamic *mock-request-context* nil)

(defn new-mock-request-context []
  (atom {:info-counter 0}))

; ---------------------------------------------------------------------------------------------------------------------------

(def trigger-request-response
  {"repository" {"slug" "some-repo/some-project"}
   "request"    {"id"         0
                 "repository" {"id" "n/a"}}})

(def pending-request-info
  {"id"         0
   "repository" {"slug" "some-repo/some-project"}
   "state"      "pending"})

(def created-request-info
  {"id"         0
   "repository" {"slug" "some-repo/some-project"}
   "state"      "finished"
   "builds"     [{"id"     1
                  "number" 11
                  "state"  "created"}
                 {"id"     2
                  "number" 22
                  "state"  "created"}]})

(def running-request-info
  {"id"         0
   "repository" {"slug" "some-repo/some-project"}
   "state"      "finished"
   "builds"     [{"id"     1
                  "number" 11
                  "state"  "started"}
                 {"id"       2
                  "number"   22
                  "state"    "errored"
                  "duration" 1}]})

(def done-request-info
  {"id"         0
   "repository" {"slug" "some-repo/some-project"}
   "state"      "finished"
   "builds"     [{"id"       1
                  "number"   11
                  "state"    "passed"
                  "duration" 10}
                 {"id"       2
                  "number"   22
                  "state"    "errored"
                  "duration" 1}]})

(defn mock-travis-requests-response [args]
  {:exit-code 0
   :out       (json/write-str trigger-request-response)})


(defn mock-travis-request-info-response [args]
  (assert (some? *mock-request-context*))
  (let [counter (:info-counter (swap! *mock-request-context* update :info-counter inc))
        fake-response (cond
                        (< counter 3) pending-request-info
                        (and (>= counter 3) (< counter 5)) created-request-info
                        (and (>= counter 5) (< counter 10)) running-request-info
                        :else done-request-info)]
    {:exit-code 0
     :out       (json/write-str fake-response)}))

(defn mock-travis-response [cmd args]
  (let [api-endpoint (last args)]
    (cond
      (re-matches #"^https://.*/repo/.*/requests$" api-endpoint) (mock-travis-requests-response args)
      (re-matches #"^https://.*/repo/.*/request/0$" api-endpoint) (mock-travis-request-info-response args)
      :else (throw (utils/ex (i18n/unable-to-mock-travis-api-msg cmd args))))))

; ---------------------------------------------------------------------------------------------------------------------------
; example request trigger response from https://api.travis-ci.org/repo/[slug]/requests

; {"@type" "pending",
;  "remaining_requests" 9,
;  "repository"
;  {"@type" "repository",
;   "@href" "/repo/3839739",
;   "@representation" "minimal",
;   "id" 3839739,
;   "name" "cljs-devtools",
;   "slug" "binaryage/cljs-devtools"},
;  "request"
;  {"repository"
;   {"id" 29934632, "owner_name" "binaryage", "name" "cljs-devtools"},
;   "user" {"id" 26483},
;   "id" 76690473,
;   "message" "canary build with ClojureScript 1.9.817-281ed98",
;   "branch" "master",
;   "config"
;   {"merge_mode" "deep_merge",
;    "env"
;    {"CANARY_BUILD" "1",
;     "CANARY_CLOJURESCRIPT_VERSION" "1.9.817-281ed98",
;     "CANARY_CLOJURESCRIPT_JAR_URL"
;     "https://github.com/cljs-oss/canary/releases/download/r1.9.817-281ed98/clojurescript-1.9.817-281ed98.jar",
;     "CANARY_TRAVIS_BUILD_URL" "n/a"}}},
;  "resource_type" "request"}

; ---------------------------------------------------------------------------------------------------------------------------
; example request info response from https://api.travis-ci.org/repo/[slug]/request/[id]
;
; {"message" nil,
;  "owner"
;  {"@type" "organization",
;   "@href" "/org/23773",
;   "@representation" "minimal",
;   "id" 23773,
;   "login" "binaryage"},
;  "@href" "/repo/3839739/request/76577839",
;  "branch_name"
;  {"@type" "branch",
;   "@href" "/repo/3839739/branch/master",
;   "@representation" "minimal",
;   "name" "master"},
;  "builds"
;  [{"@href" "/build/254467456",
;    "pull_request_number" nil,
;    "previous_state" "errored",
;    "id" 254467456,
;    "@representation" "minimal",
;    "started_at" nil,
;    "event_type" "api",
;    "number" "313",
;    "duration" nil,
;    "state" "created",
;    "pull_request_title" nil,
;    "@type" "build",
;    "finished_at" nil}],
;  "repository"
;  {"@type" "repository",
;   "@href" "/repo/3839739",
;   "@representation" "minimal",
;   "id" 3839739,
;   "name" "cljs-devtools",
;   "slug" "binaryage/cljs-devtools"},
;  "id" 76577839,
;  "@representation" "standard",
;  "event_type" "api",
;  "commit"
;  {"@type" "commit",
;   "@representation" "minimal",
;   "id" 73961817,
;   "sha" "45c1df1e0de53c9d320963b296bd7a741056599c",
;   "ref" nil,
;   "message" "canary build with ClojureScript ",
;   "compare_url"
;   "https://github.com/binaryage/cljs-devtools/compare/d3af0f855d94d0a2b906b1840b5c7534cedbb768...45c1df1e0de53c9d320963b296bd7a741056599c",
;   "committed_at" "2017-07-14T22:04:48Z"},
;  "state" "finished",
;  "created_at" "2017-07-17T14:37:25Z",
;  "@type" "request",
;  "result" "approved"}
