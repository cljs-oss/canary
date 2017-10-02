## Report for job #102

Job: **#102** | [jobs/9d12d61](https://github.com/cljs-oss/canary/commit/9d12d61688d80739705a9c0e6c0034035bd0f10e) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/282116949).

Compiler: **ClojureScript 1.9.944-9778b34** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.944-9778b34) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.944-9778b34/clojurescript-1.9.944-9778b34.jar) | [source](https://github.com/clojure/clojurescript/commit/9778b34d9e988a28c64133c4751d235bbbd3e966).

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
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#367](https://travis-ci.org/binaryage/cljs-devtools/builds/282117758)<br>

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#447](https://travis-ci.org/binaryage/chromex/builds/282117775)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1078](https://travis-ci.org/mfikes/planck/builds/282117777)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#234](https://travis-ci.org/binaryage/cljs-oops/builds/282117784)<br>