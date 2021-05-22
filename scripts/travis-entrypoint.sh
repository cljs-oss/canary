#!/usr/bin/env bash

set -e -o pipefail

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # this is here just for IntelliJ Bash support to understand our sourcing
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh" || true || source lib/travis.sh # this is here just for IntelliJ Bash support to understand our sourcing

TRAVIS=${TRAVIS}
TRAVIS_BUILD_NUMBER=${TRAVIS_BUILD_NUMBER:-?}
CANARY_DRY_RUN=${CANARY_DRY_RUN}
CANARY_OVERRIDE_JOB_ARGS=${CANARY_OVERRIDE_JOB_ARGS}

if [[ -z "$TRAVIS" ]]; then
  echo_err "travis-entrypoint.sh should be launched only in the context of travis CI"
  exit 77
fi

cd "$ROOT"

MASTER_SHORT_REV=$(git rev-parse --short HEAD)

echo "Canary git revision $MASTER_SHORT_REV at '$(pwd)'"

if [[ -z "$CANARY_OVERRIDE_JOB_ARGS" ]]; then
  JOB_ARGS=$(git show -s --format=%B "jobs" | head -n 1)
else
  JOB_ARGS="$CANARY_OVERRIDE_JOB_ARGS"
fi

# TODO: do some better sanitation of JOB_ARGS
if [[ ! ${JOB_ARGS} == job* ]]; then
  echo_err "The commit message to jobs must begin with 'job' and follow by job arguments."
  echo_err "I see a commit message '$JOB_ARGS'."
  echo_err "Consider using [ci skip] in the commit message next time."
  exit 1
fi

travis_fold start docker-build
echo "Building docker image"
./scripts/docker-build.sh
travis_fold end docker-build

PRODUCTION_FLAG="--production"
if [[ -n "$CANARY_DRY_RUN" ]]; then
  PRODUCTION_FLAG=
fi

exec ./scripts/docker-run.sh ${JOB_ARGS}\
 --job-id "$TRAVIS_BUILD_NUMBER"\
 ${PRODUCTION_FLAG}\
 --meta-job-args="$JOB_ARGS"\
 "$@"