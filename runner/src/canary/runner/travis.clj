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
            [canary.runner.print :as print]
            [canary.runner.travis-mocks :as travis-mocks])
  (:import (java.net URLEncoder)
           (java.util.concurrent TimeUnit)))

(defn launch! [cmd args options]
  (announce (i18n/curl-command-msg args) 2 options)
  (if (:production options)
    (shell/launch! cmd args)
    (travis-mocks/mock-travis-response cmd args)))

(defn parse-response [content]
  (try
    (json/read-str content)
    (catch Throwable e
      (throw (utils/ex (i18n/api-invalid-json-response-msg (.getMessage e) content))))))

(defn inspect-api-response [response-text options]
  (let [response (parse-response response-text)]
    (announce (i18n/travis-response-msg response (:production options)) 2 options)
    response))

(defn talk-to-travis-api! [curl-args options]
  (let [result (launch! "curl" curl-args options)]
    (if (and (zero? (:exit-code result)) (empty? (:err result)))
      (inspect-api-response (:out result) options)
      (throw (utils/ex (i18n/curl-failed-msg curl-args (:err result)))))))

(defn common-curl-args [token]
  ["-sS"
   "-H" "Travis-API-Version: 3"
   "-H" (str "Authorization: token " token)])

(defn post-to-travis-api! [api-endpoint token request-body options]
  (let [curl-args (concat (common-curl-args token)
                          ["-s" "-X" "POST"
                           "-H" "Content-Type: application/json"
                           "-H" "Accept: application/json"
                           "-d" (json/write-str request-body)
                           api-endpoint])]
    (talk-to-travis-api! curl-args options)))

(defn get-from-travis-api! [api-endpoint token options]
  (let [curl-args (concat (common-curl-args token)
                          [api-endpoint])]
    (talk-to-travis-api! curl-args options)))

(defn prepare-build-env [options]
  (let [{:keys [build-id build-download-url travis-build-url]} (:build-result options)]
    {"CANARY_BUILD"                 "1"
     "CANARY_CLOJURESCRIPT_VERSION" build-id
     "CANARY_CLOJURESCRIPT_JAR_URL" build-download-url
     "CANARY_TRAVIS_BUILD_URL"      travis-build-url}))

(defn trigger-build! [slug token options]
  ; https://docs.travis-ci.com/user/triggering-builds/
  ; https://developer.travis-ci.com/resource/requests#Requests
  (let [api-slug (URLEncoder/encode slug)
        api-endpoint (str "https://api.travis-ci.org/repo/" api-slug "/requests")
        build-result (:build-result options)
        config {:merge_mode "deep_merge"
                :env        (prepare-build-env options)}
        body {:request
              {:branch  (or (:travis-branch options) "master")
               :message (str "canary build with ClojureScript " (:build-id build-result))
               :config  (utils/deep-merge config (or (:travis-config options) {}))}}
        request-body (utils/deep-merge body (or (:travis-body options) {}))]
    (post-to-travis-api! api-endpoint token request-body options)))

(defn monitoring-wait-time [options]
  (if (:production options)
    30                                                                                                                        ; TODO: make this configurable
    1))

; https://github.com/travis-ci/travis-api/blob/master/lib/travis/model/build/states.rb
(def possible-build-states #{:created :received :started :passed :failed :errored :canceled})
(def done-build-states #{:passed :failed :canceled :errored})

(defn valid-build-state? [build-state]
  (some? ((keyword build-state) possible-build-states)))

(defn build-done? [build-state]
  (some? ((keyword build-state) done-build-states)))

(defn build-passed? [build-state]
  (= (keyword build-state) :passed))

(defn request-slug [request]
  (get-in request ["repository" "slug"]))

(defn travis-build-url [slug build-id]
  (str "https://travis-ci.org/" slug "/builds/" build-id))

(defn determine-builds-state [builds]
  ; https://developer.travis-ci.com/resource/builds#Builds
  (let [states (map #(get % "state") builds)]
    (assert (every? valid-build-state? states) (str "all build states must be valid: " (pr-str states)))
    (if (every? build-done? states)
      :done
      :running)))

(defn determine-request-state [request-response]
  (let [travis-state (get-in request-response ["state"])
        builds (get-in request-response ["builds"])]
    ; didn't find any documentation for possible travis request states
    (case travis-state
      "pending" :pending
      "authorized" :pending
      "declined" :done                                                                                                        ; this probably does not exist
      "finished" (determine-builds-state builds)                                                                              ; => :running or :done
      (throw (utils/ex (i18n/received-unrecognized-travis-request-state travis-state))))))

(defn poll-request-status! [slug request-id token options]
  ; https://developer.travis-ci.com/resource/request#find
  (announce (i18n/polling-travis-api-for-request-info-msg slug request-id) 2 options)
  (let [api-slug (URLEncoder/encode slug)
        api-endpoint (str "https://api.travis-ci.org/repo/" api-slug "/request/" request-id)]
    (get-from-travis-api! api-endpoint token options)))

(defn transit-to-running-state! [report-data request-response options]
  (announce (i18n/travis-request-is-running-msg request-response) 1 options)
  (announce (i18n/travis-request-response-dump-msg request-response) 2 options)
  report-data)

(defn collect-builds-results [request-response]
  (let [builds (get request-response "builds")
        * (fn [acc build]
            (let [build-id (get build "id")
                  build-number (get build "number")]
              (assert (number? build-id))
              (conj acc {:id       build-id
                         :number   build-number
                         :state    (keyword (get build "state"))
                         :duration (get build "duration")})))]
    (reduce * [] builds)))

(defn transit-to-done-state! [report-data request-response options]
  (announce (i18n/travis-request-is-done-msg request-response) 1 options)
  (announce (i18n/travis-request-response-dump-msg request-response) 2 options)
  (assoc report-data :builds (collect-builds-results request-response)
                     :result (get request-response "result")))

(defn announce-builds-progress! [slug announced-builds request-response options]
  (let [builds (get request-response "builds")
        slug (request-slug request-response)]
    (doseq [build builds]
      (let [build-id (get build "id")
            build-number (or (get build "number") "?")
            build-state (get build "state")]
        (assert build-id)
        (when (not= build-state (get announced-builds build-id))
          (announce (i18n/travis-build-update-msg slug build-number build-state))
          (when (= build-state "created")
            (announce (i18n/travis-build-url-msg (travis-build-url slug build-id)))))))
    (into {} (for [build builds] [(get build "id") (get build "state")]))))

(defn monitor-request-status! [slug request-id token options]
  (loop [request-state :pending
         announced-builds {}
         report-data {}]
    (if (= request-state :done)
      report-data
      (do
        (.sleep TimeUnit/SECONDS (monitoring-wait-time options))
        (let [request-response (poll-request-status! slug request-id token options)
              new-request-state (determine-request-state request-response)
              new-report-data (if (= new-request-state request-state)
                                report-data
                                (case new-request-state
                                  :running (transit-to-running-state! report-data request-response options)
                                  :done (transit-to-done-state! report-data request-response options)))
              new-announced-builds (announce-builds-progress! slug announced-builds request-response options)]
          (recur new-request-state new-announced-builds new-report-data))))))

(defn all-passed? [report-data]
  (let [{:keys [builds]} report-data
        builds-states (map :state builds)]
    (every? build-passed? builds-states)))

(defn prepare-report [slug report-data options]
  (let [{:keys [builds]} report-data
        render-check-mark (fn [build]
                            (let [passed? (build-passed? (:state build))]
                              (if passed? "&#x2714;" "&#x2718;")))
        render-item (fn [build]
                      (str "  * " (render-check-mark build) " "
                           "Travis build "
                           "[" slug "#" (:number build) "](" (travis-build-url slug (:id build)) ")"))
        items (map render-item builds)]
    (string/join \newline items)))

(defn request-build-and-wait-for-results! [slug token options]
  (let [trigger-response (trigger-build! slug token options)
        request-id (get-in trigger-response ["request" "id"])
        report-data (monitor-request-status! slug request-id token options)]
    (announce (i18n/travis-report-data-dump-msg report-data) 1 options)
    {:status (if (all-passed? report-data) :passed :failed)
     :report (prepare-report slug report-data options)}))

(defn retrieve-token [token-var-name options]
  (if (:production options)
    (env/get token-var-name)
    "non-production-dummy-token-value"))

(defn request-build! [slug token-var-name options]
  (binding [travis-mocks/*mock-request-context* (travis-mocks/new-mock-request-context)]
    (announce (i18n/triggering-travis-build-msg slug))
    (announce (i18n/trigger-travis-build-inspect-msg slug token-var-name options) 2 options)
    (if-some [token (retrieve-token token-var-name options)]
      (request-build-and-wait-for-results! slug token options)
      (throw (utils/ex (i18n/api-token-not-set-msg token-var-name))))))
