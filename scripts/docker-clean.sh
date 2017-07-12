#!/usr/bin/env bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh" || true || source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

pushd "$DOCKER_DIR"

set +e

rm -rf "$DOCKER_VOLUMES_DIR"

docker rmi -f "$DOCKER_IMAGE_NAME"

set -e

popd
