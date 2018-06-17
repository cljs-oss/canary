## Report for job #420

Job: **#420** | [jobs/39cc660](https://github.com/cljs-oss/canary/commit/39cc66063d65f374594fad4def0aaa984281d5b5) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/393303136).

Compiler: **ClojureScript 1.10.322-5dc641e** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.322-5dc641e) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.322-5dc641e/clojurescript-1.10.322-5dc641e.jar) | [source](https://github.com/clojure/clojurescript/commit/5dc641ed1bf5ea642a9cb00f0fc770eb479c23bb).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 13 tasks.

Failed tasks: [closurelatest](#-closurelatest).

### Executed Tasks

#### <b style='color:red'>&#x2717; closurelatest</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:142)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.mfikes$closurelatest.invokeStatic(mfikes.clj:31)
	at canary.projects.mfikes$closurelatest.invoke(mfikes.clj:30)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10806.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10783.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

### Disabled Tasks

&nbsp;&nbsp;&nbsp;&nbsp;**chromex** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-devtools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-oops** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-zones** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-1** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-2** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-3** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-4** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-5** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**env-config** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**planck** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**side-fx** - disabled because not matching --only or --include options<br>