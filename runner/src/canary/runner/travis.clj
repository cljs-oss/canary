(ns canary.runner.travis
  "Supporting Travis functionality for tasks."
  (:require [me.raynes.conch.low-level :as sh]
            [clojure.data.json :as json]
            [clojure.string :as string]
            [canary.runner.shell :as shell]
            [canary.runner.print :refer [announce]]
            [canary.runner.env :as env]
            [canary.runner.i18n :as i18n]
            [canary.runner.utils :as utils]
            [canary.runner.print :as print])
  (:import (java.net URLEncoder)))

(defn mock-travis-requests-response [args]
  (let [fake-response (json/write-str {"repository" {"slug" "some-repo/some-project"}
                                       "request"    {"repository" {"id" "n/a"}}})]
    {:exit-code 0
     :out       fake-response}))

(defn mock-travis-response [cmd args]
  (let [api-endpoint (last args)]
    (cond
      (re-matches #"^https://api.travis-ci.org/repo/.*/requests$" api-endpoint) (mock-travis-requests-response args)
      :else (throw (utils/ex (i18n/unable-to-mock-travis-api-msg cmd args))))))

(defn launch! [cmd args options]
  (announce (str "> curl " args) 2 options)
  (if (:production options)
    (shell/launch! cmd args)
    (mock-travis-response cmd args)))

(defn make-build-url [slug request-id]
  ; TODO: we will have to query travis API to get list of builds triggered by this request id
  (str "https://travis-ci.org/" slug "/builds/"))

(defn parse-response [content]
  (try
    (json/read-str content)
    (catch Throwable e
      (throw (utils/ex (i18n/api-invalid-json-response-msg (.getMessage e) content))))))

(defn inspect-api-response [response-text options]
  (let [response (parse-response response-text)
        mocked-label (if-not (:production options) "(mocked) " "")]
    (announce (str mocked-label "Travis response:\n" (utils/pp response)) 2 options)))

(defn post-to-travis-api! [api-endpoint token request-body options]
  (let [curl-args ["-s" "-X" "POST"
                   "-H" "Content-Type: application/json"
                   "-H" "Accept: application/json"
                   "-H" "Travis-API-Version: 3"
                   "-H" (str "Authorization: token " token)
                   "-d" (json/write-str request-body)
                   api-endpoint]]
    (let [result (launch! "curl" curl-args options)]
      (if (and (zero? (:exit-code result)) (empty? (:err result)))
        (inspect-api-response (:out result) options)
        (throw (utils/ex (i18n/curl-failed-msg (:err result))))))))

(defn prepare-build-env [options]
  (let [{:keys [build-id build-download-url travis-build-url]} (:build-result options)]
    {"CANARY_BUILD"                 "1"
     "CANARY_CLOJURESCRIPT_VERSION" build-id
     "CANARY_CLOJURESCRIPT_JAR_URL" build-download-url
     "CANARY_TRAVIS_BUILD_URL"      travis-build-url}))

(defn trigger-build-with-token! [slug token options]
  (let [api-slug (URLEncoder/encode slug)
        api-endpoint (str "https://api.travis-ci.org/repo/" api-slug "/requests")
        build-result (:build-result options)
        body {:request
              {:branch  (or (:travis-branch options) "master")
               :message (str "canary build with ClojureScript " (:build-id build-result))
               :config  {:merge_mode "deep_merge"
                         :env        (prepare-build-env options)}}}
        request-body (merge body (:travis-body options))
        response (post-to-travis-api! api-endpoint token request-body options)
        repo-slug (get-in response ["repository" "slug"])
        request-id (get-in response ["request" "repository" "id"])
        build-url (make-build-url repo-slug request-id)
        report (str "triggered a build of " repo-slug " => request id " request-id)]
    {:status :ok
     :report report}))

(defn retrieve-token [token-var-name options]
  (if (:production options)
    (env/get token-var-name)
    "non-production-dummy-token-value"))

(defn trigger-build! [slug token-var-name options]
  (announce (str "Triggering Travis build of " (print/repo-slug slug) " and waiting for results..."))
  (announce (str "trigger-build! " slug " " token-var-name "\n" (utils/pp options)) 2 options)
  (if-some [api-token (retrieve-token token-var-name options)]
    (trigger-build-with-token! slug api-token options)
    (throw (utils/ex (i18n/api-token-not-set-msg token-var-name)))))
