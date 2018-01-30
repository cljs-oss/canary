## Report for job #242

Job: **#242** | [jobs/11e94ea](https://github.com/cljs-oss/canary/commit/11e94ea4ff818d698ebf1c496f970ab6d9b01627) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/334972400).

Compiler: **ClojureScript 1.9.1017-91431bd** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.1017-91431bd) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.1017-91431bd/clojurescript-1.9.1017-91431bd.jar) | [source](https://github.com/clojure/clojurescript/commit/91431bd556f7a11db59319fcc082737a448f651e).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 6 / 12 (executed) of total 12 tasks.

Failed tasks: [cljs-devtools](#-cljs-devtools) | [coal-mine-1](#-coal-mine-1) | [coal-mine-2](#-coal-mine-2) | [coal-mine-3](#-coal-mine-3) | [coal-mine-4](#-coal-mine-4) | [coal-mine-5](#-coal-mine-5).

### Executed Tasks

#### <b style='color:red'>&#x2717; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [binaryage/cljs-devtools#510](https://travis-ci.org/binaryage/cljs-devtools/builds/334973406)<br>

#### <b style='color:red'>&#x2717; coal-mine-1</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:137)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:128)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:193)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:184)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:226)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:223)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:241)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:236)
	at canary.projects.mfikes$coal_mine_1.invokeStatic(mfikes.clj:21)
	at canary.projects.mfikes$coal_mine_1.invoke(mfikes.clj:20)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__10742.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6995.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-2</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:137)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:128)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:193)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:184)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:226)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:223)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:241)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:236)
	at canary.projects.mfikes$coal_mine_2.invokeStatic(mfikes.clj:25)
	at canary.projects.mfikes$coal_mine_2.invoke(mfikes.clj:24)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__10742.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6995.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-3</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:137)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:128)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:193)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:184)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:226)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:223)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:241)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:236)
	at canary.projects.mfikes$coal_mine_3.invokeStatic(mfikes.clj:29)
	at canary.projects.mfikes$coal_mine_3.invoke(mfikes.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__10742.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6995.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-4</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:137)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:128)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:193)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:184)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:226)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:223)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:241)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:236)
	at canary.projects.mfikes$coal_mine_4.invokeStatic(mfikes.clj:33)
	at canary.projects.mfikes$coal_mine_4.invoke(mfikes.clj:32)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__10742.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6995.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-5</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:137)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:128)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:193)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:184)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:226)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:223)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:241)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:236)
	at canary.projects.mfikes$coal_mine_5.invokeStatic(mfikes.clj:37)
	at canary.projects.mfikes$coal_mine_5.invoke(mfikes.clj:36)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__10742.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6995.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:green'>&#x2713; andare</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/andare#37](https://travis-ci.org/mfikes/andare/builds/334973402)<br>

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#632](https://travis-ci.org/binaryage/chromex/builds/334973404)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#372](https://travis-ci.org/binaryage/cljs-oops/builds/334973408)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#42](https://travis-ci.org/binaryage/cljs-zones/builds/334973413)<br>

#### <b style='color:green'>&#x2713; env-config</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/env-config#67](https://travis-ci.org/binaryage/env-config/builds/334973475)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1473](https://travis-ci.org/mfikes/planck/builds/334973492)<br>