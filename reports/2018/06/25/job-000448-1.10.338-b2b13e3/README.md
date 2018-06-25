## Report for job #448

Job: **#448** | [jobs/68522c1](https://github.com/cljs-oss/canary/commit/68522c12f9bc7e4e6fb5f445de79a49f82f6b5d6) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/396435704).

Compiler: **ClojureScript 1.10.338-b2b13e3** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.338-b2b13e3) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.338-b2b13e3/clojurescript-1.10.338-b2b13e3.jar) | [source](https://github.com/clojure/clojurescript/commit/b2b13e370545d2eac661caab1a54b42a33d27ee9).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 9 / 25 (executed) of total 25 tasks.

Failed tasks: [clara-rules](#-clara-rules) | [closurecomp](#-closurecomp) | [coal-mine-2](#-coal-mine-2) | [coal-mine-3](#-coal-mine-3) | [coal-mine-4](#-coal-mine-4) | [coal-mine-5](#-coal-mine-5) | [env-config](#-env-config) | [fulcro](#-fulcro) | [planck](#-planck).

### Executed Tasks

#### <b style='color:red'>&#x2717; clara-rules</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; closurecomp</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; coal-mine-2</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): <
<!DOCTYPE html>
	<html>
	  <head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8">
		<title>Application Error</title>
		<style media="screen">
		  html,body,iframe {
			margin: 0;
			padding: 0;
		  }
		  html,body {
			height: 100%;
			overflow: hidden;
		  }
		  iframe {
			width: 100%;
			height: 100%;
			border: 0;
		  }
		</style>
	  </head>
	  <body>
		<iframe src="//www.herokucdn.com/error-pages/application-error.html"></iframe>
	  </body>
	</html> {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$parse_response.invokeStatic(travis.clj:25)
	at canary.runner.travis$parse_response.invoke(travis.clj:21)
	at canary.runner.travis$inspect_api_response.invokeStatic(travis.clj:28)
	at canary.runner.travis$inspect_api_response.invoke(travis.clj:27)
	at canary.runner.travis$talk_to_travis_api_BANG_.invokeStatic(travis.clj:35)
	at canary.runner.travis$talk_to_travis_api_BANG_.invoke(travis.clj:32)
	at canary.runner.travis$get_from_travis_api_BANG_.invokeStatic(travis.clj:71)
	at canary.runner.travis$get_from_travis_api_BANG_.invoke(travis.clj:68)
	at canary.runner.travis$poll_request_status_BANG_.invokeStatic(travis.clj:149)
	at canary.runner.travis$poll_request_status_BANG_.invoke(travis.clj:144)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:197)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.mfikes$coal_mine_2.invokeStatic(mfikes.clj:12)
	at canary.projects.mfikes$coal_mine_2.invoke(mfikes.clj:11)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:30)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10806.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10783.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

```

#### <b style='color:red'>&#x2717; coal-mine-3</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; coal-mine-4</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; coal-mine-5</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; env-config</b>
The task has timeouted.

#### <b style='color:red'>&#x2717; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/fulcro#6](https://travis-ci.org/chkup/fulcro/builds/396438821)<br>

#### <b style='color:red'>&#x2717; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [planck-repl/planck#2079](https://travis-ci.org/planck-repl/planck/builds/396439228)<br>

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#875](https://travis-ci.org/binaryage/chromex/builds/396438603)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#679](https://travis-ci.org/binaryage/cljs-devtools/builds/396438526)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#549](https://travis-ci.org/binaryage/cljs-oops/builds/396438528)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#204](https://travis-ci.org/binaryage/cljs-zones/builds/396438534)<br>

#### <b style='color:green'>&#x2713; closurelib</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/closurelib#14](https://travis-ci.org/mfikes/closurelib/builds/396438589)<br>

#### <b style='color:green'>&#x2713; coal-mine-1</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#1400](https://travis-ci.org/mfikes/coal-mine/builds/396438594)<br>

#### <b style='color:green'>&#x2713; cuerdas</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cuerdas#18](https://travis-ci.org/chkup/cuerdas/builds/396438668)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#16](https://travis-ci.org/chkup/garden/builds/396439138)<br>

#### <b style='color:green'>&#x2713; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/hoplon#3](https://travis-ci.org/chkup/hoplon/builds/396438783)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#15](https://travis-ci.org/chkup/om/builds/396439190)<br>

#### <b style='color:green'>&#x2713; re-frame</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/re-frame#32](https://travis-ci.org/chkup/re-frame/builds/396438912)<br>

#### <b style='color:green'>&#x2713; reagent</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/reagent#9](https://travis-ci.org/chkup/reagent/builds/396438838)<br>

#### <b style='color:green'>&#x2713; side-fx</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [cljsrn/side-fx#64](https://travis-ci.org/cljsrn/side-fx/builds/396439003)<br>

#### <b style='color:green'>&#x2713; spec-tools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/spec-tools#17](https://travis-ci.org/chkup/spec-tools/builds/396439254)<br>

#### <b style='color:green'>&#x2713; specter</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/specter#18](https://travis-ci.org/chkup/specter/builds/396438872)<br>

#### <b style='color:green'>&#x2713; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/test.check#16](https://travis-ci.org/chkup/test.check/builds/396439076)<br>