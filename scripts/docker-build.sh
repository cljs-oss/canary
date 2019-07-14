#!/usr/bin/env bash

set -e -o pipefail

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

DOCKER_CACHE_FROM=${DOCKER_CACHE_FROM:-"$DOCKER_IMAGE_NAME:latest"}
TRAVIS_COMMIT=${TRAVIS_COMMIT:-"local"}

cd "$DOCKER_DIR"

exec docker build \
  --cache-from "$DOCKER_CACHE_FROM" \
  -t "$DOCKER_IMAGE_NAME:latest" \
  -t "$DOCKER_IMAGE_NAME:$TRAVIS_COMMIT" \
  .
