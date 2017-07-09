#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

pushd "$DOCKER_DIR"

set +e

docker volume rm -f "$DOCKER_VOLUME_ROOT"
docker volume rm -f "$DOCKER_VOLUME_APT_CACHE"
docker rmi -f "$DOCKER_IMAGE_NAME"

set -e

popd
