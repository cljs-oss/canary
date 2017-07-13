#!/usr/bin/env bash

set -e -o pipefail

ANSI_CLEAR="\033[0K"

travis_fold() {
  local action=$1
  local name=$2
  echo -en "travis_fold:${action}:${name}\r${ANSI_CLEAR}"
}

function json-val () {
  python -c "import json,sys;sys.stdout.write(json.dumps(json.load(sys.stdin)$1))";
}

# expected environment
COMPILER_REV=${COMPILER_REV:-"master"} # https://git-scm.com/book/tr/v2/Git-Tools-Revision-Selection
COMPILER_REPO=${COMPILER_REPO:-"https://github.com/clojure/clojurescript.git"}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}
CLOJURESCRIPT_MAVEN_GROUP=${CLOJURESCRIPT_MAVEN_GROUP:-"org.clojure"}
CLOJURESCRIPT_MAVEN_ARTIFACT=${CLOJURESCRIPT_MAVEN_ARTIFACT:-"clojurescript"}
CANARY_JOB_COMMIT=${CANARY_JOB_COMMIT:-"jobs"}
CANARY_REPO_TOKEN=${CANARY_REPO_TOKEN}
TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}
LOCAL_MAVEN_REPO=${LOCAL_MAVEN_REPO:-`mvn help:evaluate -Dexpression=settings.localRepository | grep -v '[INFO]' | tr -d '\n'`}

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
# we have to fetch whole clojurescript repo, clojurescript's build script depends on it
# TODO: we probably want to setup sharing of git objects persisted by travis to speed this up
git fetch ${GIT_VERBOSITY} --tags origin
git checkout "$COMPILER_REV" -b canary-build

echo "Effective ClojureScript SHA to be built:"
git log -1 --pretty=format:"%C(magenta)%h%C(reset) | %C(yellow)%s%C(reset) | %C(blue)%an%C(reset) | %ad" --date=rfc
echo

SHORT_REV=`git rev-parse --short HEAD`

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

# purge clojurescript jars from maven, .m2 is cached by travis and that would lead to cache invalidation
rm -rf "$LOCAL_MAVEN_REPO/org/clojure/clojurescript"

BUILD_JAR=`ls -1 ./target/${CLOJURESCRIPT_MAVEN_ARTIFACT}-*.jar | grep -v aot`

if [[ -z "$BUILD_JAR" ]]; then
  echo "ERROR!"
  echo "ClojureScript JAR was not produced as clojurescript/target/clojurescript-<version>.jar"
  ls -l ./target
  exit 2
fi

if [[ "$BUILD_JAR" =~ ^.*clojurescript-(.*)\.jar$  ]]; then
  BUILD_VERSION="${BASH_REMATCH[1]}"
else
  echo "ERROR!"
  echo "Unable to determine clojurescript version from $BUILD_JAR"
  exit 3
fi

if [[ -n "$TRAVIS_BUILD_ID" ]]; then
  TRAVIS_BUILD_INFO=" Travis log: https://travis-ci.org/cljs-oss/canary/builds/$TRAVIS_BUILD_ID."
else
  TRAVIS_BUILD_INFO=""
fi

DATA=`cat <<JSON
{
  "tag_name": "r${BUILD_VERSION}-${SHORT_REV}",
  "target_commitish": "${CANARY_JOB_COMMIT}",
  "name": "ClojureScript ${BUILD_VERSION}-${SHORT_REV}",
  "body": "A test build of ${COMPILER_REPO/.git/\/commit}/${COMPILER_REV} via job https://github.com/cljs-oss/canary/commit/${CANARY_JOB_COMMIT}.\n${TRAVIS_BUILD_INFO}",
  "draft": false,
  "prerelease": true
}
JSON
`

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "Data for GitHub API https://developer.github.com/v3/repos/releases/#create-a-release\n$DATA"
fi

if [[ -z "$CANARY_REPO_TOKEN" ]]; then
  echo "expected non-empty CANARY_REPO_TOKEN env var => aborting"
  exit 4
fi

RELEASE_RESPONSE=`curl -H "Content-Type: application/json" \
                            -H "Authorization: token $CANARY_REPO_TOKEN" \
                            -X POST \
                            --data "$DATA" \
                            https://api.github.com/repos/cljs-oss/canary/releases`

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "GitHub API response:\n$RELEASE_RESPONSE"
fi

set +e
UPLOAD_URL=`json-val [\"upload_url\"] <<< "$RELEASE_RESPONSE" | sed -e 's/^"//' -e 's/"$//'`
set -e

if [[ "$UPLOAD_URL" =~ ^https://uploads\.github\.com/repos/cljs-oss/canary/releases/(.*)/assets.*$ ]]; then
  RELEASE_ID="${BASH_REMATCH[1]}"
else
  echo "ERROR!"
  echo -e "Invalid upload_url returned from github api\n$RELEASE_RESPONSE"
  exit 5
fi

RAW_UPLOAD_URL="https://uploads.github.com/repos/cljs-oss/canary/releases/$RELEASE_ID/assets"
COMPLETE_UPLOAD_URL="$RAW_UPLOAD_URL?name=clojurescript-$BUILD_VERSION-$SHORT_REV.jar"

UPLOAD_RESPONSE=`curl -H "Content-Type: application/java-archive" \
     -H "Authorization: token $CANARY_REPO_TOKEN" \
     -X POST \
     --data-binary "@$BUILD_JAR" \
     "$COMPLETE_UPLOAD_URL"`

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "GitHub API response:\n$UPLOAD_RESPONSE"
fi

set +e
BROWSER_DOWNLOAD_URL=`json-val [\"browser_download_url\"] <<< "$UPLOAD_RESPONSE" | sed -e 's/^"//' -e 's/"$//'`
set -e

if [[ ! "$BROWSER_DOWNLOAD_URL" =~ ^https://github\.com/cljs-oss/canary/releases/download.*$ ]]; then
  echo "ERROR!"
  echo -e "Invalid browser_download_url returned from github api\n$UPLOAD_RESPONSE"
  exit 6
fi

echo "$BROWSER_DOWNLOAD_URL"
