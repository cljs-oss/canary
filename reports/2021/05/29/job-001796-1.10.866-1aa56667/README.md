## Report for job #1796
```
job --only cljs-devtools
```


Job: **#1796** | [jobs/97cde0c](https://github.com/cljs-oss/canary/commit/97cde0c7b8c4751d6ba6aa2a75ff337fe346f343) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/227358981).

Compiler: **ClojureScript 1.10.866-1aa56667** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.866-1aa56667) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.866-1aa56667/clojurescript-1.10.866-1aa56667.jar) | [source](https://github.com/clojure/clojurescript/commit/1aa56667620198eee5b42a36e36691d514d47c9b).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 19 tasks.

Failed tasks: [cljs-devtools](#-cljs-devtools).

### Executed Tasks

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
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

### Disabled Tasks

&nbsp;&nbsp;&nbsp;&nbsp;**chromex** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**clara-rules** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-bean** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-oops** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-time** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-zones** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-async** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-logic** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-match** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-rrb-vector** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**garden** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**ilk** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**om** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**planck** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**side-fx** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**spec-tools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**test-check** - disabled because not matching --only or --include options<br>