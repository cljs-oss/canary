#!/usr/bin/env bash

pushd () {
    command pushd "$@" > /dev/null
}

popd () {
    command popd "$@" > /dev/null
}

portable_realpath() {
  case "$OSTYPE" in
    darwin*)
      if [ -z "$(which grealpath)" ]; then
        echo "grealpath needed under OSX, please \`brew install coreutils\`"
        exit 1
      fi
      grealpath "$@" ;;
    *)
      realpath "$@" ;;
  esac
}

echoerr() {
  printf "\e[31m%s\e[0m\n" "$*" >&2;
}
