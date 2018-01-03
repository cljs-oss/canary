## Report for job #202

Job: **#202** | [jobs/08745c0](https://github.com/cljs-oss/canary/commit/08745c03e78a512011f5c0a343ff7a03fd7789f3) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/324719721).

Compiler: **ClojureScript 1.9.1004-0ddafa7** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.1004-0ddafa7) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.1004-0ddafa7/clojurescript-1.9.1004-0ddafa7.jar) | [source](https://github.com/clojure/clojurescript/commit/0ddafa7792efa1ef885b10c96f171a704890e7d7).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 9 / 14 (executed) of total 14 tasks.

Failed tasks: [coal-mine-01](#-coal-mine-01) | [coal-mine-03](#-coal-mine-03) | [coal-mine-06](#-coal-mine-06) | [coal-mine-07](#-coal-mine-07) | [coal-mine-02](#-coal-mine-02) | [coal-mine-08](#-coal-mine-08) | [coal-mine-04](#-coal-mine-04) | [coal-mine-05](#-coal-mine-05) | [coal-mine-09](#-coal-mine-09).

### Executed Tasks

#### <b style='color:red'>&#x2717; coal-mine-01</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_01.invokeStatic(mfikes.clj:21)
	at canary.projects.mfikes$coal_mine_01.invoke(mfikes.clj:20)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-03</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_03.invokeStatic(mfikes.clj:29)
	at canary.projects.mfikes$coal_mine_03.invoke(mfikes.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-06</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_06.invokeStatic(mfikes.clj:41)
	at canary.projects.mfikes$coal_mine_06.invoke(mfikes.clj:40)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-07</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_07.invokeStatic(mfikes.clj:45)
	at canary.projects.mfikes$coal_mine_07.invoke(mfikes.clj:44)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-02</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_02.invokeStatic(mfikes.clj:25)
	at canary.projects.mfikes$coal_mine_02.invoke(mfikes.clj:24)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-08</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_08.invokeStatic(mfikes.clj:49)
	at canary.projects.mfikes$coal_mine_08.invoke(mfikes.clj:48)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-04</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_04.invokeStatic(mfikes.clj:33)
	at canary.projects.mfikes$coal_mine_04.invoke(mfikes.clj:32)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-05</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_05.invokeStatic(mfikes.clj:37)
	at canary.projects.mfikes$coal_mine_05.invoke(mfikes.clj:36)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-09</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:121)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:112)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:176)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:167)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:209)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine_09.invokeStatic(mfikes.clj:53)
	at canary.projects.mfikes$coal_mine_09.invoke(mfikes.clj:52)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:23)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:20)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:28)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:25)
	at canary.runner.jobs$spawn_task_BANG_$fn__9753.invoke(jobs.clj:38)
	at clojure.core.async$thread_call$fn__6061.invoke(async.clj:442)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#583](https://travis-ci.org/binaryage/chromex/builds/324721179)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#472](https://travis-ci.org/binaryage/cljs-devtools/builds/324721183)<br>

#### <b style='color:green'>&#x2713; coal-mine-10</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#59](https://travis-ci.org/mfikes/coal-mine/builds/324721118)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1329](https://travis-ci.org/mfikes/planck/builds/324721129)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#336](https://travis-ci.org/binaryage/cljs-oops/builds/324721181)<br>