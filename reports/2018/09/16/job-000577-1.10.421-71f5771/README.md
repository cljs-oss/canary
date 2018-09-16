## Report for job #577

Job: **#577** | [jobs/d91b3fe](https://github.com/cljs-oss/canary/commit/d91b3fe8d3fd4a2afbbec0d11dca6ec1e73a6359) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/429153019).

Compiler: **ClojureScript 1.10.421-71f5771** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.421-71f5771) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.421-71f5771/clojurescript-1.10.421-71f5771.jar) | [source](https://github.com/clojure/clojurescript/commit/71f57714e6fc2f591d9de22cbfcfa009500e6742).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 2 / 20 (executed) of total 20 tasks.

Failed tasks: [reagent](#-reagent) | [side-fx](#-side-fx).

### Executed Tasks

#### <b style='color:red'>&#x2717; reagent</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/reagent#121](https://travis-ci.org/chkup/reagent/builds/429153595)<br>

#### <b style='color:red'>&#x2717; side-fx</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): F
Forbidden
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
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
	at clojure.core$apply.invokeStatic(core.clj:657)
	at clojure.core$apply.invoke(core.clj:652)
	at canary.runner.travis$throttled_post_to_travis_api_BANG_.invokeStatic(travis.clj:61)
	at canary.runner.travis$throttled_post_to_travis_api_BANG_.doInvoke(travis.clj:58)
	at clojure.lang.RestFn.invoke(RestFn.java:457)
	at canary.runner.travis$trigger_build_BANG_.invokeStatic(travis.clj:95)
	at canary.runner.travis$trigger_build_BANG_.invoke(travis.clj:82)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:228)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.cljsrn$side_fx.invokeStatic(cljsrn.clj:5)
	at canary.projects.cljsrn$side_fx.invoke(cljsrn.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#1027](https://travis-ci.org/binaryage/chromex/builds/429153475)<br>

#### <b style='color:green'>&#x2713; clara-rules</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/clara-rules#118](https://travis-ci.org/chkup/clara-rules/builds/429153479)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#793](https://travis-ci.org/binaryage/cljs-devtools/builds/429153481)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#665](https://travis-ci.org/binaryage/cljs-oops/builds/429153493)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#317](https://travis-ci.org/binaryage/cljs-zones/builds/429153495)<br>

#### <b style='color:green'>&#x2713; closurecomp</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/closurecomp#245](https://travis-ci.org/mfikes/closurecomp/builds/429153499)<br>

#### <b style='color:green'>&#x2713; closurelib</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/closurelib#131](https://travis-ci.org/mfikes/closurelib/builds/429153501)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#1627](https://travis-ci.org/mfikes/coal-mine/builds/429153505)<br>

#### <b style='color:green'>&#x2713; cuerdas</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cuerdas#130](https://travis-ci.org/chkup/cuerdas/builds/429153511)<br>

#### <b style='color:green'>&#x2713; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/fulcro#118](https://travis-ci.org/chkup/fulcro/builds/429153536)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#128](https://travis-ci.org/chkup/garden/builds/429153538)<br>

#### <b style='color:green'>&#x2713; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/hoplon#115](https://travis-ci.org/chkup/hoplon/builds/429153579)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#127](https://travis-ci.org/chkup/om/builds/429153593)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [planck-repl/planck#2345](https://travis-ci.org/planck-repl/planck/builds/429153597)<br>

#### <b style='color:green'>&#x2713; re-frame</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/re-frame#144](https://travis-ci.org/chkup/re-frame/builds/429153589)<br>

#### <b style='color:green'>&#x2713; spec-tools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/spec-tools#132](https://travis-ci.org/chkup/spec-tools/builds/429153601)<br>

#### <b style='color:green'>&#x2713; specter</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/specter#132](https://travis-ci.org/chkup/specter/builds/429153609)<br>

#### <b style='color:green'>&#x2713; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/test.check#128](https://travis-ci.org/chkup/test.check/builds/429153613)<br>