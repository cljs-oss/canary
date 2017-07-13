#!/usr/bin/env bash

set -e -o pipefail

ANSI_CLEAR="\033[0K"

travis_fold() {
  local action=$1
  local name=$2
  echo -en "travis_fold:${action}:${name}\r${ANSI_CLEAR}"
}

# expected environment
COMPILER_REV=${COMPILER_REV:-"master"} # https://git-scm.com/book/tr/v2/Git-Tools-Revision-Selection
COMPILER_REPO=${COMPILER_REPO:-"https://github.com/clojure/clojurescript.git"}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}

echo "going to build $COMPILER_REV from $COMPILER_REPO"

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  mvn --version
fi

GIT_VERBOSITY="--quiet"
if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  GIT_VERBOSITY=""
fi
if [[ "$CANARY_VERBOSITY" -gt 1 ]]; then
  GIT_VERBOSITY="--verbose"
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
git fetch ${GIT_VERBOSITY} --tags origin "$COMPILER_REV"
git checkout FETCH_HEAD -b canary-build

echo "Effective ClojureScript SHA to be built:"
git log -1 --pretty=format:"%C(magenta)%h%C(reset) | %C(yellow)%s%C(reset) | %C(blue)%an%C(reset) | %ad" --date=rfc
echo

if [[ "$CANARY_VERBOSITY" -eq 0 ]]; then
  export CLJS_SCRIPT_QUIET=1
  MAVEN_VERBOSITY="--quiet"
fi

export CLJS_SCRIPT_MVN_OPTS="--batch-mode $MAVEN_VERBOSITY"

travis_fold start clojurescript-build
echo "Building ClojureScript compiler..."

if [[ "$CANARY_VERBOSITY" -gt 2 ]]; then
  echo "Effective environment before compiler build:"
  env
fi

./script/build
travis_fold end clojurescript-build

pwd
