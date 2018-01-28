# Canary in a coal mine

This project provides a tool for exercising participating projects with a pinned bleeding-edge ClojureScript compiler version. 
The goal is to have some smoke tests which allow us to detect issues early before releasing a new ClojureScript version.

## How to Participate

If you are using Travis for CI, participating in Canary builds involves four simple steps:

1. Revise your `.travis.yml` to fetch the Canary-built ClojureScript JAR.

    ```
    before_install:
      - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash
    ```  

2. Configure your project's build so that it honors the `CANARY_CLOJURESCRIPT_VERSION` environment variable. If using Leiningen, this can be accomplished by revising your ClojureScript dependency in `project.clj` to look like:

    ```
    [org.clojure/clojurescript ~(or (System/getenv "CANARY_CLOJURESCRIPT_VERSION") "1.9.946")]
    ```

3. Set up Canary with a Travis access token. Replace `YOUR_PROJECT` with the name of your project and `deadbeef` below with your Travis [access token](https://blog.travis-ci.com/2013-01-28-token-token-token), which you can obtain by doing `gem install travis && travis login && travis token`. 

    ```
    git clone --branch jobs git@github.com:cljs-oss/canary.git
    cd canary
    travis encrypt CANARY_YOUR_PROJECT_TRAVIS_TOKEN=deadbeef --add env.global
    git add .travis.yml
    git commit -m "add CANARY_YOUR_PROJECT_TRAVIS_TOKEN [ci skip]"
    git push origin jobs
    ```

4. Add a Canary task to trigger CI builds of your project. This is done by adding a `^:task` to a namespace in the `master` branch under `runner/src/canary/projects`, like this (replacing `github-yourname`, `your-project` and `YOUR_PROJECT`):

    ```
    (ns canary.projects.github-yourname
      (:require [canary.runner.travis :as travis]))

    (defn ^:task your-project [options]
      (travis/request-build! "github-yourname/your-project" "CANARY_YOUR_PROJECT_TRAVIS_TOKEN" options))
    ```    


# More Details

Canary provides a script which can be used to run a job. Each job is assigned a ClojureScript compiler version. 
It builds compiler jar, uploads it and then runs exercises of individual projects in parallel (we call them tasks). 
Finally it waits for task results and generates a report for archiving.

Typically you don't run canary script on your local machine but rather invoke it on some machine in the cloud. 
For your convenience a new job can be triggered by committing an empty commit into the [jobs branch](https://github.com/cljs-oss/canary/tree/jobs).
Travis machine will then execute canary script possibly triggering more child Travis builds for individual project tasks.
At the end, results are generated and archived in the [results branch](https://github.com/cljs-oss/canary/tree/results).
Also look into [GitHub releases of this repo](https://github.com/cljs-oss/canary/releases) where individual built compiler versions get published.

## Quick test

### via docker

```bash
./scripts/docker-build.sh
./scripts/docker-run.sh help
./scripts/docker-run.sh list
./scripts/docker-run.sh job
```

### directly

```bash
./runner/run.sh job -v -r master
```

### Vocabulary

* the script is called `runner`
* ClojureScript compiler is usually simply referred to as the `compiler`
* a list of relevant projects/libraries is called `projects`
* a single request for a complete round of tests is called a `job`
* a single project test is called a `task`

## Main ideas

### A single repo

Instead of maintaining multiple git repos, let's have just a single mono-repo `canary` with following branches:

1. `master` where the source code for the `runner` lives
2. `jobs` where anyone with commit rights can trigger a new `job` (as a new commit)
3. `results` where the `runner` will produce one commit per `job`

All participating project authors will get commit access to this repo and can collaborate on the `master` branch.

### The job workflow

When a `job` is triggered. The `runner` goes through following steps:

1. prepares `compiler`'s jar according to requested parameters (repo/version)
1. determines which `tasks` should be part of the `job` based on request parameters
1. spawns all `tasks` (in parallel) instructing them to use the `compiler`
1. waits for `tasks` results and collects them 
1. generates a report and commits it in the `results` branch

### Implemented in Clojure

The `runner` is implemented in Clojure for convenience. Each `project` author gets own place (function/script)
for implementing functionality specific for their `project`. Authors are expected to trigger test builds on their own repos 
(e.g. via Travis) and simply collect results back. But anyone can use an escape hatch to invoke a shell script or do whatever 
they need in Clojure. For example cloning their repo and running tests directly in the context of the `runner`.

### Docker

We wrap `runner` in a Docker container to provide well-controlled environment for `tasks` (possibly shell scripts).

### No need for fancy publishing 

We are developers and we have git and GitHub which is a great publishing platform on its own. Travis alone will provide some trace 
of a `job` (depending on what `runner` script and individual `tasks` output to stdout). But ultimately a commit into `results` 
branch presents all interesting results also for archivation purposes. Then anyone can use their git-fu to follow those or 
process them further.

## FAQ

#### How to run a job?

Please read the readme in the [jobs branch](https://github.com/cljs-oss/canary/tree/jobs) with details on that.  

#### How to run a job with specific ClojureScript fork?

No problem. You can point Canary to your own fork of ClojureScript by specifying `--compiler-repo` and `--compiler-rev` parameters. 

#### Can you give me more details on how can I can participate with my project?

You will need to write a new task for your project. First look how existing [projects are implemented](https://github.com/cljs-oss/canary/tree/master/runner/src/canary/projects).
Ask for commit access. You can write your task as a Clojure function or as a shell script.

In case of a Clojure function you have to annotate it with `^:task` metadata so that runner recognizes it. In general
you can do whatever you need to do in your task (you can block, it is running on a separate thread) - this will depend on your project setup. 
To ease some common scenarios we provide some helper functions. For example `canary.runner.travis` namespace might be very useful for triggering 
a Travis build for your own project. 

In case of a shell script. You simply create `your_name.sh` in the projects directory. Script has to return with zero exit
code to be considered as passing. Standard outputs will be embedded into the final report, so don't be too verbose there.

You can test your task locally. Running jobs without `--production` flag should do no harm. When using `travis/request-build!` 
it will mock it by default. You will have to add `--production` as the last step for fine-tuning final version of the code.

#### How can I trigger Travis build of my project?

For inspiration [here](https://github.com/cljs-oss/canary/blob/master/runner/src/canary/projects/binaryage.clj) 
is the task for cljs-devtools, and [here](https://github.com/binaryage/cljs-devtools/commit/45c1df1e0de53c9d320963b296bd7a741056599c) 
is the adaptation needed in the project itself. Please note that child Travis build triggered by `travis/request-build!`
is configured with bunch of extra env variables prefixed with `CANARY_` - those have to be taken into account by
the participating project (an example [here](https://travis-ci.org/binaryage/cljs-devtools/jobs/254939442/config)). 
Also for us to be able to trigger builds of your Travis projects you will also have to provide a Travis 
API token for [triggering the builds on your behalf](https://docs.travis-ci.com/user/triggering-builds).

You should encrypt your token and commit it into `.travis.yml` in jobs branch (replace `YOUR_PROJECT` and `deadbeef`):

```
git clone --branch jobs git@github.com:cljs-oss/canary.git
cd canary
travis encrypt CANARY_YOUR_PROJECT_TRAVIS_TOKEN=deadbeef --add env.global
git add .travis.yml
git commit -m "add CANARY_YOUR_PROJECT_TRAVIS_TOKEN [ci skip]"
git push origin jobs
```

#### How can I trigger Circle CI build of my project?

You are on your own. We haven't implemented similar helpers as [for Travis](https://github.com/cljs-oss/canary/blob/master/runner/src/canary/runner/travis.clj) yet. 
Want to contribute them? That would be great.

---

### Credits

Inspired by ideas of [@deraen](https://gist.github.com/Deraen/f3b25fd459b6af134c0836cde36fb3fb) and [@mfikes](https://gist.github.com/mfikes/8be162fd730774e11990255345ee1127).

You might discuss this in #cljs-dev channel on [clojurians.net](http://clojurians.net) Slack.
