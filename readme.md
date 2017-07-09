# Canary in a coal mine

This project provides a tool for invoking tests of selected open-source projects with a pinned ClojureScript compiler version.

The goal is to detect issues early before releasing new ClojureScript version.

## Quick test

### Via docker

```bash
./scripts/docker-build.sh
./scripts/docker-run.sh job -i 1.3.3.7
```

### directly

```bash
./runner/run.sh job -i 5.6.7.8
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
* list of relevant libraries is called `libraries`
* a single request for complete round of testing is called a `job` (or `canary job`)

## Main ideas

### single repo

Instead of maintaining multiple git repos, let's have just a single mono-repo `canary` with following branches:

1. `master` where the source code for the tool lives
2. `jobs` where anyone with commit rights can trigger a new job (as a new commit)
3. `results` where the tool will produce one commit per job

All collaborators will get write access to this repo and can collaborate on the `master` branch.

### job workflow

When a job is triggered. Runner goes through following steps:

1. prepares compiler's jar according to requested parameters (version)
2. runs tests for all `libraries` instructing them to use the `compiler` and collects results
3. commits resulting report into `results` branch 

### implemented in Clojure

The `runner` is implemented in Clojure for convenience. Each `library` author gets own place (function or namespace)
for implementing steps specific for their `library`. Authors are expected to trigger test builds on their own repos 
(e.g. via travis) and simply collect results back. But anyone can use an escape hatch to invoke shell and do whatever 
they want. For example cloning their repo and running tests directly in the context of `runner`.

### docker

We wrap running runner in a docker container to provide well-controlled environment for runner and possible shell scripts.

### no need for fancy publishing 

We are developers and we have github. Travis alone will provide some trace of a job (depending on what `runner` script will output to stdout)
but ultimately a commit into `results` branch will distil all interesting results. Then anyone can use their git-fu to follow
those or process them further.

## Technical notes

* we will (ab)use travis to run `runner` jobs for us, this travis will be setup on the `canary` repo and will be triggered
by commits in `jobs` branch (or alternatively via travis API)
* secrets like API tokens will be stored using [travis mechanism for hiding secrets](https://docs.travis-ci.com/user/environment-variables/#Defining-encrypted-variables-in-.travis.yml)
* in first iteration `results` will be simple textual report embedded in a commit message, maybe using [shields.io badges](http://shields.io) but later it could produce
whole tree of files committed into results branch for each job, git(hub) should be always a good interface for viewing/diffing it

---

You can discuss this in #cljs-dev channel on [clojurians.net](http://clojurians.net) Slack.
