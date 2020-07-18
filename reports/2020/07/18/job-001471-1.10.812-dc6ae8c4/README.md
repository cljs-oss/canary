## Report for job #1471
```
job
```


Job: **#1471** | [jobs/a755c36](https://github.com/cljs-oss/canary/commit/a755c36560e3fcfacfa202fa68d8e19c19b94695) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/709452995).

Compiler: **ClojureScript 1.10.812-dc6ae8c4** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.812-dc6ae8c4) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.812-dc6ae8c4/clojurescript-1.10.812-dc6ae8c4.jar) | [source](https://github.com/clojure/clojurescript/commit/dc6ae8c4e1baf12fbb563a0eb13f93a9d4ae1103).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 15 / 22 (executed) of total 22 tasks.

Failed tasks: [clara-rules](#-clara-rules) | [cljs-time](#-cljs-time) | [core-async](#-core-async) | [core-logic](#-core-logic) | [core-match](#-core-match) | [core-rrb-vector](#-core-rrb-vector) | [fulcro](#-fulcro) | [garden](#-garden) | [hoplon](#-hoplon) | [om](#-om) | [planck](#-planck) | [side-fx](#-side-fx) | [spec-tools](#-spec-tools) | [specter](#-specter) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; clara-rules</b>
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
	at canary.projects.chkup$clara_rules.invokeStatic(chkup.clj:5)
	at canary.projects.chkup$clara_rules.invoke(chkup.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; cljs-time</b>
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
	at canary.projects.chkup$cljs_time.invokeStatic(chkup.clj:41)
	at canary.projects.chkup$cljs_time.invoke(chkup.clj:40)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; core-async</b>
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
	at canary.projects.chkup$core_async.invokeStatic(chkup.clj:29)
	at canary.projects.chkup$core_async.invoke(chkup.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; core-logic</b>
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
	at canary.projects.chkup$core_logic.invokeStatic(chkup.clj:38)
	at canary.projects.chkup$core_logic.invoke(chkup.clj:37)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; core-match</b>
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
	at canary.projects.chkup$core_match.invokeStatic(chkup.clj:35)
	at canary.projects.chkup$core_match.invoke(chkup.clj:34)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; core-rrb-vector</b>
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
	at canary.projects.chkup$core_rrb_vector.invokeStatic(chkup.clj:32)
	at canary.projects.chkup$core_rrb_vector.invoke(chkup.clj:31)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; fulcro</b>
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
	at canary.projects.chkup$fulcro.invokeStatic(chkup.clj:8)
	at canary.projects.chkup$fulcro.invoke(chkup.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; garden</b>
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
	at canary.projects.chkup$garden.invokeStatic(chkup.clj:11)
	at canary.projects.chkup$garden.invoke(chkup.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; hoplon</b>
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
	at canary.projects.chkup$hoplon.invokeStatic(chkup.clj:14)
	at canary.projects.chkup$hoplon.invoke(chkup.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; om</b>
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
	at canary.projects.chkup$om.invokeStatic(chkup.clj:17)
	at canary.projects.chkup$om.invoke(chkup.clj:16)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; planck</b>
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
	at canary.projects.planck_repl$planck.invokeStatic(planck_repl.clj:5)
	at canary.projects.planck_repl$planck.invoke(planck_repl.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; side-fx</b>
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
	at canary.projects.cljsrn$side_fx.invokeStatic(cljsrn.clj:5)
	at canary.projects.cljsrn$side_fx.invoke(cljsrn.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; spec-tools</b>
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
	at canary.projects.chkup$spec_tools.invokeStatic(chkup.clj:20)
	at canary.projects.chkup$spec_tools.invoke(chkup.clj:19)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; specter</b>
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
	at canary.projects.chkup$specter.invokeStatic(chkup.clj:23)
	at canary.projects.chkup$specter.invoke(chkup.clj:22)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:red'>&#x2717; test-check</b>
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
	at canary.projects.chkup$test_check.invokeStatic(chkup.clj:26)
	at canary.projects.chkup$test_check.invoke(chkup.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11075.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10915.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#2189](https://travis-ci.org/binaryage/chromex/builds/709453536)<br>

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#791](https://travis-ci.org/mfikes/cljs-bean/builds/709453540)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1652](https://travis-ci.org/binaryage/cljs-devtools/builds/709453542)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#1526](https://travis-ci.org/binaryage/cljs-oops/builds/709453546)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#1154](https://travis-ci.org/binaryage/cljs-zones/builds/709453548)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2574](https://travis-ci.org/mfikes/coal-mine/builds/709453554)<br>

#### <b style='color:green'>&#x2713; ilk</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/ilk#688](https://travis-ci.org/mfikes/ilk/builds/709453644)<br>