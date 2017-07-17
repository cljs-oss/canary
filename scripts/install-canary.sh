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
POM_PATH=${POM_PATH:-"META-INF/maven/org.clojure/clojurescript/pom.xml"}

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

# get the embedded pom.xml
unzip -q "$JAR_PATH" -d "$TEMP_WORK_DIR"
POM_LOCATION="$TEMP_WORK_DIR/$POM_PATH"

echo "Installing $CANARY_CLOJURESCRIPT_JAR_URL into local maven repo"

# note that recent version of maven install plugin support direct install respecting embedded pom
#   https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html
# but we cannot rely on this feature because travis machines could have older versions installed by default
mvn install:install-file \
    --batch-mode \
    --quiet \
    -Dfile="$JAR_PATH" \
    -DpomFile="$POM_LOCATION"
