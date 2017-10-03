## Report for job #103

Job: **#103** | [jobs/14aaba4](https://github.com/cljs-oss/canary/commit/14aaba4872f6e96da242454dea2227d300cd5521) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/282583135).

Compiler: **ClojureScript 1.9.946-85b882b** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.946-85b882b) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.946-85b882b/clojurescript-1.9.946-85b882b.jar) | [source](https://github.com/clojure/clojurescript/commit/85b882b728984734793d635c923bfab0f71ba00f).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 5 (executed) of total 5 tasks.

Failed tasks: [specter](#-specter).

### Executed Tasks

#### <b style='color:red'>&#x2717; specter</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API token 'CANARY_SPECTER_TRAVIS_TOKEN' not set in the environment {}
	at clojure.core$ex_info.invokeStatic(core.clj:4617)
	at clojure.core$ex_info.invoke(core.clj:4617)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:225)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:219)
	at canary.projects.nathanmarz$specter.invokeStatic(nathanmarz.clj:5)
	at canary.projects.nathanmarz$specter.invoke(nathanmarz.clj:4)
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

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#368](https://travis-ci.org/binaryage/cljs-devtools/builds/282584202)<br>

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#448](https://travis-ci.org/binaryage/chromex/builds/282584203)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1079](https://travis-ci.org/mfikes/planck/builds/282584209)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#235](https://travis-ci.org/binaryage/cljs-oops/builds/282584206)<br>