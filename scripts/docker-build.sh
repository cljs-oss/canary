#!/usr/bin/env bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

DOCKER_CACHE_FROM=${DOCKER_CACHE_FROM:-"$DOCKER_IMAGE_NAME:latest"}
TRAVIS_COMMIT=${TRAVIS_COMMIT:-"local"}

pushd "$DOCKER_DIR"

docker build \
  --cache-from "$DOCKER_CACHE_FROM" \
  -t "$DOCKER_IMAGE_NAME:latest" \
  -t "$DOCKER_IMAGE_NAME:$TRAVIS_COMMIT" \
  .

popd
