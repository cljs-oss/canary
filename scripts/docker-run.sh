#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

pushd "$DOCKER_DIR"

mkdir -p "$DOCKER_VOLUMES_DIR/var/cache"
mkdir -p "$DOCKER_VOLUMES_DIR/root/.m2"

docker run \
  --name "$DOCKER_CONTAINER_NAME" \
  -v "$DOCKER_VOLUMES_DIR/root/.m2:/root/.m2" \
  -v "$DOCKER_VOLUMES_DIR/var/cache:/var/cache" \
  -v "$RUNNER_DIR:/runner" \
  --rm \
  -it "$DOCKER_IMAGE_NAME" \
  "$@"

popd
