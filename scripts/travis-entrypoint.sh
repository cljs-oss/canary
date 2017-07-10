#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

TRAVIS=${TRAVIS}
TRAVIS_BUILD_NUMBER=${TRAVIS_BUILD_NUMBER:-?}

if [[ -z "$TRAVIS" ]]; then
  echoerr "travis-entrypoint.sh should be launched only in the context of travis CI"
  exit 77
fi

pushd "$ROOT"

JOB_ARGS=$(git show -s --format=%B "jobs" | head -n 1)

# TODO: do some better sanitization of JOB_ARGS
if [[ ! ${JOB_ARGS} == job* ]]; then
  echoerr "The commit message to jobs must begin with 'job' and follow by job arguments."
  echoerr "I see a commit message '$JOB_ARGS'."
  exit 1
fi

./scripts/docker-build.sh

./scripts/docker-run.sh ${JOB_ARGS} --job-id "$TRAVIS_BUILD_NUMBER" --production

popd
