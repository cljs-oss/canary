
## Canary jobs

Canary runner is responsible for exercising [participating ClojureScript projects](https://github.com/cljs-oss/canary/tree/master/runner/src/canary/projects) with a pinned ClojureScript version.

You could run it locally, but that would be too old-school. Instead you can trigger canary jobs by committing into this branch. Travis will pick it up and execute your job. The commit message is [expected](https://github.com/cljs-oss/canary/blob/3a555f984f27dea52af2d756df28647af208b08d/scripts/travis-entrypoint.sh#L16) to contain command-line arguments you would normally use `job [arg1] [arg2] [...]`.

For example `job -r master` will run the job for bleeding edge ClojureScript master.

Each completed job should produce a report page with results. You can find archived reports in the [results branch](https://github.com/cljs-oss/canary/tree/results).

#### Available parameters

```
> ./scripts/docker-run.sh job --help
(in /runner) $ lein run -- --help
Exercises ClojureScript libraries with pinned ClojureScript version.

Usage: ./run.sh job [options]

Options:
  -r, --compiler-rev REV          master                                        Pin ClojureScript compiler to specific revision
      --compiler-repo URL         https://github.com/clojure/clojurescript.git  Git repo to fetch compiler sources from
  -p, --projects DIR              src/canary/projects                           Path to projects directory
      --workdir DIR               .workdir                                      Path to working directory
      --only SUBSTR                                                             Run only tasks matching a substring
      --job-id ID                 test                                          Optional job id
      --polling-interval SECONDS  300000                                        Polling interval for job status (in seconds)
      --timeout SECONDS           3600000                                       Total timeout for job to complete (in seconds)
      --production                                                              Will not commit into results branch
  -t, --test                                                                    Do not launch any tasks. Useful for testing which task will be executed.
  -v                                                                            Verbosity level; may be specified multiple times
  -h, --help
  ```