#!/usr/bin/env bash

set -e -o pipefail

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

TRAVIS_COMMIT=${TRAVIS_COMMIT:-"jobs"}
TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}

cd "$DOCKER_DIR"

mkdir -p "$DOCKER_VOLUMES_DIR/var/cache"
mkdir -p "$DOCKER_VOLUMES_DIR/root/.m2"

# generate list of inherited env vars
env | grep "^CANARY_" > "$DOCKER_ENV_FILE" || :

exec docker run \
  --name "$DOCKER_CONTAINER_NAME" \
  --env-file "$DOCKER_ENV_FILE" \
  -e "CANARY_JOB_COMMIT=$TRAVIS_COMMIT" \
  -e "TRAVIS_BUILD_ID=$TRAVIS_BUILD_ID" \
  -v "$DOCKER_VOLUMES_DIR/root/.m2:/root/.m2" \
  -v "$DOCKER_VOLUMES_DIR/var/cache:/var/cache" \
  -v "$RUNNER_DIR:/canary/runner" \
  -v "$RGEN_DIR:/canary/rgen" \
  --rm \
  -it "$DOCKER_IMAGE_NAME" \
  "$@"