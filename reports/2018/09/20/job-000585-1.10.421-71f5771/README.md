## Report for job #585

Job: **#585** | [jobs/cb55bf1](https://github.com/cljs-oss/canary/commit/cb55bf1ef38a38b26a71a1743a5701d6d7241deb) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/430874771).

Compiler: **ClojureScript 1.10.421-71f5771** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.421-71f5771) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.421-71f5771/clojurescript-1.10.421-71f5771.jar) | [source](https://github.com/clojure/clojurescript/commit/71f57714e6fc2f591d9de22cbfcfa009500e6742).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 2 / 20 (executed) of total 20 tasks.

Failed tasks: [coal-mine](#-coal-mine) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; coal-mine</b>
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
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$parse_response.invokeStatic(travis.clj:25)
	at canary.runner.travis$parse_response.invoke(travis.clj:21)
	at canary.runner.travis$inspect_api_response.invokeStatic(travis.clj:28)
	at canary.runner.travis$inspect_api_response.invoke(travis.clj:27)
	at canary.runner.travis$talk_to_travis_api_BANG_.invokeStatic(travis.clj:35)
	at canary.runner.travis$talk_to_travis_api_BANG_.invoke(travis.clj:32)
	at canary.runner.travis$get_from_travis_api_BANG_.invokeStatic(travis.clj:71)
	at canary.runner.travis$get_from_travis_api_BANG_.invoke(travis.clj:68)
	at canary.runner.travis$poll_request_status_BANG_.invokeStatic(travis.clj:150)
	at canary.runner.travis$poll_request_status_BANG_.invoke(travis.clj:145)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.mfikes$coal_mine.invokeStatic(mfikes.clj:11)
	at canary.projects.mfikes$coal_mine.invoke(mfikes.clj:4)
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

#### <b style='color:red'>&#x2717; test-check</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [chkup/test.check#135](https://travis-ci.org/chkup/test.check/builds/430875906)<br>

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#1036](https://travis-ci.org/binaryage/chromex/builds/430875768)<br>

#### <b style='color:green'>&#x2713; clara-rules</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/clara-rules#125](https://travis-ci.org/chkup/clara-rules/builds/430875778)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#800](https://travis-ci.org/binaryage/cljs-devtools/builds/430875772)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#672](https://travis-ci.org/binaryage/cljs-oops/builds/430875776)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#324](https://travis-ci.org/binaryage/cljs-zones/builds/430875782)<br>

#### <b style='color:green'>&#x2713; closurecomp</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/closurecomp#252](https://travis-ci.org/mfikes/closurecomp/builds/430875784)<br>

#### <b style='color:green'>&#x2713; closurelib</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/closurelib#138](https://travis-ci.org/mfikes/closurelib/builds/430875789)<br>

#### <b style='color:green'>&#x2713; cuerdas</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/cuerdas#137](https://travis-ci.org/chkup/cuerdas/builds/430875800)<br>

#### <b style='color:green'>&#x2713; fulcro</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/fulcro#125](https://travis-ci.org/chkup/fulcro/builds/430875802)<br>

#### <b style='color:green'>&#x2713; garden</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/garden#135](https://travis-ci.org/chkup/garden/builds/430875804)<br>

#### <b style='color:green'>&#x2713; hoplon</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/hoplon#122](https://travis-ci.org/chkup/hoplon/builds/430875806)<br>

#### <b style='color:green'>&#x2713; om</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/om#134](https://travis-ci.org/chkup/om/builds/430875808)<br>

#### <b style='color:green'>&#x2713; planck</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [planck-repl/planck#2352](https://travis-ci.org/planck-repl/planck/builds/430875878)<br>

#### <b style='color:green'>&#x2713; re-frame</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/re-frame#151](https://travis-ci.org/chkup/re-frame/builds/430875818)<br>

#### <b style='color:green'>&#x2713; reagent</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/reagent#130](https://travis-ci.org/chkup/reagent/builds/430875860)<br>

#### <b style='color:green'>&#x2713; side-fx</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [cljsrn/side-fx#185](https://travis-ci.org/cljsrn/side-fx/builds/430875838)<br>

#### <b style='color:green'>&#x2713; spec-tools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/spec-tools#139](https://travis-ci.org/chkup/spec-tools/builds/430875846)<br>

#### <b style='color:green'>&#x2713; specter</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [chkup/specter#139](https://travis-ci.org/chkup/specter/builds/430875890)<br>