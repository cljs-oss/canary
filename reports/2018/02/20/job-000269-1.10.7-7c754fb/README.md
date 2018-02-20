## Report for job #269

Job: **#269** | [jobs/c00eee7](https://github.com/cljs-oss/canary/commit/c00eee7a7f06426e7137f9e52bdb593f21cd8e75) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/344073615).

Compiler: **ClojureScript 1.10.7-7c754fb** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.7-7c754fb) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.7-7c754fb/clojurescript-1.10.7-7c754fb.jar) | [source](https://github.com/clojure/clojurescript/commit/7c754fbb9ffb9da790f21776d53a3b83deef922b).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 12 tasks.

Failed tasks: [lumo](#-lumo).

### Executed Tasks

#### <b style='color:red'>&#x2717; lumo</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API token 'CANARY_LUMO_TRAVIS_TOKEN' not set in the environment {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:242)
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