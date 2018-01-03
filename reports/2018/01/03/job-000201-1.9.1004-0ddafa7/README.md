## Report for job #201

Job: **#201** | [jobs/0a91d18](https://github.com/cljs-oss/canary/commit/0a91d1891b19441327a5733ab3876d049eee88bd) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/324707227).

Compiler: **ClojureScript 1.9.1004-0ddafa7** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.9.1004-0ddafa7) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.9.1004-0ddafa7/clojurescript-1.9.1004-0ddafa7.jar) | [source](https://github.com/clojure/clojurescript/commit/0ddafa7792efa1ef885b10c96f171a704890e7d7).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 2 / 14 (executed) of total 14 tasks.

Failed tasks: [coal-mine-08](#-coal-mine-08) | [coal-mine-02](#-coal-mine-02).

### Executed Tasks

#### <b style='color:red'>&#x2717; coal-mine-08</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): F
Forbidden
 {}
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
	at canary.projects.mfikes$coal_mine_08.invokeStatic(mfikes.clj:58)
	at canary.projects.mfikes$coal_mine_08.invoke(mfikes.clj:57)
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

#### <b style='color:red'>&#x2717; coal-mine-02</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [mfikes/coal-mine#55](https://travis-ci.org/mfikes/coal-mine/builds/324708878)<br>

#### <b style='color:green'>&#x2713; coal-mine-05</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#50](https://travis-ci.org/mfikes/coal-mine/builds/324708832)<br>

#### <b style='color:green'>&#x2713; coal-mine-03</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#52](https://travis-ci.org/mfikes/coal-mine/builds/324708838)<br>

#### <b style='color:green'>&#x2713; coal-mine-09</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#51](https://travis-ci.org/mfikes/coal-mine/builds/324708836)<br>

#### <b style='color:green'>&#x2713; coal-mine-04</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#53](https://travis-ci.org/mfikes/coal-mine/builds/324708864)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#471](https://travis-ci.org/binaryage/cljs-devtools/builds/324708827)<br>

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#582](https://travis-ci.org/binaryage/chromex/builds/324708816)<br>

#### <b style='color:green'>&#x2713; coal-mine-10</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#54](https://travis-ci.org/mfikes/coal-mine/builds/324708876)<br>

#### <b style='color:green'>&#x2713; coal-mine-06</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#56](https://travis-ci.org/mfikes/coal-mine/builds/324708880)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/planck#1328](https://travis-ci.org/mfikes/planck/builds/324708868)<br>

#### <b style='color:green'>&#x2713; coal-mine-07</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#57](https://travis-ci.org/mfikes/coal-mine/builds/324708889)<br>

#### <b style='color:green'>&#x2713; coal-mine-01</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#58](https://travis-ci.org/mfikes/coal-mine/builds/324708893)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#335](https://travis-ci.org/binaryage/cljs-oops/builds/324708833)<br>