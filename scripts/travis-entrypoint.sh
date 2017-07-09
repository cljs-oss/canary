#!/bin/bash

source "$(dirname "${BASH_SOURCE[0]}")/_config.sh"
false && source _config.sh # never executes, this is here just for IntelliJ Bash support to understand our sourcing

pushd "$ROOT"

./scripts/docker-build.sh

# TODO: extract CLOJURESCRIPT_VERSION from env, url args or git commit message
# TODO: extract additional args for the job

CLOJURESCRIPT_VERSION=${CLOJURESCRIPT_VERSION:-1.2.3}

./scripts/docker-run.sh job -i "$CLOJURESCRIPT_VERSION"

popd
