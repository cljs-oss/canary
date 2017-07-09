#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

pushd "$DOCKER_DIR"

docker volume create --name "$DOCKER_VOLUME_ROOT" > /dev/null
docker volume create --name "$DOCKER_VOLUME_APT_CACHE" > /dev/null

docker run \
  --name "$DOCKER_CONTAINER_NAME" \
  -v "$DOCKER_VOLUME_ROOT:/root" \
  -v "$DOCKER_VOLUME_APT_CACHE:/var/cache/apt" \
  -v "$RUNNER_DIR:/runner" \
  --rm \
  -it "$DOCKER_IMAGE_NAME" \
  "$@"

popd
