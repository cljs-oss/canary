#!/usr/bin/env bash

pushd () {
    command pushd "$@" > /dev/null
}

popd () {
    command popd "$@" > /dev/null
}

echoerr() {
  printf "\e[31m%s\e[0m\n" "$*" >&2;
}
