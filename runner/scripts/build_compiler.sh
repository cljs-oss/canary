#!/usr/bin/env bash

set -e -o pipefail

# expected environment
COMPILER_REV=${COMPILER_REV:-"master"} # https://git-scm.com/book/tr/v2/Git-Tools-Revision-Selection
COMPILER_REPO=${COMPILER_REPO:-"https://github.com/clojure/clojurescript.git"}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}

echo "going to build $COMPILER_REV from $COMPILER_REPO"

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  mvn --version
fi

# cwd should already be in a temporary folder, see build.clj
# but we create another working subdir just for convenience when launching this directly

if [[ -d .compiler-build ]]; then
  rm -rf .compiler-build
fi
mkdir .compiler-build
cd .compiler-build

mkdir clojurescript
cd clojurescript
git init
git remote add origin "$COMPILER_REPO"
# unfortunately we have to fetch whole clojurescript repo, build script depends on it
# TODO: we probably want to setup sharing of git objects persisted by travis to speed this up
git fetch --tags origin "$COMPILER_REV"
git checkout FETCH_HEAD -b canary-build

git log -1 --pretty=oneline

# we want to silence maven output in clojurescript build unless invoker wants us go extra verbose
export MAVEN_OPTS="-Dorg.slf4j.simpleLogger.defaultLogLevel=warn -Dorg.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn"
if [[ "$CANARY_VERBOSITY" -gt 1 ]]; then
  export MAVEN_OPTS=-Dorg.slf4j.simpleLogger.defaultLogLevel=info
fi
if [[ "$CANARY_VERBOSITY" -gt 2 ]]; then
  export MAVEN_OPTS=-Dorg.slf4j.simpleLogger.defaultLogLevel=debug
fi

if [[ "$CANARY_VERBOSITY" -gt 2 ]]; then
  echo "effective environment before compiler build:"
  env
fi

./script/build

pwd
