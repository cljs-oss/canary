## Report for job #1846
```
job
```


Job: **#1846** | [jobs/9ac898e](https://github.com/cljs-oss/canary/commit/9ac898ed4619259fa99689a982f298f7caa39682) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.com/cljs-oss/canary/builds/231714505).

Compiler: **ClojureScript 1.10.867-9027c028** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.867-9027c028) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar) | [source](https://github.com/clojure/clojurescript/commit/9027c02852bbeb512cda728e5f0551145e921a9c).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 11 / 17 (executed) of total 17 tasks.

Failed tasks: [clara-rules](#-clara-rules) | [cljs-time](#-cljs-time) | [core-async](#-core-async) | [core-logic](#-core-logic) | [core-match](#-core-match) | [core-rrb-vector](#-core-rrb-vector) | [garden](#-garden) | [om](#-om) | [planck](#-planck) | [spec-tools](#-spec-tools) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; clara-rules</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/clara-rules.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/clara-rules.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663828/request/575750853",
 "config"
 {"jdk" ["openjdk8"],
  "os" ["linux"],
  "lein" "2.7.1",
  "script" ["lein test" "lein test :generative" "lein with-profile dev,recent-clj test"],
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "dist" "xenial",
  "sudo" true,
  "language" "clojure"},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663828",
  "@representation" "minimal",
  "id" 19663828,
  "name" "clara-rules",
  "slug" "chkup/clara-rules"},
 "id" 575750853,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "language: clojure\nlein: 2.7.1\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\nscript:\n  - lein test\n  - lein test :generative\n  - lein with-profile dev,recent-clj test\n# Workaround for https://github.com/travis-ci/travis-ci/issues/4691\nsudo: required\njdk:\n  - openjdk8\n",
   "source" "chkup/clara-rules:.travis.yml@b86e17b490b7dd96",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723310,
  "sha" "b86e17b490b7dd96d6cbd74716d5c2c62c13feec",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/clara-rules/compare/ce65c5071a271905786449db1190687ee40e4624...b86e17b490b7dd96d6cbd74716d5c2c62c13feec",
  "committed_at" "2018-06-25T16:51:50Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:24:55Z",
 "messages"
 [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},
   "key" "root",
   "id" 270184343,
   "@representation" "minimal",
   "src" "chkup/clara-rules:.travis.yml@b86e17b490b7dd96",
   "level" "warn",
   "line" 9,
   "@type" "message",
   "code" "deprecated_key"}
  {"args" {"key" "dist", "default" "xenial"},
   "key" "root",
   "id" 270184342,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184341,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$clara_rules.invokeStatic(chkup.clj:5)
	at canary.projects.chkup$clara_rules.invoke(chkup.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; cljs-time</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/cljs-time.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/cljs-time.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663833/request/575750864",
 "config"
 {"jdk" ["openjdk8" "openjdk11"],
  "os" ["linux"],
  "cache" {"directories" ["$HOME/.m2"]},
  "script" ["make clean test-utc"],
  "install" ["make deps"],
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "dist" "xenial",
  "language" "java"},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663833",
  "@representation" "minimal",
  "id" 19663833,
  "name" "cljs-time",
  "slug" "chkup/cljs-time"},
 "id" 575750864,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "language: java\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\ninstall: make deps\nscript: make clean test-utc\njdk:\n  - openjdk8\n  - openjdk11\ncache:\n  directories:\n  - $HOME/.m2\n",
   "source" "chkup/cljs-time:.travis.yml@bf98f69978b28c97",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723322,
  "sha" "bf98f69978b28c97597089d9ffb7c5a4d251c169",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/cljs-time/compare/7f86226ef2bc5e1c8e00ab9c36096e76f84a73e1...bf98f69978b28c97597089d9ffb7c5a4d251c169",
  "committed_at" "2020-03-23T12:32:03Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:00Z",
 "messages"
 [{"args" {"key" "dist", "default" "xenial"},
   "key" "root",
   "id" 270184361,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184360,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$cljs_time.invokeStatic(chkup.clj:32)
	at canary.projects.chkup$cljs_time.invoke(chkup.clj:31)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-async</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/core.async.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/core.async.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663829/request/575750873",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "node_js" ["lts/*"],
  "install"
  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"
   "chmod +x linux-install-1.10.0.411.sh"
   "sudo ./linux-install-1.10.0.411.sh"],
  "script"
  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi"
   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/async/test_runner.cljs | tee test-out.txt"
   "grep '0 failures, 0 errors.' test-out.txt"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663829",
  "@representation" "minimal",
  "id" 19663829,
  "name" "core.async",
  "slug" "chkup/core.async"},
 "id" 575750873,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test/cljs\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/async/test_runner.cljs | tee test-out.txt\n  - grep '0 failures, 0 errors.' test-out.txt\n",
   "source" "chkup/core.async:.travis.yml@678cc43da64cfea2",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723331,
  "sha" "678cc43da64cfea2c08f2e2480d834378853d6a5",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.async/compare/8e02b0732c5fde44061191385d8002c2dd976e68...678cc43da64cfea2c08f2e2480d834378853d6a5",
  "committed_at" "2020-04-01T13:40:07Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:03Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184371,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$core_async.invokeStatic(chkup.clj:20)
	at canary.projects.chkup$core_async.invoke(chkup.clj:19)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-logic</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/core.logic.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/core.logic.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663832/request/575750877",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "node_js" ["lts/*"],
  "install"
  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"
   "chmod +x linux-install-1.10.0.411.sh"
   "sudo ./linux-install-1.10.0.411.sh"],
  "script"
  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}\"; fi"
   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/logic/tests.cljs | tee test-out.txt"
   "grep '0 failures, 0 errors.' test-out.txt"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663832",
  "@representation" "minimal",
  "id" 19663832,
  "name" "core.logic",
  "slug" "chkup/core.logic"},
 "id" 575750877,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}} org.clojure/tools.macro {:mvn/version \\\"0.1.2\\\"}}}}\" -m cljs.main -re node src/test/cljs/cljs/core/logic/tests.cljs | tee test-out.txt\n  - grep '0 failures, 0 errors.' test-out.txt\n",
   "source" "chkup/core.logic:.travis.yml@7dc7b78b2a574e00",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723338,
  "sha" "7dc7b78b2a574e007bacfb08ae21f012310dbef6",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.logic/compare/10ee95eb2bed70af5bc29ea3bd78b380f054a8b4...7dc7b78b2a574e007bacfb08ae21f012310dbef6",
  "committed_at" "2020-03-28T01:19:46Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:04Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184375,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$core_logic.invokeStatic(chkup.clj:29)
	at canary.projects.chkup$core_logic.invoke(chkup.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-match</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/core.match.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/core.match.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663831/request/575750883",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "node_js" ["lts/*"],
  "install"
  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"
   "chmod +x linux-install-1.10.0.411.sh"
   "sudo ./linux-install-1.10.0.411.sh"],
  "script"
  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi"
   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/core/match/tests.cljs | tee test-out.txt"
   "grep '0 failures, 0 errors.' test-out.txt"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663831",
  "@representation" "minimal",
  "id" 19663831,
  "name" "core.match",
  "slug" "chkup/core.match"},
 "id" 575750883,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/test\\\" \\\"src/main/clojure\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node src/test/cljs/core/match/tests.cljs | tee test-out.txt\n  - grep '0 failures, 0 errors.' test-out.txt\n",
   "source" "chkup/core.match:.travis.yml@167994163cf50822",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723339,
  "sha" "167994163cf50822271f81e14d60c8256a630b43",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.match/compare/8ac3a6874eaa23a025b5f41e306f393f8c75b4d8...167994163cf50822271f81e14d60c8256a630b43",
  "committed_at" "2020-03-28T01:20:53Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:05Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184379,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$core_match.invokeStatic(chkup.clj:26)
	at canary.projects.chkup$core_match.invoke(chkup.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-rrb-vector</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/core.rrb-vector.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/core.rrb-vector.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663830/request/575750884",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "node_js" ["lts/*"],
  "install"
  ["curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh"
   "chmod +x linux-install-1.10.0.411.sh"
   "sudo ./linux-install-1.10.0.411.sh"],
  "script"
  ["if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi"
   "clojure -Sdeps \"${DEPS:-{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node -e '(set! js/print (fn [& args] (.apply (.-log js/console) js/console (into-array args))))' src/test/cljs/clojure/core/rrb_vector_test.cljs | tee test-out.txt"
   "grep 'Tests completed without exception.' test-out.txt"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663830",
  "@representation" "minimal",
  "id" 19663830,
  "name" "core.rrb-vector",
  "slug" "chkup/core.rrb-vector"},
 "id" 575750884,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\ninstall:\n  - curl -O https://download.clojure.org/install/linux-install-1.10.0.411.sh\n  - chmod +x linux-install-1.10.0.411.sh\n  - sudo ./linux-install-1.10.0.411.sh\n\nscript:\n  - if [[ $CANARY_CLOJURESCRIPT_REPO && ${CANARY_CLOJURESCRIPT_REPO-x} ]]; then DEPS=\"{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:git/url \\\"${CANARY_CLOJURESCRIPT_REPO}\\\" :sha \\\"${CANARY_CLOJURESCRIPT_REV}\\\"}}}\"; fi\n  - clojure -Sdeps \"${DEPS:-{:paths [\\\"src/main/cljs\\\"] :deps {org.clojure/clojurescript {:mvn/version \\\"1.10.439\\\"}}}}\" -m cljs.main -re node -e '(set! js/print (fn [& args] (.apply (.-log js/console) js/console (into-array args))))' src/test/cljs/clojure/core/rrb_vector_test.cljs | tee test-out.txt\n  - grep 'Tests completed without exception.' test-out.txt\n",
   "source" "chkup/core.rrb-vector:.travis.yml@f12cbe53a76f795b",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723340,
  "sha" "f12cbe53a76f795b0db3e2fad23e5f644dafdb4a",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.rrb-vector/compare/88c605a72f1176813ca71d664275d480285f634e...f12cbe53a76f795b0db3e2fad23e5f644dafdb4a",
  "committed_at" "2020-03-28T01:21:38Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:06Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184380,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$core_rrb_vector.invokeStatic(chkup.clj:23)
	at canary.projects.chkup$core_rrb_vector.invoke(chkup.clj:22)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; garden</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/garden.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/garden.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663821/request/575750887",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "git" {"depth" 500},
  "node_js" ["lts/*"],
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "script" ["lein test-cljs"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663821",
  "@representation" "minimal",
  "id" 19663821,
  "name" "garden",
  "slug" "chkup/garden"},
 "id" 575750887,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\ngit:\n  depth: 500\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\nscript:\n  - lein test-cljs\n",
   "source" "chkup/garden:.travis.yml@70842bb570b6ffa8",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723343,
  "sha" "70842bb570b6ffa8dd20dcc0622a7a7224729cd6",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/garden/compare/ed4805a5b33785f374511a3ff8e83287a4c710a6...70842bb570b6ffa8dd20dcc0622a7a7224729cd6",
  "committed_at" "2020-03-28T01:24:18Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:07Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184381,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$garden.invokeStatic(chkup.clj:8)
	at canary.projects.chkup$garden.invoke(chkup.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; om</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/om.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/om.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663822/request/575750891",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "git" {"depth" 500},
  "node_js" ["lts/*"],
  "before_install"
  ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"
   "wget https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh"
   "mv boot.sh boot && chmod a+x boot && sudo mv boot /usr/local/bin"],
  "script" ["boot > /dev/null" "boot test"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663822",
  "@representation" "minimal",
  "id" 19663822,
  "name" "om",
  "slug" "chkup/om"},
 "id" 575750891,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\ngit:\n  depth: 500\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n  - wget https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh\n  - mv boot.sh boot && chmod a+x boot && sudo mv boot /usr/local/bin\n\nscript:\n  - boot > /dev/null\n  - boot test\n",
   "source" "chkup/om:.travis.yml@3186d38b8fb8ab7b",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723350,
  "sha" "3186d38b8fb8ab7b9cdfb1ccd0ef49d099523710",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/om/compare/775f3adebde911988674f1bf179fd8b920031c8e...3186d38b8fb8ab7b9cdfb1ccd0ef49d099523710",
  "committed_at" "2020-03-28T01:27:16Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:10Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184382,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$om.invokeStatic(chkup.clj:11)
	at canary.projects.chkup$om.invoke(chkup.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; planck</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for planck-repl/planck.
Please check your Travis credentials.
{"message" "Could not authorize build request for planck-repl/planck.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645798",
  "@representation" "minimal",
  "id" 645798,
  "login" "planck-repl",
  "name" "Planck REPL",
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663259/request/575750902",
 "config"
 {"compiler" ["gcc" "clang"],
  "os" ["linux" "osx"],
  "script" ["script/build -Werror && script/test"],
  "install"
  ["if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install clojure; fi"
   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then curl -O https://download.clojure.org/install/linux-install-1.10.1.763.sh; fi"
   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then chmod +x linux-install-1.10.1.763.sh; fi"
   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo ./linux-install-1.10.1.763.sh; fi"],
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "before_install"
  ["if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew update; fi"
   "if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install leiningen libzip icu4c; fi"
   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get -qq update; fi"
   "if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get install -y javascriptcoregtk-4.0 libglib2.0-dev libzip-dev libcurl4-gnutls-dev; fi"
   "curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "jobs" {"exclude" [{"os" "osx"}]},
  "dist" "xenial",
  "language" "c",
  "osx_image" ["xcode12.2"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663259",
  "@representation" "minimal",
  "id" 19663259,
  "name" "planck",
  "slug" "planck-repl/planck"},
 "id" 575750902,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}},\"jobs\":{\"exclude\":[{\"os\":\"osx\"}]}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "language: c\n\nos:\n  - linux\n  - osx\n\ndist: xenial\nosx_image: xcode12.2\n\ncompiler:\n  - gcc\n  - clang\n\nbefore_install:\n  - if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew update; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install leiningen libzip icu4c; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get -qq update; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo apt-get install -y javascriptcoregtk-4.0 libglib2.0-dev libzip-dev libcurl4-gnutls-dev; fi\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\ninstall:\n  - if [[ \"$TRAVIS_OS_NAME\" == \"osx\" ]]; then brew install clojure; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then curl -O https://download.clojure.org/install/linux-install-1.10.1.763.sh; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then chmod +x linux-install-1.10.1.763.sh; fi\n  - if [[ \"$TRAVIS_OS_NAME\" == \"linux\" ]]; then sudo ./linux-install-1.10.1.763.sh; fi\n\nscript: script/build -Werror && script/test\n",
   "source" "planck-repl/planck:.travis.yml@b29498ebedba5536",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723360,
  "sha" "b29498ebedba55368dd074de5e5961ebf4c3a2d3",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/planck-repl/planck/compare/63f479804725985c0f90f77bee229a82ef2f53a7...b29498ebedba55368dd074de5e5961ebf4c3a2d3",
  "committed_at" "2020-12-27T18:35:19Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:14Z",
 "messages" [],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.planck_repl$planck.invokeStatic(planck_repl.clj:7)
	at canary.projects.planck_repl$planck.invoke(planck_repl.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; spec-tools</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/spec-tools.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/spec-tools.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663823/request/575750907",
 "config"
 {"jdk" ["oraclejdk8"],
  "os" ["linux"],
  "lein" "2.7.1",
  "cache" {"directories" ["$HOME/.m2"]},
  "script" ["./scripts/test.sh $TEST" "./scripts/submit-to-coveralls.sh $TEST"],
  "node_js" ["lts/*"],
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}],
   "jobs" [{"TEST" "clj"} {"TEST" "cljs"}]},
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "dist" "trusty",
  "sudo" false,
  "language" "clojure"},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663823",
  "@representation" "minimal",
  "id" 19663823,
  "name" "spec-tools",
  "slug" "chkup/spec-tools"},
 "id" 575750907,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "sudo: false\ndist: trusty\nlanguage: clojure\nlein: 2.7.1\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\nscript:\n  - ./scripts/test.sh $TEST\n  - ./scripts/submit-to-coveralls.sh $TEST\nenv:\n  matrix:\n  - TEST=clj\n  - TEST=cljs\njdk:\n  - oraclejdk8\nnode_js:\n  - lts/*\ncache:\n  directories:\n  - \"$HOME/.m2\"\n",
   "source" "chkup/spec-tools:.travis.yml@a69823d855b310e9",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723369,
  "sha" "a69823d855b310e99d8c10f3f3063ea897cf8c5b",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/spec-tools/compare/cfd4dd5b431b22e8238515125da22a6a1ce64da3...a69823d855b310e99d8c10f3f3063ea897cf8c5b",
  "committed_at" "2020-03-28T01:29:11Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:17Z",
 "messages"
 [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},
   "key" "root",
   "id" 270184399,
   "@representation" "minimal",
   "src" "chkup/spec-tools:.travis.yml@a69823d855b310e9",
   "level" "warn",
   "line" 0,
   "@type" "message",
   "code" "deprecated_key"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184398,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}
  {"args" {"alias" "matrix", "key" "jobs"},
   "key" "env",
   "id" 270184397,
   "@representation" "minimal",
   "src" "chkup/spec-tools:.travis.yml@a69823d855b310e9",
   "level" "info",
   "line" 10,
   "@type" "message",
   "code" "alias_key"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$spec_tools.invokeStatic(chkup.clj:14)
	at canary.projects.chkup$spec_tools.invoke(chkup.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; test-check</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Could not authorize build request for chkup/test.check.
Please check your Travis credentials.
{"message" "Could not authorize build request for chkup/test.check.",
 "owner"
 {"@type" "organization",
  "@href" "/org/645801",
  "@representation" "minimal",
  "id" 645801,
  "login" "chkup",
  "name" nil,
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19663820/request/575750917",
 "config"
 {"language" "node_js",
  "os" ["linux"],
  "dist" "trusty",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/231714505"}]},
  "git" {"depth" 500},
  "node_js" ["lts/*"],
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "script" ["lein cljsbuild once"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19663820",
  "@representation" "minimal",
  "id" 19663820,
  "name" "test.check",
  "slug" "chkup/test.check"},
 "id" 575750917,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/231714505\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: trusty\n\ngit:\n  depth: 500\n\nlanguage: node_js\n\nnode_js:\n  - lts/*\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\nscript:\n  - lein cljsbuild once\n",
   "source" "chkup/test.check:.travis.yml@7fbc1fb65df83026",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 573723377,
  "sha" "7fbc1fb65df830264009ca3ebd6c24a7ef0d28ac",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/test.check/compare/88eebf105fbb01db17ce12a3bff207cc395270b9...7fbc1fb65df830264009ca3ebd6c24a7ef0d28ac",
  "committed_at" "2020-03-28T02:13:54Z"},
 "state" "approved",
 "created_at" "2021-07-03T19:25:20Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 270184407,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}],
 "head_commit" nil,
 "@type" "request",
 "result" "rejected"}
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:147)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:138)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:197)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:238)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:235)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:253)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:248)
	at canary.projects.chkup$test_check.invokeStatic(chkup.clj:17)
	at canary.projects.chkup$test_check.invoke(chkup.clj:16)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11185.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11018.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#2585](https://travis-ci.com/binaryage/chromex/builds/231714874)<br>

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#1160](https://travis-ci.com/mfikes/cljs-bean/builds/231714875)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1999](https://travis-ci.com/binaryage/cljs-devtools/builds/231714876)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#1870](https://travis-ci.com/binaryage/cljs-oops/builds/231714878)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#1495](https://travis-ci.com/binaryage/cljs-zones/builds/231714879)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2920](https://travis-ci.com/mfikes/coal-mine/builds/231714880)<br>