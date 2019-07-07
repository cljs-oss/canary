#!/usr/bin/env bash

set -e -o pipefail

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # this is here just for IntelliJ Bash support to understand our sourcing
source "$(dirname "${BASH_SOURCE[0]}")/lib/travis.sh" || true || source lib/travis.sh # this is here just for IntelliJ Bash support to understand our sourcing

travis_fold start docker-save
echo "Save docker image into cache"

if [[ ! -d "$DOCKER_CACHE_DIR" ]]; then
  mkdir -p "$DOCKER_CACHE_DIR"
fi

docker save "$DOCKER_IMAGE_NAME:latest" -o "$DOCKER_CACHE_FILE" # | gzip -2 > "$DOCKER_CACHE_FILE"

ls -l "$DOCKER_CACHE_FILE"

travis_fold end docker-save
