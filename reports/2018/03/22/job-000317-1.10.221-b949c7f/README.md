## Report for job #317

Job: **#317** | [jobs/d212d3d](https://github.com/cljs-oss/canary/commit/d212d3ddc5e23f4ad4baedcdc688388b0fb72072) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/356741302).

Compiler: **ClojureScript 1.10.221-b949c7f** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.221-b949c7f) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.221-b949c7f/clojurescript-1.10.221-b949c7f.jar) | [source](https://github.com/clojure/clojurescript/commit/b949c7ffd82f410043ee44bb052caf7b42660104).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 6 / 12 (executed) of total 12 tasks.

Failed tasks: [chromex](#-chromex) | [cljs-devtools](#-cljs-devtools) | [cljs-oops](#-cljs-oops) | [cljs-zones](#-cljs-zones) | [env-config](#-env-config) | [lumo](#-lumo).

### Executed Tasks

#### <b style='color:red'>&#x2717; chromex</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'configured' {}
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
	at canary.projects.binaryage$chromex.invokeStatic(binaryage.clj:8)
	at canary.projects.binaryage$chromex.invoke(binaryage.clj:7)
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

#### <b style='color:red'>&#x2717; cljs-devtools</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'configured' {}
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
	at canary.projects.binaryage$cljs_devtools.invokeStatic(binaryage.clj:5)
	at canary.projects.binaryage$cljs_devtools.invoke(binaryage.clj:4)
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

#### <b style='color:red'>&#x2717; cljs-oops</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'configured' {}
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
	at canary.projects.binaryage$cljs_oops.invokeStatic(binaryage.clj:11)
	at canary.projects.binaryage$cljs_oops.invoke(binaryage.clj:10)
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

#### <b style='color:red'>&#x2717; cljs-zones</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'configured' {}
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
	at canary.projects.binaryage$cljs_zones.invokeStatic(binaryage.clj:17)
	at canary.projects.binaryage$cljs_zones.invoke(binaryage.clj:16)
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

#### <b style='color:red'>&#x2717; env-config</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state 'configured' {}
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
	at canary.projects.binaryage$env_config.invokeStatic(binaryage.clj:14)
	at canary.projects.binaryage$env_config.invoke(binaryage.clj:13)
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

#### <b style='color:red'>&#x2717; lumo</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [anmonteiro/lumo#977](https://travis-ci.org/anmonteiro/lumo/builds/356742322)<br>

#### <b style='color:green'>&#x2713; coal-mine-1</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#840](https://travis-ci.org/mfikes/coal-mine/builds/356742302)<br>

#### <b style='color:green'>&#x2713; coal-mine-2</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#841](https://travis-ci.org/mfikes/coal-mine/builds/356742308)<br>

#### <b style='color:green'>&#x2713; coal-mine-3</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#842](https://travis-ci.org/mfikes/coal-mine/builds/356742310)<br>

#### <b style='color:green'>&#x2713; coal-mine-4</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#843](https://travis-ci.org/mfikes/coal-mine/builds/356742316)<br>

#### <b style='color:green'>&#x2713; coal-mine-5</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#844](https://travis-ci.org/mfikes/coal-mine/builds/356742318)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1729](https://travis-ci.org/mfikes/planck/builds/356742324)<br>