#!/usr/bin/env bash

# a simple wrapper for lein run

set -e -o pipefail

echo_cmd() {
  echo "(in $(pwd)) $ $@"
  "$@"
}

# ---------------------------------------------------------------------------------------------------------------------------

cd "$(dirname "${BASH_SOURCE[0]}")"

if [[ "$1" == "overview" || "$1" == "help" ]]; then
  echo_cmd lein run -- "$@"
  exit $?
fi

if [ $# -eq 0 ]; then
  echo "no arguments provided"
  echo "please provide a command to run, e.g."
  echo "  launch './run.sh overview'"
  exit 1
else
  echo "(in $(pwd)) [exec raw command] $ $@"
  exec "$@"
fi
