#!/usr/bin/env bash

set -e -o pipefail

# we assume cwd is a clean task's workdir, see shell-launcher in commit-report! (report.clj)

# parametrization via environment
CANARY_PRODUCTION=${CANARY_PRODUCTION}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}
CANARY_JOB_COMMIT=${CANARY_JOB_COMMIT:-"jobs"}
CANARY_REPO_TOKEN=${CANARY_REPO_TOKEN}
CANARY_JOB_ID=${CANARY_JOB_ID}
TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}
RESULT_DIR=${RESULT_DIR:-`pwd`}
REPORT_FILE=${REPORT_FILE:-"$RESULT_DIR/README.md"}
TASKS_FILE=${TASKS_FILE:-"$RESULT_DIR/tasks.edn"}
OPTIONS_FILE=${OPTIONS_FILE:-"$RESULT_DIR/options.edn"}

CANARY_JOB_COMMIT_URL="https://github.com/cljs-oss/canary/commit/${CANARY_JOB_COMMIT}"

git clone --branch results https://github.com/cljs-oss/canary results
cd results

# configure repo
git config --global user.email "canary-bot@users.noreply.github.com"
git config --global user.name "Canary Bot"
git remote add up "https://${CANARY_REPO_TOKEN}@github.com/cljs-oss/canary.git"

# prepare content
REPORT_DIR="reports/$CANARY_JOB_COMMIT"

mkdir -p "$REPORT_DIR"
cd "$REPORT_DIR"

cp "$REPORT_FILE" .
cp "$TASKS_FILE" .
cp "$OPTIONS_FILE" .

# commit to git
git add --all .
git commit -F- <<EOF
A report for ${CANARY_JOB_ID}

${CANARY_JOB_COMMIT_URL}.
EOF

# push if in production
if [[ -z "$CANARY_PRODUCTION" ]]; then
  echo "not pushing to GitHub because not in production"
else
  git push up results
fi
