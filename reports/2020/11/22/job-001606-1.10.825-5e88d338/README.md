## Report for job #1606
```
job
```


Job: **#1606** | [jobs/24a4b2c](https://github.com/cljs-oss/canary/commit/24a4b2c646d8c395b8df509bfb3f397783db0986) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/745197155).

Compiler: **ClojureScript 1.10.825-5e88d338** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.825-5e88d338) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.825-5e88d338/clojurescript-1.10.825-5e88d338.jar) | [source](https://github.com/clojure/clojurescript/commit/5e88d3383e0f950c4de410d3d6ee11769f3714f4).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 2 / 22 (executed) of total 22 tasks.

Failed tasks: [planck](#-planck) | [spec-tools](#-spec-tools).

### Executed Tasks

#### <b style='color:red'>&#x2717; planck</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; spec-tools</b>
```
Exception: clojure.lang.ExceptionInfo: Error: curl failed while talking to Travis:
["-sS" "-H" "Travis-API-Version: 3" "-H" "Authorization: token Ep7c0hAGFE9FQXdRzgkk2A" "https://api.travis-ci.org/repo/chkup%2Fspec-tools/request/233865409"]
curl: (35) OpenSSL SSL_connect: Connection reset by peer in connection to api.travis-ci.org:443 
 {}
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$talk_to_travis_api_BANG_.invokeStatic(travis.clj:36)
	at canary.runner.travis$talk_to_travis_api_BANG_.invoke(travis.clj:32)
	at canary.runner.travis$get_from_travis_api_BANG_.invokeStatic(travis.clj:71)
	at canary.runner.travis$get_from_travis_api_BANG_.invoke(travis.clj:68)
	at canary.runner.travis$poll_request_status_BANG_.invokeStatic(travis.clj:155)
	at canary.runner.travis$poll_request_status_BANG_.invoke(travis.clj:150)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:204)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:195)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:236)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$spec_tools.invokeStatic(chkup.clj:20)
	at canary.projects.chkup$spec_tools.invoke(chkup.clj:19)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#2357](https://travis-ci.org/binaryage/chromex/builds/745197398)<br>

#### <b style='color:green'>&#x2713; clara-rules</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/clara-rules#944](https://travis-ci.org/chkup/clara-rules/builds/745197400)<br>

#### <b style='color:green'>&#x2713; cljs-bean</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/cljs-bean#920](https://travis-ci.org/mfikes/cljs-bean/builds/745197402)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1778](https://travis-ci.org/binaryage/cljs-devtools/builds/745197404)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#1651](https://travis-ci.org/binaryage/cljs-oops/builds/745197408)<br>

#### <b style='color:green'>&#x2713; cljs-time</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cljs-time#403](https://travis-ci.org/chkup/cljs-time/builds/745197413)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#1279](https://travis-ci.org/binaryage/cljs-zones/builds/745197418)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#2703](https://travis-ci.org/mfikes/coal-mine/builds/745197420)<br>

#### <b style='color:green'>&#x2713; core-async</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.async#635](https://travis-ci.org/chkup/core.async/builds/745197428)<br>

#### <b style='color:green'>&#x2713; core-logic</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.logic#631](https://travis-ci.org/chkup/core.logic/builds/745197430)<br>

#### <b style='color:green'>&#x2713; core-match</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.match#628](https://travis-ci.org/chkup/core.match/builds/745197434)<br>

#### <b style='color:green'>&#x2713; core-rrb-vector</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/core.rrb-vector#628](https://travis-ci.org/chkup/core.rrb-vector/builds/745197436)<br>

#### <b style='color:green'>&#x2713; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/fulcro#944](https://travis-ci.org/chkup/fulcro/builds/745197438)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#954](https://travis-ci.org/chkup/garden/builds/745197440)<br>

#### <b style='color:green'>&#x2713; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/hoplon#943](https://travis-ci.org/chkup/hoplon/builds/745197472)<br>

#### <b style='color:green'>&#x2713; ilk</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/ilk#815](https://travis-ci.org/mfikes/ilk/builds/745197536)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#953](https://travis-ci.org/chkup/om/builds/745197522)<br>

#### <b style='color:green'>&#x2713; side-fx</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [cljsrn/side-fx#1004](https://travis-ci.org/cljsrn/side-fx/builds/745197483)<br>

#### <b style='color:green'>&#x2713; specter</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/specter#958](https://travis-ci.org/chkup/specter/builds/745197514)<br>

#### <b style='color:green'>&#x2713; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/test.check#956](https://travis-ci.org/chkup/test.check/builds/745197532)<br>