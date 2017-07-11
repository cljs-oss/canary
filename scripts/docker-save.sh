#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh"
# never executes, this is here just for IntelliJ Bash support to understand our sourcing
false && source _config.sh
false && source lib/travis.sh

travis_fold start docker-save
echo "Save docker image into cache"

if [[ ! -d "$DOCKER_CACHE_DIR" ]]; then
  mkdir -p "$DOCKER_CACHE_DIR"
fi

docker save "$DOCKER_IMAGE_NAME:latest" -o "$DOCKER_CACHE_FILE" # | gzip -2 > "$DOCKER_CACHE_FILE"

ls -l "$DOCKER_CACHE_FILE"

travis_fold end docker-save
