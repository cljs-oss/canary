#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

pushd "$DOCKER_DIR"

docker build -t "$DOCKER_IMAGE_NAME" .

popd
