## Report for job #189

Job: **#189** | [jobs/3d78c18](https://github.com/cljs-oss/canary/commit/3d78c1857e766523b0ce731692253d9b9bdff063) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/322234243).

Compiler: **ClojureScript 1.9.999-4a24d18** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.999-4a24d18) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.999-4a24d18/clojurescript-1.9.999-4a24d18.jar) | [source](https://github.com/clojure/clojurescript/commit/4a24d18ca86ba9f41856cc37314cfa4d4797a3b1).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 5 tasks.

Failed tasks: [coal-mine](#-coal-mine).

### Executed Tasks

#### <b style='color:red'>&#x2717; coal-mine</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$parse_response.invokeStatic(travis.clj:26)
	at canary.runner.travis$parse_response.invoke(travis.clj:22)
	at canary.runner.travis$inspect_api_response.invokeStatic(travis.clj:29)
	at canary.runner.travis$inspect_api_response.invoke(travis.clj:28)
	at canary.runner.travis$talk_to_travis_api_BANG_.invokeStatic(travis.clj:36)
	at canary.runner.travis$talk_to_travis_api_BANG_.invoke(travis.clj:33)
	at canary.runner.travis$post_to_travis_api_BANG_.invokeStatic(travis.clj:51)
	at canary.runner.travis$post_to_travis_api_BANG_.invoke(travis.clj:44)
	at canary.runner.travis$trigger_build_BANG_.invokeStatic(travis.clj:78)
	at canary.runner.travis$trigger_build_BANG_.invoke(travis.clj:65)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:207)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:206)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:224)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.mfikes$coal_mine.invokeStatic(mfikes.clj:18)
	at canary.projects.mfikes$coal_mine.invoke(mfikes.clj:17)
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

### Disabled Tasks

&nbsp;&nbsp;&nbsp;&nbsp;**chromex** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-oops** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-devtools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**planck** - disabled because not matching --only or --include options<br>