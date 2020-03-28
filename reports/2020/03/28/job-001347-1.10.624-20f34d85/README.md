## Report for job #1347
```
job
```


Job: **#1347** | [jobs/adaaf94](https://github.com/cljs-oss/canary/commit/adaaf948337bcf4c90fa2e324a09138f0a5839b4) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/667947532).

Compiler: **ClojureScript 1.10.624-20f34d85** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.624-20f34d85) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.624-20f34d85/clojurescript-1.10.624-20f34d85.jar) | [source](https://github.com/clojure/clojurescript/commit/20f34d8533f1fd324b0c34da96f49ac0a5574d5b).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 11 / 25 (executed) of total 25 tasks.

Failed tasks: [chromex](#-chromex) | [cljs-devtools](#-cljs-devtools) | [cljs-oops](#-cljs-oops) | [cljs-zones](#-cljs-zones) | [cuerdas](#-cuerdas) | [hoplon](#-hoplon) | [planck](#-planck) | [re-frame](#-re-frame) | [reagent](#-reagent) | [side-fx](#-side-fx) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; chromex</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state ''
[30m{"@type" "error", "error_type" "not_found", "error_message" "resource not found (or insufficient access)"}[0m {}
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
	at canary.projects.binaryage$chromex.invokeStatic(binaryage.clj:8)
	at canary.projects.binaryage$chromex.invoke(binaryage.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11054.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10894.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; cljs-devtools</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state ''
[30m{"@type" "error", "error_type" "not_found", "error_message" "resource not found (or insufficient access)"}[0m {}
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
	at canary.projects.binaryage$cljs_devtools.invokeStatic(binaryage.clj:5)
	at canary.projects.binaryage$cljs_devtools.invoke(binaryage.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11054.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10894.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; cljs-oops</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state ''
[30m{"@type" "error", "error_type" "not_found", "error_message" "resource not found (or insufficient access)"}[0m {}
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
	at canary.projects.binaryage$cljs_oops.invokeStatic(binaryage.clj:11)
	at canary.projects.binaryage$cljs_oops.invoke(binaryage.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11054.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10894.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; cljs-zones</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state ''
[30m{"@type" "error", "error_type" "not_found", "error_message" "resource not found (or insufficient access)"}[0m {}
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
	at canary.projects.binaryage$cljs_zones.invokeStatic(binaryage.clj:14)
	at canary.projects.binaryage$cljs_zones.invoke(binaryage.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11054.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10894.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; cuerdas</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/cuerdas#782](https://travis-ci.org/chkup/cuerdas/builds/667948193)<br>

#### <b style='color:red'>&#x2717; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/hoplon#769](https://travis-ci.org/chkup/hoplon/builds/667948229)<br>

#### <b style='color:red'>&#x2717; planck</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; re-frame</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/re-frame#801](https://travis-ci.org/chkup/re-frame/builds/667948208)<br>

#### <b style='color:red'>&#x2717; reagent</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/reagent#779](https://travis-ci.org/chkup/reagent/builds/667948253)<br>

#### <b style='color:red'>&#x2717; side-fx</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [cljsrn/side-fx#830](https://travis-ci.org/cljsrn/side-fx/builds/667948273)<br>

#### <b style='color:red'>&#x2717; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/test.check#782](https://travis-ci.org/chkup/test.check/builds/667948340)<br>

#### <b style='color:green'>&#x2713; clara-rules</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/clara-rules#771](https://travis-ci.org/chkup/clara-rules/builds/667948166)<br>

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#674](https://travis-ci.org/mfikes/cljs-bean/builds/667948168)<br>

#### <b style='color:green'>&#x2713; cljs-time</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cljs-time#230](https://travis-ci.org/chkup/cljs-time/builds/667948170)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2458](https://travis-ci.org/mfikes/coal-mine/builds/667948173)<br>

#### <b style='color:green'>&#x2713; core-async</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.async#461](https://travis-ci.org/chkup/core.async/builds/667948181)<br>

#### <b style='color:green'>&#x2713; core-logic</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.logic#458](https://travis-ci.org/chkup/core.logic/builds/667948183)<br>

#### <b style='color:green'>&#x2713; core-match</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.match#455](https://travis-ci.org/chkup/core.match/builds/667948189)<br>

#### <b style='color:green'>&#x2713; core-rrb-vector</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.rrb-vector#455](https://travis-ci.org/chkup/core.rrb-vector/builds/667948191)<br>

#### <b style='color:green'>&#x2713; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/fulcro#771](https://travis-ci.org/chkup/fulcro/builds/667948375)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#781](https://travis-ci.org/chkup/garden/builds/667948197)<br>

#### <b style='color:green'>&#x2713; ilk</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/ilk#572](https://travis-ci.org/mfikes/ilk/builds/667948249)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#780](https://travis-ci.org/chkup/om/builds/667948206)<br>

#### <b style='color:green'>&#x2713; spec-tools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/spec-tools#787](https://travis-ci.org/chkup/spec-tools/builds/667948262)<br>

#### <b style='color:green'>&#x2713; specter</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/specter#785](https://travis-ci.org/chkup/specter/builds/667948382)<br>