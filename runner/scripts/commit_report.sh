#!/usr/bin/env bash

set -e -o pipefail

# we assume cwd is a clean task's workdir, see shell-launcher in commit-report! (report.clj)

# parametrization via environment
CANARY_PRODUCTION=${CANARY_PRODUCTION}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}
CANARY_JOB_COMMIT=${CANARY_JOB_COMMIT:-"jobs"}
CANARY_REPO_TOKEN=${CANARY_REPO_TOKEN}
CANARY_JOB_ID=${CANARY_JOB_ID}
CANARY_BUILD_ID=${CANARY_BUILD_ID}
TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}
RESULT_DIR=${RESULT_DIR:-`pwd`}
REPORT_FILE=${REPORT_FILE:-"$RESULT_DIR/README.md"}
TASKS_FILE=${TASKS_FILE:-"$RESULT_DIR/tasks.edn"}
OPTIONS_FILE=${OPTIONS_FILE:-"$RESULT_DIR/options.edn"}

CANARY_JOB_COMMIT_URL="https://github.com/cljs-oss/canary/commit/${CANARY_JOB_COMMIT}"

if [[ -n "$TRAVIS_BUILD_ID" ]]; then
  TRAVIS_BUILD_URL="https://travis-ci.org/cljs-oss/canary/builds/$TRAVIS_BUILD_ID"
else
  TRAVIS_BUILD_URL="n/a"
fi
TRAVIS_BUILD_INFO="Travis: $TRAVIS_BUILD_URL."

git clone --branch results https://github.com/cljs-oss/canary results
cd results

# configure repo
git config --global user.email "canary-bot@users.noreply.github.com"
git config --global user.name "Canary Bot"
git remote add up "https://${CANARY_REPO_TOKEN}@github.com/cljs-oss/canary.git"

# prepare content
if [[ -z "$CANARY_BUILD_ID" ]]; then
  echo "ERROR!"
  echo "CANARY_BUILD_ID env var must be specified"
  exit 1
fi

if [[ -z "$CANARY_JOB_ID" ]]; then
  echo "ERROR!"
  echo "CANARY_JOB_ID env var must be specified"
  exit 2
fi

FORMATTED_ID=${CANARY_JOB_ID}
while [ ${#FORMATTED_ID} -lt 6 ]; do
  FORMATTED_ID=0${FORMATTED_ID}
done

REPORT_SLUG="job-$FORMATTED_ID-$CANARY_BUILD_ID"
REPORT_DIR="reports/$REPORT_SLUG"

if [[ -d "$REPORT_DIR" ]]; then
  echo "removing previous report folder"
  rm -rf "$REPORT_DIR"
fi

mkdir -p "$REPORT_DIR"
cd "$REPORT_DIR"

cp "$REPORT_FILE" .
cp "$TASKS_FILE" .
cp "$OPTIONS_FILE" .

# commit to git
git add --all .
git commit -F- <<EOF
Report for job #${CANARY_JOB_ID} via ${CANARY_JOB_COMMIT_URL}

Compiler: ${CANARY_BUILD_ID}
${TRAVIS_BUILD_INFO}
EOF

# push if in production
if [[ -z "$CANARY_PRODUCTION" ]]; then
  echo "not pushing to GitHub because not in production"
else
  git push up results
fi
