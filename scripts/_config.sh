#!/usr/bin/env bash

# standard bash switches for our scripts
set -e -o pipefail

SPAWN_DIR=`pwd`
SPAWN_COMMAND="$0"
SPAWN_ARGS="$@"

pushd "$(dirname "${BASH_SOURCE[0]}")" > /dev/null

source "lib/utils.sh"

cd ..

ROOT=`pwd`
DOCKER_DIR="$ROOT/docker"
SCRIPTS_DIR="$ROOT/scripts"
RUNNER_DIR="$ROOT/runner"

DOCKER_VOLUME_ROOT="canary-data-root"
DOCKER_VOLUME_APT_CACHE="canary-data-apt-cache"
DOCKER_IMAGE_NAME="canary"
DOCKER_CONTAINER_NAME="canary-job"

popd
