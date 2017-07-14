#!/usr/bin/env bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # this is here just for IntelliJ Bash support to understand our sourcing
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh" || true || source lib/travis.sh # this is here just for IntelliJ Bash support to understand our sourcing

TRAVIS=${TRAVIS}
TRAVIS_BUILD_NUMBER=${TRAVIS_BUILD_NUMBER:-?}

if [[ -z "$TRAVIS" ]]; then
  echoerr "travis-entrypoint.sh should be launched only in the context of travis CI"
  exit 77
fi

pushd "$ROOT"

JOB_ARGS=$(git show -s --format=%B "jobs" | head -n 1)

# TODO: do some better sanitation of JOB_ARGS
if [[ ! ${JOB_ARGS} == job* ]]; then
  echoerr "The commit message to jobs must begin with 'job' and follow by job arguments."
  echoerr "I see a commit message '$JOB_ARGS'."
  echoerr "Consider using [ci skip] in the commit message next time."
  exit 1
fi

travis_fold start docker-build
echo "Building docker image"
./scripts/docker-build.sh
travis_fold end docker-build

./scripts/docker-run.sh ${JOB_ARGS} --job-id "$TRAVIS_BUILD_NUMBER" --production

popd
