## Report for job #1845
```
job
```


Job: **#1845** | [jobs/d24c27e](https://github.com/cljs-oss/canary/commit/d24c27e0a3d805f21639788dc23467a11420a7e7) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.com/cljs-oss/canary/builds/231702826).

Compiler: **ClojureScript 1.10.867-9027c028** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.867-9027c028) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar) | [source](https://github.com/clojure/clojurescript/commit/9027c02852bbeb512cda728e5f0551145e921a9c).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 11 / 17 (executed) of total 17 tasks.

Failed tasks: [clara-rules](#-clara-rules) | [cljs-time](#-cljs-time) | [core-async](#-core-async) | [core-logic](#-core-logic) | [core-match](#-core-match) | [core-rrb-vector](#-core-rrb-vector) | [garden](#-garden) | [om](#-om) | [planck](#-planck) | [spec-tools](#-spec-tools) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; clara-rules</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/clara-rules.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663828/request/575678301",[0m
[30m "config"[0m
[30m {"jdk" ["openjdk8"],[0m
[30m  "os" ["linux"],[0m
[30m  "lein" "2.7.1",[0m
[30m  "script" ["lein test" "lein test :generative" "lein with-profile dev,recent-clj test"],[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],[0m
[30m  "dist" "xenial",[0m
[30m  "sudo" true,[0m
[30m  "language" "clojure"},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663828",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663828,[0m
[30m  "name" "clara-rules",[0m
[30m  "slug" "chkup/clara-rules"},[0m
[30m "id" 575678301,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "language: clojure\nlein: 2.7.1\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\nscript:\n  - lein test\n  - lein test :generative\n  - lein with-profile dev,recent-clj test\n# Workaround for https://github.com/travis-ci/travis-ci/issues/4691\nsudo: required\njdk:\n  - openjdk8\n",[0m
[30m   "source" "chkup/clara-rules:.travis.yml@b86e17b490b7dd96",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650464,[0m
[30m  "sha" "b86e17b490b7dd96d6cbd74716d5c2c62c13feec",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/clara-rules/compare/ce65c5071a271905786449db1190687ee40e4624...b86e17b490b7dd96d6cbd74716d5c2c62c13feec",[0m
[30m  "committed_at" "2018-06-25T16:51:50Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:10:53Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},[0m
[30m   "key" "root",[0m
[30m   "id" 270147335,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" "chkup/clara-rules:.travis.yml@b86e17b490b7dd96",[0m
[30m   "level" "warn",[0m
[30m   "line" 9,[0m
[30m   "@type" "message",[0m
[30m   "code" "deprecated_key"}[0m
[30m  {"args" {"key" "dist", "default" "xenial"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147334,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}[0m
[30m  {"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147333,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$clara_rules.invokeStatic(chkup.clj:5)
	at canary.projects.chkup$clara_rules.invoke(chkup.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; cljs-time</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/cljs-time.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663833/request/575678311",[0m
[30m "config"[0m
[30m {"jdk" ["openjdk8" "openjdk11"],[0m
[30m  "os" ["linux"],[0m
[30m  "cache" {"directories" ["$HOME/.m2"]},[0m
[30m  "script" ["make clean test-utc"],[0m
[30m  "install" ["make deps"],[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],[0m
[30m  "dist" "xenial",[0m
[30m  "language" "java"},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663833",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663833,[0m
[30m  "name" "cljs-time",[0m
[30m  "slug" "chkup/cljs-time"},[0m
[30m "id" 575678311,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "language: java\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\ninstall: make deps\nscript: make clean test-utc\njdk:\n  - openjdk8\n  - openjdk11\ncache:\n  directories:\n  - $HOME/.m2\n",[0m
[30m   "source" "chkup/cljs-time:.travis.yml@bf98f69978b28c97",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650470,[0m
[30m  "sha" "bf98f69978b28c97597089d9ffb7c5a4d251c169",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/cljs-time/compare/7f86226ef2bc5e1c8e00ab9c36096e76f84a73e1...bf98f69978b28c97597089d9ffb7c5a4d251c169",[0m
[30m  "committed_at" "2020-03-23T12:32:03Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:10:57Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "dist", "default" "xenial"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147340,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}[0m
[30m  {"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147339,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$cljs_time.invokeStatic(chkup.clj:32)
	at canary.projects.chkup$cljs_time.invoke(chkup.clj:31)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-async</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/core.async.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663829/request/575678320",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "install"[0m
[30m  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"[0m
[30m   "chmod +x linux-install-1.10.0.411.sh"[0m
[30m   "sudo ./linux-install-1.10.0.411.sh"],[0m
[30m  "script"[0m
[30m  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi"[0m
[30m   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/async/test_runner.cljs | tee test-out.txt"[0m
[30m   "grep '0 failures, 0 errors.' test-out.txt"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663829",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663829,[0m
[30m  "name" "core.async",[0m
[30m  "slug" "chkup/core.async"},[0m
[30m "id" 575678320,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/async/test_runner.cljs | tee test-out.txt\n  - grep '0 failures, 0 errors.' test-out.txt\n",[0m
[30m   "source" "chkup/core.async:.travis.yml@678cc43da64cfea2",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650481,[0m
[30m  "sha" "678cc43da64cfea2c08f2e2480d834378853d6a5",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/core.async/compare/8e02b0732c5fde44061191385d8002c2dd976e68...678cc43da64cfea2c08f2e2480d834378853d6a5",[0m
[30m  "committed_at" "2020-04-01T13:40:07Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:00Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147351,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_async.invokeStatic(chkup.clj:20)
	at canary.projects.chkup$core_async.invoke(chkup.clj:19)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-logic</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/core.logic.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663832/request/575678323",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "install"[0m
[30m  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"[0m
[30m   "chmod +x linux-install-1.10.0.411.sh"[0m
[30m   "sudo ./linux-install-1.10.0.411.sh"],[0m
[30m  "script"[0m
[30m  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}\"; fi"[0m
[30m   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/logic/tests.cljs | tee test-out.txt"[0m
[30m   "grep '0 failures, 0 errors.' test-out.txt"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663832",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663832,[0m
[30m  "name" "core.logic",[0m
[30m  "slug" "chkup/core.logic"},[0m
[30m "id" 575678323,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/logic/tests.cljs | tee test-out.txt\n  - grep '0 failures, 0 errors.' test-out.txt\n",[0m
[30m   "source" "chkup/core.logic:.travis.yml@7dc7b78b2a574e00",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650483,[0m
[30m  "sha" "7dc7b78b2a574e007bacfb08ae21f012310dbef6",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/core.logic/compare/10ee95eb2bed70af5bc29ea3bd78b380f054a8b4...7dc7b78b2a574e007bacfb08ae21f012310dbef6",[0m
[30m  "committed_at" "2020-03-28T01:19:46Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:01Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147352,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_logic.invokeStatic(chkup.clj:29)
	at canary.projects.chkup$core_logic.invoke(chkup.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-match</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/core.match.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663831/request/575678324",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "install"[0m
[30m  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"[0m
[30m   "chmod +x linux-install-1.10.0.411.sh"[0m
[30m   "sudo ./linux-install-1.10.0.411.sh"],[0m
[30m  "script"[0m
[30m  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi"[0m
[30m   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/core/match/tests.cljs | tee test-out.txt"[0m
[30m   "grep '0 failures, 0 errors.' test-out.txt"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663831",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663831,[0m
[30m  "name" "core.match",[0m
[30m  "slug" "chkup/core.match"},[0m
[30m "id" 575678324,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/core/match/tests.cljs | tee test-out.txt\n  - grep '0 failures, 0 errors.' test-out.txt\n",[0m
[30m   "source" "chkup/core.match:.travis.yml@167994163cf50822",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650486,[0m
[30m  "sha" "167994163cf50822271f81e14d60c8256a630b43",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/core.match/compare/8ac3a6874eaa23a025b5f41e306f393f8c75b4d8...167994163cf50822271f81e14d60c8256a630b43",[0m
[30m  "committed_at" "2020-03-28T01:20:53Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:02Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147353,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_match.invokeStatic(chkup.clj:26)
	at canary.projects.chkup$core_match.invoke(chkup.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-rrb-vector</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/core.rrb-vector.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663830/request/575678328",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "install"[0m
[30m  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"[0m
[30m   "chmod +x linux-install-1.10.0.411.sh"[0m
[30m   "sudo ./linux-install-1.10.0.411.sh"],[0m
[30m  "script"[0m
[30m  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi"[0m
[30m   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node -e '(set! js/print (fn [& args] (.apply (.-log js/console) js/console (into-array args))))' src/test/cljs/clojure/core/rrb_vector_test.cljs | tee test-out.txt"[0m
[30m   "grep 'Tests completed without exception.' test-out.txt"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663830",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663830,[0m
[30m  "name" "core.rrb-vector",[0m
[30m  "slug" "chkup/core.rrb-vector"},[0m
[30m "id" 575678328,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node -e '(set! js/print (fn [& args] (.apply (.-log js/console) js/console (into-array args))))' src/test/cljs/clojure/core/rrb_vector_test.cljs | tee test-out.txt\n  - grep 'Tests completed without exception.' test-out.txt\n",[0m
[30m   "source" "chkup/core.rrb-vector:.travis.yml@f12cbe53a76f795b",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650489,[0m
[30m  "sha" "f12cbe53a76f795b0db3e2fad23e5f644dafdb4a",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/core.rrb-vector/compare/88c605a72f1176813ca71d664275d480285f634e...f12cbe53a76f795b0db3e2fad23e5f644dafdb4a",[0m
[30m  "committed_at" "2020-03-28T01:21:38Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:03Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147356,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_rrb_vector.invokeStatic(chkup.clj:23)
	at canary.projects.chkup$core_rrb_vector.invoke(chkup.clj:22)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; garden</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/garden.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663821/request/575678331",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "git" {"depth" 500},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],[0m
[30m  "script" ["lein test-cljs"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663821",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663821,[0m
[30m  "name" "garden",[0m
[30m  "slug" "chkup/garden"},[0m
[30m "id" 575678331,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\ngit:\n  depth: 500\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\nscript:\n  - lein test-cljs\n",[0m
[30m   "source" "chkup/garden:.travis.yml@70842bb570b6ffa8",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650491,[0m
[30m  "sha" "70842bb570b6ffa8dd20dcc0622a7a7224729cd6",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/garden/compare/ed4805a5b33785f374511a3ff8e83287a4c710a6...70842bb570b6ffa8dd20dcc0622a7a7224729cd6",[0m
[30m  "committed_at" "2020-03-28T01:24:18Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:04Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147357,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$garden.invokeStatic(chkup.clj:8)
	at canary.projects.chkup$garden.invoke(chkup.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; om</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/om.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663822/request/575678336",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "git" {"depth" 500},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "before_install"[0m
[30m  ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"[0m
[30m   "wget https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh"[0m
[30m   "mv boot.sh boot && chmod a+x boot && sudo mv boot /usr/local/bin"],[0m
[30m  "script" ["boot > /dev/null" "boot test"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663822",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663822,[0m
[30m  "name" "om",[0m
[30m  "slug" "chkup/om"},[0m
[30m "id" 575678336,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\ngit:\n  depth: 500\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n  - wget https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh\n  - mv boot.sh boot && chmod a+x boot && sudo mv boot /usr/local/bin\n\nscript:\n  - boot > /dev/null\n  - boot test\n",[0m
[30m   "source" "chkup/om:.travis.yml@3186d38b8fb8ab7b",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650499,[0m
[30m  "sha" "3186d38b8fb8ab7b9cdfb1ccd0ef49d099523710",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/om/compare/775f3adebde911988674f1bf179fd8b920031c8e...3186d38b8fb8ab7b9cdfb1ccd0ef49d099523710",[0m
[30m  "committed_at" "2020-03-28T01:27:16Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:06Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147362,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$om.invokeStatic(chkup.clj:11)
	at canary.projects.chkup$om.invoke(chkup.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; planck</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for planck-repl/planck.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645798",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645798,[0m
[30m  "login" "planck-repl",[0m
[30m  "name" "Planck REPL",[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663259/request/575678352",[0m
[30m "config"[0m
[30m {"compiler" ["gcc" "clang"],[0m
[30m  "os" ["linux" "osx"],[0m
[30m  "script" ["script/build -Werror && script/test"],[0m
[30m  "install"[0m
[30m  ["if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install clojure; fi"[0m
[30m   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then curl -O https://download.clojure.org/install/linux-install-1.10.1.763.sh; fi"[0m
[30m   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then chmod +x linux-install-1.10.1.763.sh; fi"[0m
[30m   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo ./linux-install-1.10.1.763.sh; fi"],[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "before_install"[0m
[30m  ["if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew update; fi"[0m
[30m   "if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install leiningen libzip icu4c; fi"[0m
[30m   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get -qq update; fi"[0m
[30m   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get install -y javascriptcoregtk-4.0 libglib2.0-dev libzip-dev libcurl4-gnutls-dev; fi"[0m
[30m   "curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],[0m
[30m  "jobs" {"exclude" [{"os" "osx"}]},[0m
[30m  "dist" "xenial",[0m
[30m  "language" "c",[0m
[30m  "osx_image" ["xcode12.2"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663259",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663259,[0m
[30m  "name" "planck",[0m
[30m  "slug" "planck-repl/planck"},[0m
[30m "id" 575678352,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}},\"jobs\":{\"exclude\":[{\"os\":\"osx\"}]}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "language: c\n\nos:\n  - linux\n  - osx\n\ndist: xenial\nosx_image: xcode12.2\n\ncompiler:\n  - gcc\n  - clang\n\nbefore_install:\n  - if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew update; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install leiningen libzip icu4c; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get -qq update; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get install -y javascriptcoregtk-4.0 libglib2.0-dev libzip-dev libcurl4-gnutls-dev; fi\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\ninstall:\n  - if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install clojure; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then curl -O https://download.clojure.org/install/linux-install-1.10.1.763.sh; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then chmod +x linux-install-1.10.1.763.sh; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo ./linux-install-1.10.1.763.sh; fi\n\nscript: script/build -Werror && script/test\n",[0m
[30m   "source" "planck-repl/planck:.travis.yml@b29498ebedba5536",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650512,[0m
[30m  "sha" "b29498ebedba55368dd074de5e5961ebf4c3a2d3",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/planck-repl/planck/compare/63f479804725985c0f90f77bee229a82ef2f53a7...b29498ebedba55368dd074de5e5961ebf4c3a2d3",[0m
[30m  "committed_at" "2020-12-27T18:35:19Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:13Z",[0m
[30m "messages" [],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.planck_repl$planck.invokeStatic(planck_repl.clj:7)
	at canary.projects.planck_repl$planck.invoke(planck_repl.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; spec-tools</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/spec-tools.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663823/request/575678350",[0m
[30m "config"[0m
[30m {"jdk" ["oraclejdk8"],[0m
[30m  "os" ["linux"],[0m
[30m  "lein" "2.7.1",[0m
[30m  "cache" {"directories" ["$HOME/.m2"]},[0m
[30m  "script" ["./scripts/test.sh $TEST" "./scripts/submit-to-coveralls.sh $TEST"],[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}],[0m
[30m   "jobs" [{"TEST" "clj"} {"TEST" "cljs"}]},[0m
[30m  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],[0m
[30m  "dist" "trusty",[0m
[30m  "sudo" false,[0m
[30m  "language" "clojure"},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663823",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663823,[0m
[30m  "name" "spec-tools",[0m
[30m  "slug" "chkup/spec-tools"},[0m
[30m "id" 575678350,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "sudo: false\ndist: trusty\nlanguage: clojure\nlein: 2.7.1\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\nscript:\n  - ./scripts/test.sh $TEST\n  - ./scripts/submit-to-coveralls.sh $TEST\nenv:\n  matrix:\n  - TEST=clj\n  - TEST=cljs\njdk:\n  - oraclejdk8\nnode_js:\n  - lts/*\ncache:\n  directories:\n  - \"$HOME/.m2\"\n",[0m
[30m   "source" "chkup/spec-tools:.travis.yml@a69823d855b310e9",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650509,[0m
[30m  "sha" "a69823d855b310e99d8c10f3f3063ea897cf8c5b",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/spec-tools/compare/cfd4dd5b431b22e8238515125da22a6a1ce64da3...a69823d855b310e99d8c10f3f3063ea897cf8c5b",[0m
[30m  "committed_at" "2020-03-28T01:29:11Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:10Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},[0m
[30m   "key" "root",[0m
[30m   "id" 270147367,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" "chkup/spec-tools:.travis.yml@a69823d855b310e9",[0m
[30m   "level" "warn",[0m
[30m   "line" 0,[0m
[30m   "@type" "message",[0m
[30m   "code" "deprecated_key"}[0m
[30m  {"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147366,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}[0m
[30m  {"args" {"alias" "matrix", "key" "jobs"},[0m
[30m   "key" "env",[0m
[30m   "id" 270147365,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" "chkup/spec-tools:.travis.yml@a69823d855b310e9",[0m
[30m   "level" "info",[0m
[30m   "line" 10,[0m
[30m   "@type" "message",[0m
[30m   "code" "alias_key"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$spec_tools.invokeStatic(chkup.clj:14)
	at canary.projects.chkup$spec_tools.invoke(chkup.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; test-check</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'approved'
[30m{"message" "Could not authorize build request for chkup/test.check.",[0m
[30m "owner"[0m
[30m {"@type" "organization",[0m
[30m  "@href" "/org/645801",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 645801,[0m
[30m  "login" "chkup",[0m
[30m  "name" nil,[0m
[30m  "vcs_type" "GithubOrganization",[0m
[30m  "ro_mode" false},[0m
[30m "@href" "/repo/19663820/request/575678359",[0m
[30m "config"[0m
[30m {"language" "node_js",[0m
[30m  "os" ["linux"],[0m
[30m  "dist" "trusty",[0m
[30m  "env"[0m
[30m  {"global"[0m
[30m   [{"CANARY_BUILD" "1",[0m
[30m     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",[0m
[30m     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",[0m
[30m     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",[0m
[30m     "CANARY_CLOJURESCRIPT_JAR_URL"[0m
[30m     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",[0m
[30m     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231702826"}]},[0m
[30m  "git" {"depth" 500},[0m
[30m  "node_js" ["lts/*"],[0m
[30m  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],[0m
[30m  "script" ["lein cljsbuild once"]},[0m
[30m "branch_name" "master",[0m
[30m "base_commit" nil,[0m
[30m "builds" [],[0m
[30m "repository"[0m
[30m {"@type" "repository",[0m
[30m  "@href" "/repo/19663820",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 19663820,[0m
[30m  "name" "test.check",[0m
[30m  "slug" "chkup/test.check"},[0m
[30m "id" 575678359,[0m
[30m "@representation" "standard",[0m
[30m "pull_request_mergeable" nil,[0m
[30m "raw_configs"[0m
[30m [{"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231702826\"}}}",[0m
[30m   "source" "api",[0m
[30m   "merge_mode" "deep_merge"}[0m
[30m  {"@type" "request_raw_configuration",[0m
[30m   "@representation" "minimal",[0m
[30m   "config"[0m
[30m   "dist: trusty\n\ngit:\n  depth: 500\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\nscript:\n  - lein cljsbuild once\n",[0m
[30m   "source" "chkup/test.check:.travis.yml@7fbc1fb65df83026",[0m
[30m   "merge_mode" nil}],[0m
[30m "event_type" "api",[0m
[30m "commit"[0m
[30m {"@type" "commit",[0m
[30m  "@representation" "minimal",[0m
[30m  "id" 573650519,[0m
[30m  "sha" "7fbc1fb65df830264009ca3ebd6c24a7ef0d28ac",[0m
[30m  "ref" nil,[0m
[30m  "message" "Canary test with ClojureScript 1.10.867-9027c028",[0m
[30m  "compare_url"[0m
[30m  "https://github.com/chkup/test.check/compare/88eebf105fbb01db17ce12a3bff207cc395270b9...7fbc1fb65df830264009ca3ebd6c24a7ef0d28ac",[0m
[30m  "committed_at" "2020-03-28T02:13:54Z"},[0m
[30m "state" "approved",[0m
[30m "created_at" "2021-07-03T11:11:16Z",[0m
[30m "messages"[0m
[30m [{"args" {"key" "os", "default" "linux"},[0m
[30m   "key" "root",[0m
[30m   "id" 270147368,[0m
[30m   "@representation" "minimal",[0m
[30m   "src" nil,[0m
[30m   "level" "info",[0m
[30m   "line" nil,[0m
[30m   "@type" "message",[0m
[30m   "code" "default"}],[0m
[30m "head_commit" nil,[0m
[30m "@type" "request",[0m
[30m "result" "rejected"}[0m {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:148)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:205)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$test_check.invokeStatic(chkup.clj:17)
	at canary.projects.chkup$test_check.invoke(chkup.clj:16)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#2584](https://travis-ci.com/binaryage/chromex/builds/231702864)<br>

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#1159](https://travis-ci.com/mfikes/cljs-bean/builds/231702865)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1998](https://travis-ci.com/binaryage/cljs-devtools/builds/231702866)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#1869](https://travis-ci.com/binaryage/cljs-oops/builds/231702867)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#1494](https://travis-ci.com/binaryage/cljs-zones/builds/231702868)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2919](https://travis-ci.com/mfikes/coal-mine/builds/231702870)<br>