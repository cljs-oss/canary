#!/usr/bin/env bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh"
# never executes, this is here just for IntelliJ Bash support to understand our sourcing
false && source _config.sh
false && source lib/travis.sh

travis_fold start docker-load
echo "Load docker image from cache"

echo "  loading cache file: $DOCKER_CACHE_FILE"

if [[ ! -f "$DOCKER_CACHE_FILE" ]]; then
  echo "  cache file not found"
  travis_fold end docker-load
  exit 0
fi

echo "images before:"
docker images -a

#zcat "$DOCKER_CACHE_FILE" |
docker load -q -i "$DOCKER_CACHE_FILE"

echo "images after:"
docker images -a

travis_fold end docker-load
