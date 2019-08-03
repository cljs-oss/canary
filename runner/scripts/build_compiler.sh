#!/usr/bin/env bash

set -e -o pipefail

# -- parameters -------------------------------------------------------------------------------------------------------------

CANARY_COMPILER_REV=${CANARY_COMPILER_REV:-"master"} # https://git-scm.com/book/tr/v2/Git-Tools-Revision-Selection
CANARY_COMPILER_REPO=${CANARY_COMPILER_REPO:-"https://github.com/clojure/clojurescript.git"}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}
CLOJURESCRIPT_MAVEN_GROUP=${CLOJURESCRIPT_MAVEN_GROUP:-"org.clojure"}
CLOJURESCRIPT_MAVEN_ARTIFACT=${CLOJURESCRIPT_MAVEN_ARTIFACT:-"clojurescript"}
CANARY_JOB_COMMIT=${CANARY_JOB_COMMIT:-"jobs"}
CANARY_REPO_TOKEN=${CANARY_REPO_TOKEN}
TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}
CANARY_EXTRA_CURL_OPTS=${CANARY_EXTRA_CURL_OPTS:-"-sS"}
CANARY_RESULT_DIR=${CANARY_RESULT_DIR:-$(pwd -P)}
POM_PATH=${POM_PATH:-"META-INF/maven/org.clojure/clojurescript/pom.xml"}
CANARY_PRODUCTION=${CANARY_PRODUCTION}
CANARY_CACHE_DIR=${CANARY_CACHE_DIR:-"$(pwd -P)/.cache"}
OFFICIAL_COMPILER_REPO=${OFFICIAL_COMPILER_REPO:-"https://github.com/clojure/clojurescript.git"}
CLOJURESCRIPT_MAJOR=${CLOJURESCRIPT_MAJOR:-1}
CLOJURESCRIPT_MINOR=${CLOJURESCRIPT_MINOR:-10}
CLOJURESCRIPT_REVISION_REGEX=${CLOJURESCRIPT_REVISION_REGEX:-"v[0-9]*\.[0-9]*-([0-9]*)-.*"}
CANARY_REPO=${CANARY_REPO:-cljs-oss/canary}

CANARY_JOB_COMMIT_URL="https://github.com/${CANARY_REPO}/commit/${CANARY_JOB_COMMIT}"

# -- functions --------------------------------------------------------------------------------------------------------------

ANSI_CLEAR="\033[0K"

travis_fold() {
  local action=$1
  local name=$2
  echo -en "travis_fold:${action}:${name}\r${ANSI_CLEAR}"
}

json_val() {
  jq --raw-output "$@"
}

string_encode() {
  local content=$1
  # see https://stackoverflow.com/a/38283242/84283
  content=${content//'"'/'\"'}
  content=${content//$'\n'/'\n'}
  echo "$content"
}

pushd() {
    command pushd "$@" > /dev/null
}

popd() {
    command popd > /dev/null
}

get_local_maven_repo() {
  # see https://stackoverflow.com/a/51235328/84283
  mvn help:evaluate -Dexpression=settings.localRepository -q -DforceStdout
}

# -- verbosity --------------------------------------------------------------------------------------------------------------

if [[ "$CANARY_VERBOSITY" -gt 1 ]]; then
  printf "effective settings:\n\n"
  # https://unix.stackexchange.com/a/5691/188074
  comm -3 <(declare | sort) <(declare -f | sort)
fi

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

# -- compiler checkout ------------------------------------------------------------------------------------------------------

# cwd should already be in a temporary folder, see build.clj
# but we create another working subdir just for convenience when launching this directly

if [[ -d .compiler-build ]]; then
  rm -rf .compiler-build
fi
mkdir .compiler-build
cd .compiler-build

# prepare git cache if it does not exist already
GIT_REPO_CACHE_NAME="cached-clojurescript-repo"
GIT_REPO_CACHE_DIR="$CANARY_CACHE_DIR/$GIT_REPO_CACHE_NAME"

if [[ ! -d "$GIT_REPO_CACHE_DIR" ]]; then
  echo "Shared git cache repo for compiler does not exist => creating it"
  mkdir -p "$CANARY_CACHE_DIR"
  pushd "$CANARY_CACHE_DIR"
  # we have to fetch whole clojurescript repo, clojurescript's build script depends on tags
  git clone --mirror ${GIT_VERBOSITY} "$OFFICIAL_COMPILER_REPO" "$GIT_REPO_CACHE_NAME"
  popd
else
  echo "Update shared git cache repo for compiler"
  pushd "$GIT_REPO_CACHE_DIR"
  git fetch --tags ${GIT_VERBOSITY}
  popd
fi

git clone ${GIT_VERBOSITY} --reference "$GIT_REPO_CACHE_DIR" "$CANARY_COMPILER_REPO" clojurescript
cd clojurescript
git checkout "$CANARY_COMPILER_REV"
git checkout -b canary-build

# -- compiler build ---------------------------------------------------------------------------------------------------------

BUILD_SHORT_REV=$(git rev-parse --short HEAD)
BUILD_REV=$(git rev-parse HEAD)

BUILD_SHORT_REV_INDENT=$(printf "%${#BUILD_SHORT_REV}s") # short rev can have different length depending on short sha collisions
echo "Effective ClojureScript compiler SHA to be built:"
git log -1 --pretty=format:"%C(magenta)%h%C(reset) | %C(yellow)%s%C(reset)%n$BUILD_SHORT_REV_INDENT └ %C(blue)%an%C(reset) | %ad" --date=rfc --color=always
echo

COMPILER_REV_URL="${CANARY_COMPILER_REPO/.git//commit}/${BUILD_REV}"

# to be robust we need to iterate CLOJURESCRIPT_MINOR down to 1 and try to extract first available GIT_CLOJURESCRIPT_REVISION
# this is required because we support --compiler-repo and --compiler-rev command-line options and those can point to older
# clojurescript repo version where latest CLOJURESCRIPT_MINOR tags are not present

CLOJURESCRIPT_REVISION=""
CLOJURESCRIPT_REVISION_PART=""
while [[ "$CLOJURESCRIPT_MINOR" -gt 0 ]]; do
  # The command `git describe --match v0.0` will return a string like
  #
  # v0.0-856-g329708b
  #
  # where 856 is the number of commits since the v0.0 tag. It will always
  # find the v0.0 tag and will always return the total number of commits (even
  # if the tag is v0.0.1).
  set +e
  GIT_CLOJURESCRIPT_REVISION=$(git --no-replace-objects describe --match "v${CLOJURESCRIPT_MAJOR}.${CLOJURESCRIPT_MINOR}" 2>/dev/null)
  set -e
  if [[ "$GIT_CLOJURESCRIPT_REVISION" =~ $CLOJURESCRIPT_REVISION_REGEX ]]; then
    CLOJURESCRIPT_REVISION="${BASH_REMATCH[1]}"
    CLOJURESCRIPT_REVISION_PART=".$CLOJURESCRIPT_REVISION"
    break
  fi
  CLOJURESCRIPT_MINOR=$((CLOJURESCRIPT_MINOR-1))
done

EXPECTED_BUILD_ID="${CLOJURESCRIPT_MAJOR}.${CLOJURESCRIPT_MINOR}${CLOJURESCRIPT_REVISION_PART}-${BUILD_SHORT_REV}"

GIT_BUILDS_CACHE_DIR="$CANARY_CACHE_DIR/builds"
GIT_BUILD_CACHE_DIR="$GIT_BUILDS_CACHE_DIR/$EXPECTED_BUILD_ID"
CACHED_JAR_PATH="$GIT_BUILD_CACHE_DIR/clojurescript-${EXPECTED_BUILD_ID}.jar"

if [[ -f "$CACHED_JAR_PATH" ]]; then
  echo "ClojureScript build $EXPECTED_BUILD_ID is cached => using it"
  BUILD_ID="$EXPECTED_BUILD_ID"
  BUILD_VERSION=$(echo "$BUILD_ID" | cut -d "-" -f 1)
  BUILD_JAR="$CACHED_JAR_PATH"
else
  echo "ClojureScript build $EXPECTED_BUILD_ID not cached => building it"

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
  LOCAL_MAVEN_REPO=${LOCAL_MAVEN_REPO:-$(get_local_maven_repo)}
  rm -rf "$LOCAL_MAVEN_REPO/org/clojure/clojurescript"

  set +e
  # shellcheck disable=SC2010
  BUILD_JAR=$(ls -1 "./target/${CLOJURESCRIPT_MAVEN_ARTIFACT}-"*.jar | grep -v slim)
  set -e

  if [[ -z "$BUILD_JAR" ]]; then
    echo "ERROR!"
    echo "ClojureScript JAR was not produced as ./target/${CLOJURESCRIPT_MAVEN_ARTIFACT}-<version>.jar"
    set -x
    ls -la ./target
    exit 2
  fi

  if [[ "$BUILD_JAR" =~ ^.*clojurescript-(.*)\.jar$  ]]; then
    BUILD_VERSION="${BASH_REMATCH[1]}"
  else
    echo "ERROR!"
    echo "Unable to determine clojurescript version from '$BUILD_JAR'"
    exit 3
  fi

  # to distinguish between builds from different forks/repos we append short sha to ClojureScript builds version (BUILD_ID)
  # this way we can treat them differently up to the point when jar gets installed into local maven repo
  # since that point we want BUILD_VERSION only (for compatibility reasons because some cljs code might rely on its format)
  # see --compiler-repo and --compiler-rev command-line options
  BUILD_ID="${BUILD_VERSION}-${BUILD_SHORT_REV}"

  # patch JAR's maven version to our SHA-annotated version
  #
  #   note that we need to patch version in pom.xml,
  #   maven seems to be picky about this one and it must match version in jar filename
  #   please note that there is also pom.properties file which also contains BUILD_VERSION, but have to leave that one intact
  #   because pom.properties is probably used as real version in local maven repo
  echo "Patching ClojureScript JAR..."
  jar -xf "$BUILD_JAR" "$POM_PATH"
  mv "$POM_PATH" "$POM_PATH.orig"
  sed "s|<version>$BUILD_VERSION</version>|<version>$BUILD_ID</version>|g" < "$POM_PATH.orig" > "$POM_PATH"
  jar -uf "$BUILD_JAR" "$POM_PATH"

  # cache build
  mkdir -p "$GIT_BUILD_CACHE_DIR"
  cp "$BUILD_JAR" "$CACHED_JAR_PATH"
fi

# -- github release ---------------------------------------------------------------------------------------------------------

if [[ -n "$TRAVIS_BUILD_ID" ]]; then
  TRAVIS_BUILD_URL="https://travis-ci.org/${CANARY_REPO}/builds/$TRAVIS_BUILD_ID"
  TRAVIS_BUILD_INFO="Travis log: $TRAVIS_BUILD_URL."
else
  TRAVIS_BUILD_URL="n/a"
  TRAVIS_BUILD_INFO=""
fi

GITHUB_RELEASE_BODY=$(cat <<MARKDOWN
A test build of ${COMPILER_REV_URL} via ${CANARY_JOB_COMMIT_URL}.
${TRAVIS_BUILD_INFO}
MARKDOWN
)
GITHUB_RELEASE_BODY_ENCODED=$(string_encode "${GITHUB_RELEASE_BODY}")

GITHUB_RELEASE_NAME="ClojureScript ${BUILD_ID}"
GITHUB_RELEASE_TAG="r${BUILD_ID}"

DATA=$(cat <<JSON
{
  "tag_name": "${GITHUB_RELEASE_TAG}",
  "target_commitish": "${CANARY_JOB_COMMIT}",
  "name": "${GITHUB_RELEASE_NAME}",
  "body": "${GITHUB_RELEASE_BODY_ENCODED}",
  "draft": false,
  "prerelease": true
}
JSON
)

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "Data for GitHub API https://developer.github.com/v3/repos/releases/#create-a-release\n$DATA"
fi

if [[ -z "$CANARY_PRODUCTION" ]]; then
  # non-production mode

  # don't talk to github just fill in some dummy result data
  BUILD_DOWNLOAD_URL="n/a in non-production mode"

else # production mode

  if [[ -z "$CANARY_REPO_TOKEN" ]]; then
    echo "expected non-empty CANARY_REPO_TOKEN env var => aborting"
    exit 4
  fi

  echo "Creating GitHub release $GITHUB_RELEASE_TAG..."
  # shellcheck disable=SC2086
  RELEASE_RESPONSE=$(curl ${CANARY_EXTRA_CURL_OPTS} \
                         -H "Content-Type: application/json" \
                         -H "Authorization: token $CANARY_REPO_TOKEN" \
                         -X POST \
                         --data "$DATA" \
                         https://api.github.com/repos/${CANARY_REPO}/releases)

  if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
    echo -e "GitHub API response:\n$RELEASE_RESPONSE"
  fi

  set +e
  RELEASE_ERROR=$(json_val ".errors[0].code" <<< "$RELEASE_RESPONSE")
  set -e

  if [[ "$RELEASE_ERROR" == "already_exists" ]]; then
    echo "GitHub release for ${BUILD_ID} already exists => skipping JAR upload (assuming it is the same)"
    # TODO: here we could query github api and get release assets and pick one
    BUILD_DOWNLOAD_URL="https://github.com/${CANARY_REPO}/releases/download/r${BUILD_ID}/clojurescript-${BUILD_ID}.jar"
    echo "Download URL: $BUILD_DOWNLOAD_URL (assumed)"
  else
    set +e
    UPLOAD_URL=$(json_val ".upload_url" <<< "$RELEASE_RESPONSE")
    set -e

    if [[ "$UPLOAD_URL" =~ ^https://uploads\.github\.com/repos/.*/releases/(.*)/assets.*$ ]]; then
      GITHUB_RELEASE_ID="${BASH_REMATCH[1]}"
    else
      echo "ERROR!"
      echo -e "Invalid upload_url returned from github api: '$UPLOAD_URL'\n$RELEASE_RESPONSE\n\ninput data:\n$DATA"
      mkdir -p "$CANARY_RESULT_DIR"
      echo "$RELEASE_RESPONSE" > "$CANARY_RESULT_DIR/release.response.json"
      exit 5
    fi

    RAW_UPLOAD_URL="https://uploads.github.com/repos/${CANARY_REPO}/releases/$GITHUB_RELEASE_ID/assets"
    COMPLETE_UPLOAD_URL="$RAW_UPLOAD_URL?name=clojurescript-$BUILD_ID.jar"

    echo "Uploading ClojureScript jar as GitHub release asset..."
    # shellcheck disable=SC2086
    UPLOAD_RESPONSE=$(curl ${CANARY_EXTRA_CURL_OPTS} \
                          -H "Content-Type: application/java-archive" \
                          -H "Authorization: token $CANARY_REPO_TOKEN" \
                          -X POST \
                          --data-binary "@$BUILD_JAR" \
                          "$COMPLETE_UPLOAD_URL")

    if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
      echo -e "GitHub API response:\n$UPLOAD_RESPONSE"
    fi

    set +e
    BUILD_DOWNLOAD_URL=$(json_val ".browser_download_url" <<< "$UPLOAD_RESPONSE")
    set -e

    if [[ ! "$BUILD_DOWNLOAD_URL" =~ ^https://github\.com/.*/releases/download.*$ ]]; then
      echo "ERROR!"
      echo -e "Invalid browser_download_url returned from github api: '$BUILD_DOWNLOAD_URL'\n$UPLOAD_RESPONSE"
      mkdir -p "$CANARY_RESULT_DIR"
      echo "$UPLOAD_RESPONSE" > "$CANARY_RESULT_DIR/upload.response.json"
      exit 6
    fi
    echo "Download URL: $BUILD_DOWNLOAD_URL"
  fi
fi # production mode

# -- collect metadata about job commit --------------------------------------------------------------------------------------

JOB_COMMIT_INFO_GITHUB_API_ENDPOINT="https://api.github.com/repos/${CANARY_REPO}/commits/${CANARY_JOB_COMMIT}"
echo "Retrieving github info about job commit '${CANARY_JOB_COMMIT}' via ${JOB_COMMIT_INFO_GITHUB_API_ENDPOINT}"

# shellcheck disable=SC2086
JOB_COMMIT_INFO_RESPONSE=$(curl ${CANARY_EXTRA_CURL_OPTS} \
                           -H "Content-Type: application/json" \
                           -H "Authorization: token $CANARY_REPO_TOKEN" \
                           -X GET \
                           "${JOB_COMMIT_INFO_GITHUB_API_ENDPOINT}")

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "GitHub API response:\n$JOB_COMMIT_INFO_RESPONSE"
fi

set +e
CANARY_JOB_COMMIT_AUTHOR_LOGIN=$(json_val ".author.login" <<< "$JOB_COMMIT_INFO_RESPONSE")
CANARY_JOB_COMMIT_AUTHOR_NAME=$(json_val ".commit.author.name" <<< "$JOB_COMMIT_INFO_RESPONSE")
CANARY_JOB_COMMIT_AUTHOR_DATE=$(json_val ".commit.author.date" <<< "$JOB_COMMIT_INFO_RESPONSE")
CANARY_JOB_COMMIT_AUTHOR_AVATAR_URL=$(json_val ".author.avatar_url" <<< "$JOB_COMMIT_INFO_RESPONSE")
set -e

if [[ "$CANARY_JOB_COMMIT_AUTHOR_LOGIN" == "null" ||
      "$CANARY_JOB_COMMIT_AUTHOR_NAME" == "null" ||
      "$CANARY_JOB_COMMIT_AUTHOR_DATE" == "null" ||
      "$CANARY_JOB_COMMIT_AUTHOR_AVATAR_URL" == "null" ]]; then
  echo "Warning: Unable to collect metadata about job commit from '${JOB_COMMIT_INFO_GITHUB_API_ENDPOINT}'"
  echo -e "response:\n$JOB_COMMIT_INFO_RESPONSE"
fi

# -- result preparation -----------------------------------------------------------------------------------------------------
# we pass results to the caller by producing an edn file on agreed path in RESULT_DIR
# we also copy compiled jar into RESULT_DIR and publish its path via :build-jar-path

RESULT_JAR_PATH="$CANARY_RESULT_DIR/clojurescript-${BUILD_ID}.jar"
cp "$BUILD_JAR" "$RESULT_JAR_PATH"

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "Copied result jar into '$RESULT_JAR_PATH'"
fi

RESULT=$(cat <<EDN
{
  :build-id "${BUILD_ID}"
  :build-version "${BUILD_VERSION}"
  :build-rev "${BUILD_REV}"
  :build-jar-path "${RESULT_JAR_PATH}"
  :build-download-url "${BUILD_DOWNLOAD_URL}"
  :github-release-name "${GITHUB_RELEASE_NAME}"
  :github-release-tag "${GITHUB_RELEASE_TAG}"
  :compiler-rev-url "${COMPILER_REV_URL}"
  :canary-job-commit "${CANARY_JOB_COMMIT}"
  :canary-job-commit-url "${CANARY_JOB_COMMIT_URL}"
  :canary-job-commit-author-login "${CANARY_JOB_COMMIT_AUTHOR_LOGIN}"
  :canary-job-commit-author-name "${CANARY_JOB_COMMIT_AUTHOR_NAME}"
  :canary-job-commit-author-date "${CANARY_JOB_COMMIT_AUTHOR_DATE}"
  :canary-job-commit-author-avatar-url "${CANARY_JOB_COMMIT_AUTHOR_AVATAR_URL}"
  :travis-build-url "${TRAVIS_BUILD_URL}"
}
EDN
)

RESULT_EDN_PATH="$CANARY_RESULT_DIR/result.edn"
mkdir -p "$CANARY_RESULT_DIR"
echo "$RESULT" > "$RESULT_EDN_PATH"

if [[ "$CANARY_VERBOSITY" -gt 0 ]]; then
  echo -e "Generated result.edn at '$RESULT_JAR_PATH':"
  cat "$RESULT_EDN_PATH"
fi
