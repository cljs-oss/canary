## Report for job #101

Job: **#101** | [jobs/fcec609](https://github.com/cljs-oss/canary/commit/fcec609fc13b1843cb595e34d763a0e9a0485a00) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/281835144).

Compiler: **ClojureScript 1.9.943-300e326** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.943-300e326) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.943-300e326/clojurescript-1.9.943-300e326.jar) | [source](https://github.com/clojure/clojurescript/commit/300e326b83ba4110657bb646a9d396c5cb666501).

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

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#446](https://travis-ci.org/binaryage/chromex/builds/281835585)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#366](https://travis-ci.org/binaryage/cljs-devtools/builds/281835577)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1077](https://travis-ci.org/mfikes/planck/builds/281835579)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#233](https://travis-ci.org/binaryage/cljs-oops/builds/281835594)<br>