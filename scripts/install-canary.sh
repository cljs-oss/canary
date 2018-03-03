#!/usr/bin/env bash

# This script should download & install Canary's ClojureScript build into local Maven repo based on environment.
#
# For example you can call it in your .travis.yml in:
#
#   before_install
#   - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash

set -e -o pipefail

CANARY_BUILD=${CANARY_BUILD}
CANARY_CLOJURESCRIPT_JAR_URL=${CANARY_CLOJURESCRIPT_JAR_URL}

echo_err() {
  printf "\e[31m%s\e[0m\n" "$*" >&2;
}

if [[ -z "$CANARY_BUILD" ]]; then
  # Canary is not present in the environment, stay silent and do nothing
  exit 0
fi

if [[ -z "$CANARY_CLOJURESCRIPT_JAR_URL" ]]; then
  echo_err "CANARY_CLOJURESCRIPT_JAR_URL env var must be specified with CANARY_BUILD"
  echo_err "Please review your Canary setup and see https://github.com/cljs-oss/canary/blob/master/scripts/install-canary.sh"
  exit 1
fi

echo "Installing Canary support"

JAR_PATH=`mktemp`
TEMP_WORK_DIR=`mktemp -d`

function finish {
  rm "$JAR_PATH"
  rm -rf "$TEMP_WORK_DIR"
}
trap finish EXIT

echo "Downloading $CANARY_CLOJURESCRIPT_JAR_URL"
curl -sSL -o "$JAR_PATH" "$CANARY_CLOJURESCRIPT_JAR_URL"

echo "Installing $CANARY_CLOJURESCRIPT_JAR_URL into local maven repo"

mvn install:install-file \
    --batch-mode \
    --quiet \
    -Dfile="$JAR_PATH" \
    -DgroupId=org.clojure \
    -DartifactId=clojurescript \
    -Dversion="$CANARY_CLOJURESCRIPT_VERSION" \
    -Dpackaging=jar
