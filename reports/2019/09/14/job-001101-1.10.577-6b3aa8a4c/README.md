## Report for job #1101
```
job -c mfikes -r CLJS-3165
```


Job: **#1101** | [jobs/4500714](https://github.com/cljs-oss/canary/commit/45007140da64dd7e8991e654ea87956143faf4b3) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/584986712).

Compiler: **ClojureScript 1.10.577-6b3aa8a4c** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.577-6b3aa8a4c) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.577-6b3aa8a4c/clojurescript-1.10.577-6b3aa8a4c.jar) | [source](https://github.com/mfikes/clojurescript/commit/6b3aa8a4c07d5eab94904127710a4c219f6a5c4e).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 3 / 25 (executed) of total 25 tasks.

Failed tasks: [planck](#-planck) | [reagent](#-reagent) | [specter](#-specter).

### Executed Tasks

#### <b style='color:red'>&#x2717; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [planck-repl/planck#3600](https://travis-ci.org/planck-repl/planck/builds/584988042)<br>

#### <b style='color:red'>&#x2717; reagent</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): F
Forbidden
 {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:228)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$reagent.invokeStatic(chkup.clj:26)
	at canary.projects.chkup$reagent.invoke(chkup.clj:25)
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

#### <b style='color:red'>&#x2717; specter</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): F
Forbidden
 {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:228)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$specter.invokeStatic(chkup.clj:32)
	at canary.projects.chkup$specter.invoke(chkup.clj:31)
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

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#1704](https://travis-ci.org/binaryage/chromex/builds/584987785)<br>

#### <b style='color:green'>&#x2713; clara-rules</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/clara-rules#602](https://travis-ci.org/chkup/clara-rules/builds/584987792)<br>

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#436](https://travis-ci.org/mfikes/cljs-bean/builds/584987794)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1287](https://travis-ci.org/binaryage/cljs-devtools/builds/584987796)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#1171](https://travis-ci.org/binaryage/cljs-oops/builds/584987811)<br>

#### <b style='color:green'>&#x2713; cljs-time</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cljs-time#59](https://travis-ci.org/chkup/cljs-time/builds/584987815)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#803](https://travis-ci.org/binaryage/cljs-zones/builds/584987818)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2218](https://travis-ci.org/mfikes/coal-mine/builds/584987844)<br>

#### <b style='color:green'>&#x2713; core-async</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.async#291](https://travis-ci.org/chkup/core.async/builds/584987838)<br>

#### <b style='color:green'>&#x2713; core-logic</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.logic#289](https://travis-ci.org/chkup/core.logic/builds/584987842)<br>

#### <b style='color:green'>&#x2713; core-match</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.match#287](https://travis-ci.org/chkup/core.match/builds/584987866)<br>

#### <b style='color:green'>&#x2713; core-rrb-vector</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.rrb-vector#287](https://travis-ci.org/chkup/core.rrb-vector/builds/584987864)<br>

#### <b style='color:green'>&#x2713; cuerdas</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cuerdas#614](https://travis-ci.org/chkup/cuerdas/builds/584987880)<br>

#### <b style='color:green'>&#x2713; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/fulcro#604](https://travis-ci.org/chkup/fulcro/builds/584987873)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#612](https://travis-ci.org/chkup/garden/builds/584988020)<br>

#### <b style='color:green'>&#x2713; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/hoplon#602](https://travis-ci.org/chkup/hoplon/builds/584987916)<br>

#### <b style='color:green'>&#x2713; ilk</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/ilk#342](https://travis-ci.org/mfikes/ilk/builds/584987929)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#611](https://travis-ci.org/chkup/om/builds/584987910)<br>

#### <b style='color:green'>&#x2713; re-frame</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/re-frame#632](https://travis-ci.org/chkup/re-frame/builds/584987908)<br>

#### <b style='color:green'>&#x2713; side-fx</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [cljsrn/side-fx#662](https://travis-ci.org/cljsrn/side-fx/builds/584987893)<br>

#### <b style='color:green'>&#x2713; spec-tools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/spec-tools#618](https://travis-ci.org/chkup/spec-tools/builds/584987899)<br>

#### <b style='color:green'>&#x2713; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/test.check#612](https://travis-ci.org/chkup/test.check/builds/584987914)<br>