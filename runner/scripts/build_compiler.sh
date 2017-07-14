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

# parametrization via environment
COMPILER_REV=${COMPILER_REV:-"master"} # https://git-scm.com/book/tr/v2/Git-Tools-Revision-Selection
COMPILER_REPO=${COMPILER_REPO:-"https://github.com/clojure/clojurescript.git"}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}
CLOJURESCRIPT_MAVEN_GROUP=${CLOJURESCRIPT_MAVEN_GROUP:-"org.clojure"}
CLOJURESCRIPT_MAVEN_ARTIFACT=${CLOJURESCRIPT_MAVEN_ARTIFACT:-"clojurescript"}
CANARY_JOB_COMMIT=${CANARY_JOB_COMMIT:-"jobs"}
CANARY_REPO_TOKEN=${CANARY_REPO_TOKEN}
TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}
LOCAL_MAVEN_REPO=${LOCAL_MAVEN_REPO:-`mvn help:evaluate -Dexpression=settings.localRepository | grep -v '[INFO]' | tr -d '\n'`}
CANARY_EXTRA_CURL_OPTS=${CANARY_EXTRA_CURL_OPTS:-"-sS"}
RESULT_DIR=${RESULT_DIR:-`pwd`}
POM_PATH=${POM_PATH:-"META-INF/maven/org.clojure/clojurescript/pom.xml"}

CANARY_JOB_COMMIT_URL="https://github.com/cljs-oss/canary/commit/${CANARY_JOB_COMMIT}"
COMPILER_REV_URL="${COMPILER_REPO/.git/\/commit}/${COMPILER_REV}"

echo "going to build $COMPILER_REV_URL"

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
git checkout ${GIT_VERBOSITY} "$COMPILER_REV"
git checkout ${GIT_VERBOSITY} -b canary-build

echo "Effective ClojureScript SHA to be built:"
git log -1 --pretty=format:"%C(magenta)%h%C(reset) | %C(yellow)%s%C(reset) | %C(blue)%an%C(reset) | %ad" --date=rfc
echo

BUILD_SHORT_REV=`git rev-parse --short HEAD`

# TODO: determine clojurescript version and check if release already exists

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

BUILD_ID="${BUILD_VERSION}-${BUILD_SHORT_REV}"

# patch JAR's maven version to our SHA-annotated version
echo "Patching ClojureScript JAR..."
jar -xf "$BUILD_JAR" "$POM_PATH"
mv "$POM_PATH" "$POM_PATH.orig"
cat "$POM_PATH.orig" | sed "s|<version>$BUILD_VERSION</version>|<version>$BUILD_ID</version>|g" > "$POM_PATH"
jar -uf "$BUILD_JAR" "$POM_PATH"

TRAVIS_BUILD_URL="https://travis-ci.org/cljs-oss/canary/builds/$TRAVIS_BUILD_ID"

if [[ -n "$TRAVIS_BUILD_ID" ]]; then
  TRAVIS_BUILD_INFO=" Travis log: $TRAVIS_BUILD_URL."
else
  TRAVIS_BUILD_INFO=""
fi

RELEASE_BODY=`cat <<MARKDOWN
A test build of ${COMPILER_REV_URL} via ${CANARY_JOB_COMMIT_URL}.
${TRAVIS_BUILD_INFO}
MARKDOWN
`

DATA=`cat <<JSON
{
  "tag_name": "r${BUILD_ID}",
  "target_commitish": "${CANARY_JOB_COMMIT}",
  "name": "ClojureScript ${BUILD_ID}",
  "body": "${RELEASE_BODY}",
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

RELEASE_RESPONSE=`curl ${CANARY_EXTRA_CURL_OPTS} \
                       -H "Content-Type: application/json" \
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
  GITHUB_RELEASE_ID="${BASH_REMATCH[1]}"
else
  echo "ERROR!"
  echo -e "Invalid upload_url returned from github api\n$RELEASE_RESPONSE"
  exit 5
fi

RAW_UPLOAD_URL="https://uploads.github.com/repos/cljs-oss/canary/releases/$GITHUB_RELEASE_ID/assets"
COMPLETE_UPLOAD_URL="$RAW_UPLOAD_URL?name=clojurescript-$BUILD_ID.jar"

UPLOAD_RESPONSE=`curl ${CANARY_EXTRA_CURL_OPTS} \
                      -H "Content-Type: application/java-archive" \
                      -H "Authorization: token $CANARY_REPO_TOKEN" \
                      -X POST \
                      --data-binary "@$BUILD_JAR" \
                      "$COMPLETE_UPLOAD_URL"`

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "GitHub API response:\n$UPLOAD_RESPONSE"
fi

set +e
BUILD_DOWNLOAD_URL=`json-val [\"browser_download_url\"] <<< "$UPLOAD_RESPONSE" | sed -e 's/^"//' -e 's/"$//'`
set -e

if [[ ! "$BUILD_DOWNLOAD_URL" =~ ^https://github\.com/cljs-oss/canary/releases/download.*$ ]]; then
  echo "ERROR!"
  echo -e "Invalid browser_download_url returned from github api\n$UPLOAD_RESPONSE"
  exit 6
fi

echo "Download URL: $BUILD_DOWNLOAD_URL"

RESULT_JAR_PATH="$RESULT_DIR/clojurescript-${BUILD_ID}.jar"
cp "$BUILD_JAR" "$RESULT_JAR_PATH"

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "Copied result jar into '$RESULT_JAR_PATH'"
fi

# we pass results to the caller by producing an edn file on agreed path in RESULT_DIR
RESULT=`cat <<EDN
{
  :build-id "${BUILD_ID}"
  :build-jar-path "${RESULT_JAR_PATH}"
  :build-download-url "${BUILD_DOWNLOAD_URL}"
  :github-release-id "${GITHUB_RELEASE_ID}"
  :canary-job-commit-url "${CANARY_JOB_COMMIT_URL}"
  :travis-job-url "${TRAVIS_BUILD_URL}"
}
EDN
`

RESULT_EDN_PATH="$RESULT_DIR/result.edn"
mkdir -p "$RESULT_DIR"
echo "$RESULT" > "$RESULT_EDN_PATH"

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "Generated result.edn at '$RESULT_JAR_PATH':"
  cat "$RESULT_EDN_PATH"
fi
