#!/usr/bin/env bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # this is here just for IntelliJ Bash support to understand our sourcing
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh" || true || source lib/travis.sh # this is here just for IntelliJ Bash support to understand our sourcing

travis_fold start docker-load
function finish {
  travis_fold end docker-load
}
trap finish EXIT

echo "Load docker image from cache"

if [[ ! -f "$DOCKER_CACHE_FILE" ]]; then
  echo "  cache file not found"
  exit 0
fi

echo "images before:"
docker images -a

echo "  loading cache file: $DOCKER_CACHE_FILE"
docker load -q -i "$DOCKER_CACHE_FILE"

echo "images after:"
docker images -a
