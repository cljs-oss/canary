
## Canary jobs

Canary is responsible for smoke testing [participating ClojureScript projects](https://github.com/cljs-oss/canary/tree/master/runner/src/canary/projects) with a pinned ClojureScript version.
You can read more about Canary in the [master readme](https://github.com/cljs-oss/canary/tree/master).

You could run it locally, but that would be old-school. And frankly you would not have some secret tokens
needed for talking to GitHub and Travis APIs. Instead you can trigger Canary jobs by committing into this branch. We use git messages as  Travis will pick it up and execute your job. 
The commit can be empty and the message is [expected](https://github.com/cljs-oss/canary/blob/3a555f984f27dea52af2d756df28647af208b08d/scripts/travis-entrypoint.sh#L16) 
to contain command-line arguments you would normally use `job [arg1] [arg2] [...]`.

For example `job -r master` will run the job for bleeding-edge [ClojureScript master](https://github.com/clojure/clojurescript/tree/master).

To execute above command personally I would run this from command-line:

```bash
git clone --branch jobs git@github.com:cljs-oss/canary.git
cd canary
git commit --allow-empty -m "job -r master"
```

Please note that `--production` and `--job-id` parameters are not available to you. They are [forced by our launcher script](https://github.com/cljs-oss/canary/blob/3a555f984f27dea52af2d756df28647af208b08d/scripts/travis-entrypoint.sh#L31).

Each completed job should produce a report page with results. You can find archived reports in the [results branch](https://github.com/cljs-oss/canary/tree/results).

#### Available parameters

```text
> ./scripts/docker-run.sh help
(in /runner) $ lein run -- help
Exercises ClojureScript projects with a pinned ClojureScript version.

Usage: ./run.sh [action] [options]

Actions:
  job         Run a job with given options
  list        List available tasks (possibly matching filters from options)
  help        Print usage info

Options:
  -r, --compiler-rev REV          master                                        Pin ClojureScript compiler to specific revision
      --compiler-repo URL         https://github.com/clojure/clojurescript.git  Git repo to fetch compiler sources from
  -p, --projects DIR              src/canary/projects                           Path to projects directory
      --workdir DIR               .workdir                                      Path to working directory
      --cachedir DIR              .cachedir                                     Path to caching directory. Persists state between runs for speedup
      --only SUBSTR                                                             Enable tasks matching a substring (or any of space separated substrings)
      --except SUBSTR                                                           Disable tasks matching a substring (or any of space separated substrings)
      --include REGEX                                                           Enable tasks matching a regex
      --exclude REGEX                                                           Disable tasks matching a regex
      --job-id ID                 0                                             Optional job id
      --polling-interval SECONDS  300000                                        Polling interval for job status (in seconds)
      --timeout SECONDS           3600000                                       Total timeout for job to complete (in seconds)
      --production                                                              Will not commit into results branch
  -v                                                                            Verbosity level; may be specified multiple times
  -h, --help
```