## Report for job #1133
```
job --only clara-rules
```


Job: **#1133** | [jobs/0c2e84a](https://github.com/cljs-oss/canary/commit/0c2e84a1f8bfbef1ba9c300d48eabb47a366bfd7) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/597833235).

Compiler: **ClojureScript 1.10.585-5ad96a8b** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.585-5ad96a8b) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.585-5ad96a8b/clojurescript-1.10.585-5ad96a8b.jar) | [source](https://github.com/clojure/clojurescript/commit/5ad96a8b3ae2e3616a19715ba9ba2471a36933a2).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 25 tasks.

Failed tasks: [clara-rules](#-clara-rules).

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
	at canary.runner.jobs$spawn_task_BANG_$fn__10267.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10107.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

### Disabled Tasks

&nbsp;&nbsp;&nbsp;&nbsp;**chromex** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-bean** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-devtools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-oops** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-time** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-zones** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-async** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-logic** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-match** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**core-rrb-vector** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cuerdas** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**fulcro** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**garden** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**hoplon** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**ilk** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**om** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**planck** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**re-frame** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**reagent** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**side-fx** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**spec-tools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**specter** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**test-check** - disabled because not matching --only or --include options<br>