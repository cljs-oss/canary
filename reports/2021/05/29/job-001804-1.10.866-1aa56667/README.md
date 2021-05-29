## Report for job #1804
```
job
```


Job: **#1804** | [jobs/01dbfdf](https://github.com/cljs-oss/canary/commit/01dbfdfe3ff5c0860ae4ec6b1b69c56ac930b8bc) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.com/cljs-oss/canary/builds/227361497).

Compiler: **ClojureScript 1.10.866-1aa56667** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.866-1aa56667) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.866-1aa56667/clojurescript-1.10.866-1aa56667.jar) | [source](https://github.com/clojure/clojurescript/commit/1aa56667620198eee5b42a36e36691d514d47c9b).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 15 / 19 (executed) of total 19 tasks.

Failed tasks: [clara-rules](#-clara-rules) | [cljs-bean](#-cljs-bean) | [cljs-time](#-cljs-time) | [coal-mine](#-coal-mine) | [core-async](#-core-async) | [core-logic](#-core-logic) | [core-match](#-core-match) | [core-rrb-vector](#-core-rrb-vector) | [garden](#-garden) | [ilk](#-ilk) | [om](#-om) | [planck](#-planck) | [side-fx](#-side-fx) | [spec-tools](#-spec-tools) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; clara-rules</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$clara_rules.invokeStatic(chkup.clj:5)
	at canary.projects.chkup$clara_rules.invoke(chkup.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; cljs-bean</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.mfikes$cljs_bean.invokeStatic(mfikes.clj:28)
	at canary.projects.mfikes$cljs_bean.invoke(mfikes.clj:27)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; cljs-time</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$cljs_time.invokeStatic(chkup.clj:32)
	at canary.projects.chkup$cljs_time.invoke(chkup.clj:31)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; coal-mine</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.mfikes$coal_mine.invokeStatic(mfikes.clj:11)
	at canary.projects.mfikes$coal_mine.invoke(mfikes.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-async</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_async.invokeStatic(chkup.clj:20)
	at canary.projects.chkup$core_async.invoke(chkup.clj:19)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-logic</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_logic.invokeStatic(chkup.clj:29)
	at canary.projects.chkup$core_logic.invoke(chkup.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-match</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_match.invokeStatic(chkup.clj:26)
	at canary.projects.chkup$core_match.invoke(chkup.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; core-rrb-vector</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$core_rrb_vector.invokeStatic(chkup.clj:23)
	at canary.projects.chkup$core_rrb_vector.invoke(chkup.clj:22)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; garden</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$garden.invokeStatic(chkup.clj:8)
	at canary.projects.chkup$garden.invoke(chkup.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; ilk</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.mfikes$ilk.invokeStatic(mfikes.clj:25)
	at canary.projects.mfikes$ilk.invoke(mfikes.clj:24)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; om</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$om.invokeStatic(chkup.clj:11)
	at canary.projects.chkup$om.invoke(chkup.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; planck</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.planck_repl$planck.invokeStatic(planck_repl.clj:7)
	at canary.projects.planck_repl$planck.invoke(planck_repl.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; side-fx</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.cljsrn$side_fx.invokeStatic(cljsrn.clj:5)
	at canary.projects.cljsrn$side_fx.invoke(cljsrn.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; spec-tools</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$spec_tools.invokeStatic(chkup.clj:14)
	at canary.projects.chkup$spec_tools.invoke(chkup.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:red'>&#x2717; test-check</b>
```
Exception: clojure.lang.ExceptionInfo: Travis API responded with invalid JSON: JSON error (unexpected character): a
access denied {}
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
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:234)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:233)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:251)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:246)
	at canary.projects.chkup$test_check.invokeStatic(chkup.clj:17)
	at canary.projects.chkup$test_check.invoke(chkup.clj:16)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__11184.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__11017.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#2550](https://travis-ci.com/binaryage/chromex/builds/227361566)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1964](https://travis-ci.com/binaryage/cljs-devtools/builds/227361567)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#1835](https://travis-ci.com/binaryage/cljs-oops/builds/227361568)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#1460](https://travis-ci.com/binaryage/cljs-zones/builds/227361569)<br>