#!/usr/bin/env bash

# this script should download & install canary's clojurescript build into local maven repo based on environment
# for example you can call it in your .travis.yml in before_install
# - curl -sSL https://raw.githubusercontent.com/cljs-oss/canary/master/scripts/install-canary.sh | bash

set -e -o pipefail

CANARY_BUILD=${CANARY_BUILD}
CANARY_CLOJURESCRIPT_JAR_URL=${CANARY_CLOJURESCRIPT_JAR_URL}
POM_PATH=${POM_PATH:-"META-INF/maven/org.clojure/clojurescript/pom.xml"}

if [[ -z "$CANARY_BUILD" ]]; then
  # CANARY is not present in environment
  exit 0
fi

ANSI_CLEAR="\033[0K"

travis_fold() {
  local action=$1
  local name=$2
  echo -en "travis_fold:${action}:${name}\r${ANSI_CLEAR}"
}

travis_fold start canary-support
echo "Installing Canary support"

JAR_PATH=`mktemp`
TEMP_WORK_DIR=`mktemp -d`

function finish {
  rm "$JAR_PATH"
  rm -rf "$TEMP_WORK_DIR"
  travis_fold end canary-support
}
trap finish EXIT

echo "Downloading $CANARY_CLOJURESCRIPT_JAR_URL"
curl -sSL -o "$JAR_PATH" "$CANARY_CLOJURESCRIPT_JAR_URL"

unzip -q "$JAR_PATH" -d "$TEMP_WORK_DIR"

POM_LOCATION="$TEMP_WORK_DIR/$POM_PATH"

echo "Installing $CANARY_CLOJURESCRIPT_JAR_URL into local maven repo"
mvn install:install-file \
    --batch-mode \
    --quiet \
    -Dfile="$JAR_PATH" \
    -DpomFile="$POM_LOCATION"
