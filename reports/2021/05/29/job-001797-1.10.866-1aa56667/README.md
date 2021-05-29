## Report for job #1797
```
job --only cljs-devtools
```


Job: **#1797** | [jobs/de0b9b4](https://github.com/cljs-oss/canary/commit/de0b9b4d11d76adc25e6c84382e8a17f1c1352d9) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/227359535).

Compiler: **ClojureScript 1.10.866-1aa56667** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.866-1aa56667) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.866-1aa56667/clojurescript-1.10.866-1aa56667.jar) | [source](https://github.com/clojure/clojurescript/commit/1aa56667620198eee5b42a36e36691d514d47c9b).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 19 tasks.

Failed tasks: [cljs-devtools](#-cljs-devtools).

### Executed Tasks

#### <b style='color:red'>&#x2717; cljs-devtools</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$parse_response.invokeStatic(travis.clj:25)
	at canary.runner.travis$parse_response.invoke(travis.clj:21)
	at canary.runner.travis$inspect_api_response.invokeStatic(travis.clj:28)
	at canary.runner.travis$inspect_api_response.invoke(travis.clj:27)
	at canary.runner.travis$talk_to_travis_api_BANG_.invokeStatic(travis.clj:35)
	at canary.runner.travis$talk_to_travis_api_BANG_.invoke(travis.clj:32)
	at canary.runner.travis$non_throttled_post_to_travis_api_BANG_.invokeStatic(travis.clj:50)
	at canary.runner.travis$non_throttled_post_to_travis_api_BANG_.invoke(travis.clj:43)
	at clojure.lang.AFn.applyToHelper(AFn.java:165)
	at clojure.lang.AFn.applyTo(AFn.java:144)
	at clojure.core$apply.invokeStatic(core.clj:665)
	at clojure.core$apply.invoke(core.clj:660)
	at canary.runner.travis$throttled_post_to_travis_api_BANG_.invokeStatic(travis.clj:61)
	at canary.runner.travis$throttled_post_to_travis_api_BANG_.doInvoke(travis.clj:58)
	at clojure.lang.RestFn.invoke(RestFn.java:457)
	at canary.runner.travis$trigger_build_BANG_.invokeStatic(travis.clj:95)
	at canary.runner.travis$trigger_build_BANG_.invoke(travis.clj:82)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
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