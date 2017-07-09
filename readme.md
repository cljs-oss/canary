# Canary in a coal mine

This project provides a tool for invoking tests of selected open-source projects with a pinned ClojureScript compiler version.

The goal is to detect issues early before releasing new ClojureScript version.

## Quick test

### Via docker

```bash
./scripts/docker-build.sh
./scripts/docker-run.sh job -c HEAD -v
```

### directly

```bash
./runner/run.sh job -v
```
    
### travis entry point

```bash
./scripts/travis-entrypoint.sh
```

## Proposal

This is just a proposal. Inspired by ideas of [@deraen](https://gist.github.com/Deraen/f3b25fd459b6af134c0836cde36fb3fb) and [@mfikes](https://gist.github.com/mfikes/8be162fd730774e11990255345ee1127).

## Vocabulary

* this repo is called `canary`, the tool is caller `runner` (or `canary runner`)
* ClojureScript compiler is simply referred to as `compiler`
* list of relevant projects/libraries is called `projects`
* a single request for complete round of tests is called a `job` (or `canary job`)
* a single test is called a `task`

## Main ideas

### single repo

Instead of maintaining multiple git repos, let's have just a single mono-repo `canary` with following branches:

1. `master` where the source code for the `runner` lives
2. `jobs` where anyone with commit rights can trigger a new `job` (as a new commit)
3. `results` where the `runner` will produce one commit per `job`

All project authors will get commit access to this repo and can collaborate on the `master` branch.

### job workflow

When a `job` is triggered. The `runner` goes through following steps:

1. prepares `compiler`'s jar according to requested parameters (version/git SHA)
1. determines which tasks should be part of the job based on request parameters
1. spawns all tasks (in parallel) instructing them to use the `compiler`
1. waits for task results and collects them 
1. commits resulting report into `results` branch 

### implemented in Clojure

The `runner` is implemented in Clojure for convenience. Each `project` author gets own place (function or namespace)
for implementing functionality specific for their `project`. Authors are expected to trigger test builds on their own repos 
(e.g. via travis) and simply collect results back. But anyone can use an escape hatch to invoke shell and do whatever 
they need. For example cloning their repo and running tests directly in the context of `runner`.

### docker

We wrap `runner` in a docker container to provide well-controlled environment for `runner` `tasks` (possibly shell scripts).

### no need for fancy publishing 

We are developers and we have github. Travis alone will provide some trace of a `job` (depending on what `runner` script and 
individual `tasks` will output to stdout). But ultimately a commit into `results` branch will distil all interesting results
also for archivation purposes. Then anyone can use their git-fu to follow those or process them further.

## Notes

* we will (ab)use travis to run `runner` `jobs` for us, this travis will be setup on the `canary` repo and will be triggered
by commits in `jobs` branch (or alternatively via travis API)
* secrets like API tokens will be stored using [travis mechanism for hiding secrets](https://docs.travis-ci.com/user/environment-variables/#Defining-encrypted-variables-in-.travis.yml)
* in first iteration `results` will be simple textual report embedded in a commit message, maybe using [shields.io badges](http://shields.io) but later it could produce
whole tree of files committed into results branch for each job, git(hub) should be always a good interface for viewing/diffing it
* tasks should be spawned in parallel, also timing should be provided on runner's level

---

You might discuss this in #cljs-dev channel on [clojurians.net](http://clojurians.net) Slack.
