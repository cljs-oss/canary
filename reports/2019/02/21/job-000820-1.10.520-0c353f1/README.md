## Report for job #820

Job: **#820** | [jobs/703b644](https://github.com/cljs-oss/canary/commit/703b644fcdddd4883860a80e0b6350d7d9a17c82) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/496362147).

Compiler: **ClojureScript 1.10.520-0c353f1** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.520-0c353f1) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.520-0c353f1/clojurescript-1.10.520-0c353f1.jar) | [source](https://github.com/clojure/clojurescript/commit/0c353f1947089cb8b1f010b4294b94ac109d4ef6).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 2 / 25 (executed) of total 25 tasks.

Failed tasks: [closurecomp](#-closurecomp) | [re-frame](#-re-frame).

### Executed Tasks

#### <b style='color:red'>&#x2717; closurecomp</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [mfikes/closurecomp#454](https://travis-ci.org/mfikes/closurecomp/builds/496362998)<br>

#### <b style='color:red'>&#x2717; re-frame</b>
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
	at canary.projects.chkup$re_frame.invokeStatic(chkup.clj:23)
	at canary.projects.chkup$re_frame.invoke(chkup.clj:22)
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
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#1346](https://travis-ci.org/binaryage/chromex/builds/496362953)<br>

#### <b style='color:green'>&#x2713; clara-rules</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/clara-rules#345](https://travis-ci.org/chkup/clara-rules/builds/496362955)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1022](https://travis-ci.org/binaryage/cljs-devtools/builds/496362962)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#906](https://travis-ci.org/binaryage/cljs-oops/builds/496362970)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#544](https://travis-ci.org/binaryage/cljs-zones/builds/496362996)<br>

#### <b style='color:green'>&#x2713; closurelib</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/closurelib#358](https://travis-ci.org/mfikes/closurelib/builds/496363000)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#1955](https://travis-ci.org/mfikes/coal-mine/builds/496363011)<br>

#### <b style='color:green'>&#x2713; core-async</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.async#34](https://travis-ci.org/chkup/core.async/builds/496363043)<br>

#### <b style='color:green'>&#x2713; core-logic</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.logic#32](https://travis-ci.org/chkup/core.logic/builds/496363033)<br>

#### <b style='color:green'>&#x2713; core-match</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.match#30](https://travis-ci.org/chkup/core.match/builds/496363035)<br>

#### <b style='color:green'>&#x2713; core-rrb-vector</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.rrb-vector#30](https://travis-ci.org/chkup/core.rrb-vector/builds/496363039)<br>

#### <b style='color:green'>&#x2713; cuerdas</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cuerdas#356](https://travis-ci.org/chkup/cuerdas/builds/496363041)<br>

#### <b style='color:green'>&#x2713; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/fulcro#347](https://travis-ci.org/chkup/fulcro/builds/496363155)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#355](https://travis-ci.org/chkup/garden/builds/496363060)<br>

#### <b style='color:green'>&#x2713; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/hoplon#342](https://travis-ci.org/chkup/hoplon/builds/496363131)<br>

#### <b style='color:green'>&#x2713; ilk</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/ilk#80](https://travis-ci.org/mfikes/ilk/builds/496363105)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#354](https://travis-ci.org/chkup/om/builds/496363111)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [planck-repl/planck#2802](https://travis-ci.org/planck-repl/planck/builds/496363119)<br>

#### <b style='color:green'>&#x2713; reagent</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/reagent#350](https://travis-ci.org/chkup/reagent/builds/496363164)<br>

#### <b style='color:green'>&#x2713; side-fx</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [cljsrn/side-fx#405](https://travis-ci.org/cljsrn/side-fx/builds/496363176)<br>

#### <b style='color:green'>&#x2713; spec-tools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/spec-tools#359](https://travis-ci.org/chkup/spec-tools/builds/496363193)<br>

#### <b style='color:green'>&#x2713; specter</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/specter#359](https://travis-ci.org/chkup/specter/builds/496363214)<br>

#### <b style='color:green'>&#x2713; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/test.check#355](https://travis-ci.org/chkup/test.check/builds/496363203)<br>