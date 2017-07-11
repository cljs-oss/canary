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

DOCKER_IMAGE_NAME=${DOCKER_IMAGE_NAME:-"canary"}
DOCKER_CONTAINER_NAME=${DOCKER_CONTAINER_NAME:-"canary-job"}
DOCKER_VOLUMES_DIR=${DOCKER_VOLUMES_DIR:-"$ROOT/.docker-volumes"}
DOCKER_CACHE_DIR=${DOCKER_CACHE_DIR:-"$ROOT/.docker-cache"}
DOCKER_CACHE_FILE="$DOCKER_CACHE_DIR/$DOCKER_IMAGE_NAME.save"

popd
