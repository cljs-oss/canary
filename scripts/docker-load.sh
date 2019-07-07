#!/usr/bin/env bash

set -e -o pipefail

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # this is here just for IntelliJ Bash support to understand our sourcing
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh" || true || source lib/travis.sh # this is here just for IntelliJ Bash support to understand our sourcing

travis_fold start docker-load
echo "Load canary docker image from cache"

function finish {
  travis_fold end docker-load
}
trap finish EXIT

if [[ ! -f "$DOCKER_CACHE_FILE" ]]; then
  echo "Canary docker cache file not found"
  exit 0
fi

echo "Docker images before:"
docker images -a

echo "Loading cache file: $DOCKER_CACHE_FILE"
docker load -q -i "$DOCKER_CACHE_FILE"

echo "Docker images after:"
docker images -a
