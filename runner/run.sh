#!/usr/bin/env bash

# a simple wrapper for lein run
# this is the entry-point of our docker container, see docker/Dockerfile
# this also can be called directly during development

set -e -o pipefail

echo_cmd() {
  echo "(in $(pwd)) $ $@"
  "$@"
}

# ---------------------------------------------------------------------------------------------------------------------------

cd "$(dirname "${BASH_SOURCE[0]}")"

if [ "$1" = "job" ]; then
  echo_cmd lein run -- ${@:2}
  exit $?
fi

if [ $# -eq 0 ]; then
  echo "no arguments provided"
  echo "please provide a command to run, e.g."
  echo "  launch './run.sh job'"
  exit 1
else
  echo "(in $(pwd)) [exec raw command] $ $@"
  exec "$@"
fi
