## Report for job #324

Job: **#324** | [jobs/1a0f47e](https://github.com/cljs-oss/canary/commit/1a0f47ecad2fbcdc0f5dd4119f80f69300705308) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/358257279).

Compiler: **ClojureScript 1.10.241-39609cb** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.241-39609cb) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.241-39609cb/clojurescript-1.10.241-39609cb.jar) | [source](https://github.com/clojure/clojurescript/commit/39609cb28160036607b42cb3977584b927506e0a).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 13 / 13 (executed) of total 13 tasks.

Failed tasks: [chromex](#-chromex) | [cljs-devtools](#-cljs-devtools) | [cljs-oops](#-cljs-oops) | [cljs-zones](#-cljs-zones) | [closure-latest](#-closure-latest) | [coal-mine-1](#-coal-mine-1) | [coal-mine-2](#-coal-mine-2) | [coal-mine-3](#-coal-mine-3) | [coal-mine-4](#-coal-mine-4) | [coal-mine-5](#-coal-mine-5) | [env-config](#-env-config) | [lumo](#-lumo) | [planck](#-planck).

### Executed Tasks

#### <b style='color:red'>&#x2717; chromex</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was rejected. Your travis account might be banned.
{"message" "Abuse detected",
 "owner" {"@type" "organization", "@href" "/org/23773", "@representation" "minimal", "id" 23773, "login" "binaryage"},
 "@href" "/repo/6630961/request/109386359",
 "branch_name" {"@type" "branch", "@href" "/repo/6630961/branch/master", "@representation" "minimal", "name" "master"},
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/6630961",
  "@representation" "minimal",
  "id" 6630961,
  "name" "chromex",
  "slug" "binaryage/chromex"},
 "id" 109386359,
 "@representation" "standard",
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 106767791,
  "sha" "c636c52566459a83ba2c96763acdd84c8c8e1511",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.241-39609cb",
  "compare_url"
  "https://github.com/binaryage/chromex/compare/2a910f9bd3ad1fbff4703d10ddfdcf8c76ebb907...c636c52566459a83ba2c96763acdd84c8c8e1511",
  "committed_at" "2018-03-25T22:21:54Z"},
 "state" "configured",
 "created_at" "2018-03-26T06:05:48Z",
 "@type" "request",
 "result" "rejected"}
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:140)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.binaryage$chromex.invokeStatic(binaryage.clj:8)
	at canary.projects.binaryage$chromex.invoke(binaryage.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10799.invoke(jobs.clj:45)
	at canary.runner.threads$spawn_thread_fn$work__10776.invoke(threads.clj:18)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; cljs-devtools</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was rejected. Your travis account might be banned.
{"message" "Abuse detected",
 "owner" {"@type" "organization", "@href" "/org/23773", "@representation" "minimal", "id" 23773, "login" "binaryage"},
 "@href" "/repo/3839739/request/109386360",
 "branch_name" {"@type" "branch", "@href" "/repo/3839739/branch/master", "@representation" "minimal", "name" "master"},
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/3839739",
  "@representation" "minimal",
  "id" 3839739,
  "name" "cljs-devtools",
  "slug" "binaryage/cljs-devtools"},
 "id" 109386360,
 "@representation" "standard",
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 106767792,
  "sha" "3ad5cd56a1fd33c756634cf493a1024b44e35f99",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.241-39609cb",
  "compare_url"
  "https://github.com/binaryage/cljs-devtools/compare/aabfbff595f1e135850ce7c63e683c500b6d7687...3ad5cd56a1fd33c756634cf493a1024b44e35f99",
  "committed_at" "2018-03-20T15:18:21Z"},
 "state" "configured",
 "created_at" "2018-03-26T06:05:49Z",
 "@type" "request",
 "result" "rejected"}
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:140)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.binaryage$cljs_devtools.invokeStatic(binaryage.clj:5)
	at canary.projects.binaryage$cljs_devtools.invoke(binaryage.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10799.invoke(jobs.clj:45)
	at canary.runner.threads$spawn_thread_fn$work__10776.invoke(threads.clj:18)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; cljs-oops</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was rejected. Your travis account might be banned.
{"message" "Abuse detected",
 "owner" {"@type" "organization", "@href" "/org/23773", "@representation" "minimal", "id" 23773, "login" "binaryage"},
 "@href" "/repo/9999927/request/109386361",
 "branch_name" {"@type" "branch", "@href" "/repo/9999927/branch/master", "@representation" "minimal", "name" "master"},
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/9999927",
  "@representation" "minimal",
  "id" 9999927,
  "name" "cljs-oops",
  "slug" "binaryage/cljs-oops"},
 "id" 109386361,
 "@representation" "standard",
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 106767793,
  "sha" "f74ce8d9f7e61426912160f858e71588bdfecf75",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.241-39609cb",
  "compare_url"
  "https://github.com/binaryage/cljs-oops/compare/938ed861d707a9d9aa942a102d602f6c2d0c538d...f74ce8d9f7e61426912160f858e71588bdfecf75",
  "committed_at" "2018-01-14T22:22:52Z"},
 "state" "configured",
 "created_at" "2018-03-26T06:05:50Z",
 "@type" "request",
 "result" "rejected"}
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:140)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.binaryage$cljs_oops.invokeStatic(binaryage.clj:11)
	at canary.projects.binaryage$cljs_oops.invoke(binaryage.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10799.invoke(jobs.clj:45)
	at canary.runner.threads$spawn_thread_fn$work__10776.invoke(threads.clj:18)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; cljs-zones</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was rejected. Your travis account might be banned.
{"message" "Abuse detected",
 "owner" {"@type" "organization", "@href" "/org/23773", "@representation" "minimal", "id" 23773, "login" "binaryage"},
 "@href" "/repo/9692629/request/109386362",
 "branch_name" {"@type" "branch", "@href" "/repo/9692629/branch/master", "@representation" "minimal", "name" "master"},
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/9692629",
  "@representation" "minimal",
  "id" 9692629,
  "name" "cljs-zones",
  "slug" "binaryage/cljs-zones"},
 "id" 109386362,
 "@representation" "standard",
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 106767795,
  "sha" "41e57fb134e6af3a083c22ad0337ecbdfdeba05a",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.241-39609cb",
  "compare_url"
  "https://github.com/binaryage/cljs-zones/compare/456f9b2d6758963fc91d5a8b211b7f4f6224364a...41e57fb134e6af3a083c22ad0337ecbdfdeba05a",
  "committed_at" "2018-01-29T00:25:29Z"},
 "state" "configured",
 "created_at" "2018-03-26T06:05:51Z",
 "@type" "request",
 "result" "rejected"}
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:140)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.binaryage$cljs_zones.invokeStatic(binaryage.clj:17)
	at canary.projects.binaryage$cljs_zones.invoke(binaryage.clj:16)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10799.invoke(jobs.clj:45)
	at canary.runner.threads$spawn_thread_fn$work__10776.invoke(threads.clj:18)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; closure-latest</b>


#### <b style='color:red'>&#x2717; coal-mine-1</b>


#### <b style='color:red'>&#x2717; coal-mine-2</b>


#### <b style='color:red'>&#x2717; coal-mine-3</b>


#### <b style='color:red'>&#x2717; coal-mine-4</b>


#### <b style='color:red'>&#x2717; coal-mine-5</b>


#### <b style='color:red'>&#x2717; env-config</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was rejected. Your travis account might be banned.
{"message" "Abuse detected",
 "owner" {"@type" "organization", "@href" "/org/23773", "@representation" "minimal", "id" 23773, "login" "binaryage"},
 "@href" "/repo/10542944/request/109386373",
 "branch_name" {"@type" "branch", "@href" "/repo/10542944/branch/master", "@representation" "minimal", "name" "master"},
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/10542944",
  "@representation" "minimal",
  "id" 10542944,
  "name" "env-config",
  "slug" "binaryage/env-config"},
 "id" 109386373,
 "@representation" "standard",
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 106767805,
  "sha" "769416391287983dd437c03817e15925d7773687",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.241-39609cb",
  "compare_url"
  "https://github.com/binaryage/env-config/compare/e1b7971a74067deebcadcd6163c427decb2b8a6c...769416391287983dd437c03817e15925d7773687",
  "committed_at" "2018-01-28T23:55:12Z"},
 "state" "configured",
 "created_at" "2018-03-26T06:05:58Z",
 "@type" "request",
 "result" "rejected"}
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:140)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.binaryage$env_config.invokeStatic(binaryage.clj:14)
	at canary.projects.binaryage$env_config.invoke(binaryage.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10799.invoke(jobs.clj:45)
	at canary.runner.threads$spawn_thread_fn$work__10776.invoke(threads.clj:18)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; lumo</b>


#### <b style='color:red'>&#x2717; planck</b>
