## Report for job #446

Job: **#446** | [jobs/14c64d6](https://github.com/cljs-oss/canary/commit/14c64d6c0b2becec1cd757b8a523a4cd6253b159) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/396381276).

Compiler: **ClojureScript 1.10.335-ef3a22d** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.335-ef3a22d) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.335-ef3a22d/clojurescript-1.10.335-ef3a22d.jar) | [source](https://github.com/clojure/clojurescript/commit/ef3a22d1f068ced3bddcfe37e8ab9821198ce107).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 1 / 1 (executed) of total 24 tasks.

Failed tasks: [fulcro](#-fulcro).

### Executed Tasks

#### <b style='color:red'>&#x2717; fulcro</b>
```
Exception: clojure.lang.ExceptionInfo: Travis build request was rejected. Your travis account might be banned.
{"message" "Build config file is required via repository settings, but config is empty.",
 "owner" {"@type" "organization", "@href" "/org/270909", "@representation" "minimal", "id" 270909, "login" "chkup"},
 "@href" "/repo/19845084/request/121503512",
 "branch_name" "master",
 "builds" [],
 "repository"
 {"@type" "repository",
  "@href" "/repo/19845084",
  "@representation" "minimal",
  "id" 19845084,
  "name" "fulcro",
  "slug" "chkup/fulcro"},
 "id" 121503512,
 "@representation" "standard",
 "event_type" "api",
 "commit"
 {"@type" "commit",
  "@representation" "minimal",
  "id" 118882601,
  "sha" "14a76c00d57eca008e350bcb06efc292aa1a8db4",
  "ref" nil,
  "message" "Canary test with ClojureScript 1.10.335-ef3a22d",
  "compare_url"
  "https://github.com/chkup/fulcro/compare/59b531ef04e000d60c726cadfb7cf0e512219b7e...14a76c00d57eca008e350bcb06efc292aa1a8db4",
  "committed_at" "2018-06-19T20:27:53Z"},
 "state" "configured",
 "created_at" "2018-06-25T12:58:48Z",
 "@type" "request",
 "result" "rejected"}
 {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:39)
	at canary.runner.utils$ex.doInvoke(utils.clj:36)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:140)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:132)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:198)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:189)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:229)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:226)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:244)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:239)
	at canary.projects.chkup$fulcro.invokeStatic(chkup.clj:8)
	at canary.projects.chkup$fulcro.invoke(chkup.clj:7)
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

### Disabled Tasks

&nbsp;&nbsp;&nbsp;&nbsp;**chromex** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-devtools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-oops** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cljs-zones** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**closurecomp** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**closurelib** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-1** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-2** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-3** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-4** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**coal-mine-5** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**cuerdas** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**env-config** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**garden** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**hoplon** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**om** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**planck** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**re-frame** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**reagent** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**side-fx** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**spec-tools** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**specter** - disabled because not matching --only or --include options<br>
&nbsp;&nbsp;&nbsp;&nbsp;**test-check** - disabled because not matching --only or --include options<br>