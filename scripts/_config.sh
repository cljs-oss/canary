#!/usr/bin/env bash

SPAWN_DIR=$(pwd -P)
SPAWN_COMMAND="$0"
SPAWN_ARGS="$@"

pushd "$(dirname "${BASH_SOURCE[0]}")" > /dev/null || exit 13

source "lib/utils.sh"

cd .. || exit 13

ROOT=$(pwd -P)
DOCKER_DIR="$ROOT/docker"
SCRIPTS_DIR="$ROOT/scripts"
RUNNER_DIR="$ROOT/runner"
RGEN_DIR="$ROOT/rgen"

DOCKER_IMAGE_NAME=${DOCKER_IMAGE_NAME:-"canary"}
DOCKER_CONTAINER_NAME=${DOCKER_CONTAINER_NAME:-"canary-job"}
DOCKER_VOLUMES_DIR=${DOCKER_VOLUMES_DIR:-"$ROOT/.docker-volumes"}
DOCKER_CACHE_DIR=${DOCKER_CACHE_DIR:-"$ROOT/.docker-cache"}
DOCKER_CACHE_FILE="$DOCKER_CACHE_DIR/$DOCKER_IMAGE_NAME.save"
DOCKER_ENV_FILE="$DOCKER_DIR/.inherited-env-with-secrets"

popd || exit 13
