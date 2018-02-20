## Report for job #273

Job: **#273** | [jobs/6cbf7b1](https://github.com/cljs-oss/canary/commit/6cbf7b1fd3d7fa363599460135fb26e9b67f9c85) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/344089199).

Compiler: **ClojureScript 1.10.7-7c754fb** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.7-7c754fb) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.7-7c754fb/clojurescript-1.10.7-7c754fb.jar) | [source](https://github.com/clojure/clojurescript/commit/7c754fbb9ffb9da790f21776d53a3b83deef922b).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 12 tasks.

Failed tasks: [lumo](#-lumo).

### Executed Tasks

#### <b style='color:red'>&#x2717; lumo</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
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
	at clojure.core$apply.invokeStatic(core.clj:657)
	at clojure.core$apply.invoke(core.clj:652)
	at canary.runner.travis$throttled_post_to_travis_api_BANG_.invokeStatic(travis.clj:61)
	at canary.runner.travis$throttled_post_to_travis_api_BANG_.doInvoke(travis.clj:58)
	at clojure.lang.RestFn.invoke(RestFn.java:457)
	at canary.runner.travis$trigger_build_BANG_.invokeStatic(travis.clj:94)
	at canary.runner.travis$trigger_build_BANG_.invoke(travis.clj:81)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:223)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:241)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:236)
	at canary.projects.lumo$lumo.invokeStatic(lumo.clj:5)
	at canary.projects.lumo$lumo.invoke(lumo.clj:4)
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