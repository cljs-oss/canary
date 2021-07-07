## Report for job #1850
```
job
```


Job: **#1850** | [jobs/d88fede](https://github.com/cljs-oss/canary/commit/d88fede048a453dbfedbeacebdb3d78b9e815870) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.com/cljs-oss/canary/builds/232030885).

Compiler: **ClojureScript 1.10.867-9027c028** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.867-9027c028) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar) | [source](https://github.com/clojure/clojurescript/commit/9027c02852bbeb512cda728e5f0551145e921a9c).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 15 / 17 (executed) of total 17 tasks.

Failed tasks: [chromex](#-chromex) | [clara-rules](#-clara-rules) | [cljs-devtools](#-cljs-devtools) | [cljs-oops](#-cljs-oops) | [cljs-time](#-cljs-time) | [cljs-zones](#-cljs-zones) | [core-async](#-core-async) | [core-logic](#-core-logic) | [core-match](#-core-match) | [core-rrb-vector](#-core-rrb-vector) | [garden](#-garden) | [om](#-om) | [planck](#-planck) | [spec-tools](#-spec-tools) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; chromex</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Owner binaryage does not have enough credits.
Please check your Travis credentials.
{"message" "Owner binaryage does not have enough credits.",
 "owner"
 {"@type" "organization",
  "@href" "/org/21703",
  "@representation" "minimal",
  "id" 21703,
  "login" "binaryage",
  "name" "BinaryAge",
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/1238397/request/577392322",
 "config"
 {"language" "clojure",
  "os" ["linux"],
  "dist" "bionic",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
  "notifications" {"email" [{"recipients" ["antonin@hildebrand.cz"]}]},
  "cache" {"directories" ["$HOME/.m2" "$TRAVIS_BUILD_DIR/test/node_modules"]},
  "before_install"
  ["nvm use v13.3.0"
   "npm i -g npm"
   "yes y | sudo lein upgrade"
   "curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"
   "(cd test && npm install)"],
  "script" ["./scripts/test-all.sh"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/1238397",
  "@representation" "minimal",
  "id" 1238397,
  "name" "chromex",
  "slug" "binaryage/chromex"},
 "id" 577392322,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: bionic\nos: linux\nlanguage: clojure\nnotifications:\n  email:\n    - antonin@hildebrand.cz\ncache:\n  directories:\n    - \"$HOME/.m2\"\n    # this is mainly for puppeteer, by default it stores chromium downloads in node_modules/puppeteer/.local-chromium\n    - \"$TRAVIS_BUILD_DIR/test/node_modules\"\nbefore_install:\n  - nvm use v13.3.0\n  - npm i -g npm\n  - yes y | sudo lein upgrade\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n  - (cd test && npm install)\nscript:\n  - ./scripts/test-all.sh\n",
   "source" "binaryage/chromex:.travis.yml@73bf909fe7d57511",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 575366715,
  "sha" "73bf909fe7d5751192f4b36f4f9bf2534b03dba6",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/binaryage/chromex/compare/631a9c5beaba1ff08b2c182c5dc774ed1c5d6084...73bf909fe7d5751192f4b36f4f9bf2534b03dba6",
  "committed_at" "2021-04-05T20:11:06Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:25Z",
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
	at canary.projects.binaryage$chromex.invokeStatic(binaryage.clj:8)
	at canary.projects.binaryage$chromex.invoke(binaryage.clj:7)
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
 "@href" "/repo/19663828/request/577392335",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392335,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366722,
  "sha" "b86e17b490b7dd96d6cbd74716d5c2c62c13feec",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/clara-rules/compare/ce65c5071a271905786449db1190687ee40e4624...b86e17b490b7dd96d6cbd74716d5c2c62c13feec",
  "committed_at" "2018-06-25T16:51:50Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:26Z",
 "messages"
 [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},
   "key" "root",
   "id" 271396643,
   "@representation" "minimal",
   "src" "chkup/clara-rules:.travis.yml@b86e17b490b7dd96",
   "level" "warn",
   "line" 9,
   "@type" "message",
   "code" "deprecated_key"}
  {"args" {"key" "dist", "default" "xenial"},
   "key" "root",
   "id" 271396642,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396641,
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

#### <b style='color:red'>&#x2717; cljs-devtools</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Owner binaryage does not have enough credits.
Please check your Travis credentials.
{"message" "Owner binaryage does not have enough credits.",
 "owner"
 {"@type" "organization",
  "@href" "/org/21703",
  "@representation" "minimal",
  "id" 21703,
  "login" "binaryage",
  "name" "BinaryAge",
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19650792/request/577392349",
 "config"
 {"language" "clojure",
  "os" ["linux"],
  "dist" "bionic",
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
  "notifications" {"email" [{"recipients" ["antonin@hildebrand.cz"]}]},
  "cache" {"directories" ["$HOME/.m2" "$TRAVIS_BUILD_DIR/test/node_modules"]},
  "before_install"
  ["npm i -g npm"
   "yes y | sudo lein upgrade"
   "curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"
   "(cd test && npm install)"]},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19650792",
  "@representation" "minimal",
  "id" 19650792,
  "name" "cljs-devtools",
  "slug" "binaryage/cljs-devtools"},
 "id" 577392349,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "dist: bionic\nos: linux\nlanguage: clojure\nnotifications:\n  email:\n    - antonin@hildebrand.cz\ncache:\n  directories:\n    - \"$HOME/.m2\"\n    # this is mainly for puppeteer, by default it stores chromium downloads in node_modules/puppeteer/.local-chromium\n    - \"$TRAVIS_BUILD_DIR/test/node_modules\"\nbefore_install:\n  - npm i -g npm\n  - yes y | sudo lein upgrade\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n  - (cd test && npm install)\n",
   "source" "binaryage/cljs-devtools:.travis.yml@6403d787478a0db9",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 575366737,
  "sha" "6403d787478a0db9ffd32d2824d2a3e155fe4927",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/binaryage/cljs-devtools/compare/c6a6238eddf7ac143cd51f85d8debed098dd0e44...6403d787478a0db9ffd32d2824d2a3e155fe4927",
  "committed_at" "2021-04-05T19:38:41Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:28Z",
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
	at canary.projects.binaryage$cljs_devtools.invokeStatic(binaryage.clj:5)
	at canary.projects.binaryage$cljs_devtools.invoke(binaryage.clj:4)
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

#### <b style='color:red'>&#x2717; cljs-oops</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Owner binaryage does not have enough credits.
Please check your Travis credentials.
{"message" "Owner binaryage does not have enough credits.",
 "owner"
 {"@type" "organization",
  "@href" "/org/21703",
  "@representation" "minimal",
  "id" 21703,
  "login" "binaryage",
  "name" "BinaryAge",
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19650802/request/577392361",
 "config"
 {"before_script"
  ["yes y | sudo lein upgrade"
   "sudo apt-get install nodejs-dev node-gyp libssl1.0-dev npm colordiff"
   "sudo npm install -g js-beautify@1.13.5"
   "(cd test && npm install)"],
  "notifications" {"email" [{"recipients" ["antonin@hildebrand.cz"]}]},
  "os" ["linux"],
  "cache" {"directories" ["$HOME/.m2"]},
  "script" ["./scripts/test-all.sh"],
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "dist" "bionic",
  "sudo" true,
  "language" "clojure"},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19650802",
  "@representation" "minimal",
  "id" 19650802,
  "name" "cljs-oops",
  "slug" "binaryage/cljs-oops"},
 "id" 577392361,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "sudo: true\ndist: bionic\nlanguage: clojure\n\nnotifications:\n  email:\n  - antonin@hildebrand.cz\n\ncache:\n  directories:\n    - $HOME/.m2\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\nbefore_script:\n  # update lein to latest, https://github.com/technomancy/leiningen/issues/2014#issuecomment-153829977\n  - yes y | sudo lein upgrade\n  # https://medium.com/code-kings/npm-npm-depends-node-gyp-0-10-9-but-it-is-not-going-to-be-installed-error-try-this-dc65325136ce\n  - sudo apt-get install nodejs-dev node-gyp libssl1.0-dev npm colordiff\n  - sudo npm install -g js-beautify@1.13.5\n  - (cd test && npm install)\n\nscript: ./scripts/test-all.sh\n",
   "source" "binaryage/cljs-oops:.travis.yml@47581d1583135ae3",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 575366749,
  "sha" "47581d1583135ae3ccb0f1a5767661eaab7830b4",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/binaryage/cljs-oops/compare/804f81cf8ec17cefd0504691d0ddfc00790facd0...47581d1583135ae3ccb0f1a5767661eaab7830b4",
  "committed_at" "2021-04-05T16:25:20Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:29Z",
 "messages"
 [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},
   "key" "root",
   "id" 271396651,
   "@representation" "minimal",
   "src" "binaryage/cljs-oops:.travis.yml@47581d1583135ae3",
   "level" "warn",
   "line" 0,
   "@type" "message",
   "code" "deprecated_key"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396650,
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
	at canary.projects.binaryage$cljs_oops.invokeStatic(binaryage.clj:11)
	at canary.projects.binaryage$cljs_oops.invoke(binaryage.clj:10)
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
 "@href" "/repo/19663833/request/577392369",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392369,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366762,
  "sha" "bf98f69978b28c97597089d9ffb7c5a4d251c169",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/cljs-time/compare/7f86226ef2bc5e1c8e00ab9c36096e76f84a73e1...bf98f69978b28c97597089d9ffb7c5a4d251c169",
  "committed_at" "2020-03-23T12:32:03Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:30Z",
 "messages"
 [{"args" {"key" "dist", "default" "xenial"},
   "key" "root",
   "id" 271396658,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396657,
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

#### <b style='color:red'>&#x2717; cljs-zones</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was not approved.
Owner binaryage does not have enough credits.
Please check your Travis credentials.
{"message" "Owner binaryage does not have enough credits.",
 "owner"
 {"@type" "organization",
  "@href" "/org/21703",
  "@representation" "minimal",
  "id" 21703,
  "login" "binaryage",
  "name" "BinaryAge",
  "vcs_type" "GithubOrganization",
  "ro_mode" false},
 "@href" "/repo/19650799/request/577392382",
 "config"
 {"before_script"
  ["yes y | sudo lein upgrade" "sudo apt-get install nodejs-dev node-gyp libssl1.0-dev npm" "(cd test && npm install)"],
  "notifications" {"email" [{"recipients" ["antonin@hildebrand.cz"]}]},
  "os" ["linux"],
  "cache" {"directories" ["$HOME/.m2"]},
  "env"
  {"global"
   [{"CANARY_BUILD" "1",
     "CANARY_CLOJURESCRIPT_VERSION" "1.10.867-9027c028",
     "CANARY_CLOJURESCRIPT_REPO" "https://github.com/clojure/clojurescript.git",
     "CANARY_CLOJURESCRIPT_REV" "9027c02852bbeb512cda728e5f0551145e921a9c",
     "CANARY_CLOJURESCRIPT_JAR_URL"
     "https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar",
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
  "before_install" ["curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash"],
  "dist" "bionic",
  "sudo" true,
  "language" "clojure"},
 "branch_name" "master",
 "base_commit" nil,
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19650799",
  "@representation" "minimal",
  "id" 19650799,
  "name" "cljs-zones",
  "slug" "binaryage/cljs-zones"},
 "id" 577392382,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
   "source" "api",
   "merge_mode" "deep_merge"}
  {"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "sudo: true\ndist: bionic\nlanguage: clojure\n\nnotifications:\n  email:\n    - antonin@hildebrand.cz\n\ncache:\n  directories:\n    - $HOME/.m2\n\nbefore_install:\n  - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash\n\nbefore_script:\n  # update lein to latest, https://github.com/technomancy/leiningen/issues/2014#issuecomment-153829977\n  - yes y | sudo lein upgrade\n  # https://medium.com/code-kings/npm-npm-depends-node-gyp-0-10-9-but-it-is-not-going-to-be-installed-error-try-this-dc65325136ce\n  - sudo apt-get install nodejs-dev node-gyp libssl1.0-dev npm\n  - (cd test && npm install)\n",
   "source" "binaryage/cljs-zones:.travis.yml@17402d8b51ca6a56",
   "merge_mode" nil}],
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 575366769,
  "sha" "17402d8b51ca6a56ce6ffdedf20b563a966cfe47",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/binaryage/cljs-zones/compare/5579bbe05bf84f5bf5ba37b82eff6444abec9f5b...17402d8b51ca6a56ce6ffdedf20b563a966cfe47",
  "committed_at" "2020-06-01T11:27:15Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:31Z",
 "messages"
 [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},
   "key" "root",
   "id" 271396663,
   "@representation" "minimal",
   "src" "binaryage/cljs-zones:.travis.yml@17402d8b51ca6a56",
   "level" "warn",
   "line" 0,
   "@type" "message",
   "code" "deprecated_key"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396662,
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
	at canary.projects.binaryage$cljs_zones.invokeStatic(binaryage.clj:14)
	at canary.projects.binaryage$cljs_zones.invoke(binaryage.clj:13)
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
 "@href" "/repo/19663829/request/577392398",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392398,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366786,
  "sha" "678cc43da64cfea2c08f2e2480d834378853d6a5",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.async/compare/8e02b0732c5fde44061191385d8002c2dd976e68...678cc43da64cfea2c08f2e2480d834378853d6a5",
  "committed_at" "2020-04-01T13:40:07Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:33Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396674,
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
 "@href" "/repo/19663832/request/577392407",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392407,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366798,
  "sha" "7dc7b78b2a574e007bacfb08ae21f012310dbef6",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.logic/compare/10ee95eb2bed70af5bc29ea3bd78b380f054a8b4...7dc7b78b2a574e007bacfb08ae21f012310dbef6",
  "committed_at" "2020-03-28T01:19:46Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:34Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396684,
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
 "@href" "/repo/19663831/request/577392418",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392418,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366809,
  "sha" "167994163cf50822271f81e14d60c8256a630b43",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.match/compare/8ac3a6874eaa23a025b5f41e306f393f8c75b4d8...167994163cf50822271f81e14d60c8256a630b43",
  "committed_at" "2020-03-28T01:20:53Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:35Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396691,
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
 "@href" "/repo/19663830/request/577392429",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392429,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366820,
  "sha" "f12cbe53a76f795b0db3e2fad23e5f644dafdb4a",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/core.rrb-vector/compare/88c605a72f1176813ca71d664275d480285f634e...f12cbe53a76f795b0db3e2fad23e5f644dafdb4a",
  "committed_at" "2020-03-28T01:21:38Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:36Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396698,
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
 "@href" "/repo/19663821/request/577392473",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392473,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366857,
  "sha" "70842bb570b6ffa8dd20dcc0622a7a7224729cd6",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/garden/compare/ed4805a5b33785f374511a3ff8e83287a4c710a6...70842bb570b6ffa8dd20dcc0622a7a7224729cd6",
  "committed_at" "2020-03-28T01:24:18Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:42Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396725,
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
 "@href" "/repo/19663822/request/577392446",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392446,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366835,
  "sha" "3186d38b8fb8ab7b9cdfb1ccd0ef49d099523710",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/om/compare/775f3adebde911988674f1bf179fd8b920031c8e...3186d38b8fb8ab7b9cdfb1ccd0ef49d099523710",
  "committed_at" "2020-03-28T01:27:16Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:38Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396708,
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
 "@href" "/repo/19663259/request/577392518",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392518,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}},\"jobs\":{\"exclude\":[{\"os\":\"osx\"}]}}",
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
  "id" 575366907,
  "sha" "b29498ebedba55368dd074de5e5961ebf4c3a2d3",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/planck-repl/planck/compare/63f479804725985c0f90f77bee229a82ef2f53a7...b29498ebedba55368dd074de5e5961ebf4c3a2d3",
  "committed_at" "2020-12-27T18:35:19Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:48Z",
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
 "@href" "/repo/19663823/request/577392501",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}],
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
 "id" 577392501,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366888,
  "sha" "a69823d855b310e99d8c10f3f3063ea897cf8c5b",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/spec-tools/compare/cfd4dd5b431b22e8238515125da22a6a1ce64da3...a69823d855b310e99d8c10f3f3063ea897cf8c5b",
  "committed_at" "2020-03-28T01:29:11Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:45Z",
 "messages"
 [{"args" {"key" "sudo", "info" "The key `sudo` has no effect anymore."},
   "key" "root",
   "id" 271396748,
   "@representation" "minimal",
   "src" "chkup/spec-tools:.travis.yml@a69823d855b310e9",
   "level" "warn",
   "line" 0,
   "@type" "message",
   "code" "deprecated_key"}
  {"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396747,
   "@representation" "minimal",
   "src" nil,
   "level" "info",
   "line" nil,
   "@type" "message",
   "code" "default"}
  {"args" {"alias" "matrix", "key" "jobs"},
   "key" "env",
   "id" 271396746,
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
 "@href" "/repo/19663820/request/577392551",
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
     "CANARY_TRAVIS_BUILD_URL" "https://travis-ci.com/cljs-oss/canary/builds/232030885"}]},
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
 "id" 577392551,
 "@representation" "standard",
 "pull_request_mergeable" nil,
 "raw_configs"
 [{"@type" "request_raw_configuration",
   "@representation" "minimal",
   "config"
   "{\"merge_mode\":\"deep_merge\",\"env\":{\"global\":{\"CANARY_BUILD\":\"1\",\"CANARY_CLOJURESCRIPT_VERSION\":\"1.10.867-9027c028\",\"CANARY_CLOJURESCRIPT_REPO\":\"https://github.com/clojure/clojurescript.git\",\"CANARY_CLOJURESCRIPT_REV\":\"9027c02852bbeb512cda728e5f0551145e921a9c\",\"CANARY_CLOJURESCRIPT_JAR_URL\":\"https://github.com/cljs-oss/canary/releases/download/r1.10.867-9027c028/clojurescript-1.10.867-9027c028.jar\",\"CANARY_TRAVIS_BUILD_URL\":\"https://travis-ci.com/cljs-oss/canary/builds/232030885\"}}}",
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
  "id" 575366943,
  "sha" "7fbc1fb65df830264009ca3ebd6c24a7ef0d28ac",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.867-9027c028",
  "compare_url"
  "https://github.com/chkup/test.check/compare/88eebf105fbb01db17ce12a3bff207cc395270b9...7fbc1fb65df830264009ca3ebd6c24a7ef0d28ac",
  "committed_at" "2020-03-28T02:13:54Z"},
 "state" "approved",
 "created_at" "2021-07-07T11:11:52Z",
 "messages"
 [{"args" {"key" "os", "default" "linux"},
   "key" "root",
   "id" 271396770,
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

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#1164](https://travis-ci.com/mfikes/cljs-bean/builds/232031117)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2924](https://travis-ci.com/mfikes/coal-mine/builds/232031127)<br>