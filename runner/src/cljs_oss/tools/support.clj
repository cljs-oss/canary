(ns cljs-oss.tools.support
  "Support functionality for tasks."
  (:require [me.raynes.conch.low-level :as sh]
            [clojure.data.json :as json]
            [cljs-oss.tools.shell :as shell]
            [clojure.string :as string]
            [cljs-oss.tools.env :as env]
            [cljs-oss.tools.utils :as utils])
  (:import (java.net URLEncoder)))

(def default-body {:branch  "master"
                   :message "canary build"})

(defn blind-secrets [args]
  (let [* (fn [arg]
            (if (re-matches #"^Authorization:.*" arg)
              "Authorization: <secret>"
              arg))]
    (map * args)))

(defn make-travis-build-url [slug request-id]
  ; TODO: we will have to query travis API to get list of builds triggered by this request id
  (str "https://travis-ci.org/" slug "/builds/"))

(defn interpret-travis-response [out err]
  ; TODO: check err here as well?
  (let [response (json/read-str out)
        repo-slug (get-in response ["repository" "slug"])
        request-id (get-in response ["request" "repository" "id"])
        build-url (make-travis-build-url repo-slug request-id)
        report (str "triggered a build of " repo-slug " => request id " request-id)]
    {:status          :ok
     :travis-response response
     :report          report}))

(defn trigger-travis-build-with-token! [slug token options]
  (let [api-slug (URLEncoder/encode slug)
        api-endpoint (str "https://api.travis-ci.org/repo/" api-slug "/requests")
        request-body (merge default-body (:body options))
        curl-args ["-s" "-X" "POST"
                   "-H" "Content-Type: application/json"
                   "-H" "Accept: application/json"
                   "-H" "Travis-API-Version: 3"
                   "-H" (str "Authorization: token " token)
                   "-d" (json/write-str request-body)
                   api-endpoint]]
    (when (:verbose options)
      (println "> curl" (blind-secrets curl-args)))
    (let [result (shell/launch! "curl" curl-args)]
      (if (= (:exit-code result) 0)
        (interpret-travis-response (:out result) (:err result))
        (throw (ex-info (str "curl failed when talking to travis\n" (:err result)) {:result result}))))))

(defn trigger-travis-build! [slug token-var-name options]
  (if-some [api-token (env/get token-var-name)]
    (trigger-travis-build-with-token! slug api-token options)
    (throw (ex-info (str "travis api token '" token-var-name "' not set in the environment")
                    {:token-var-name token-var-name
                     :slug           slug
                     :options        options}))))
