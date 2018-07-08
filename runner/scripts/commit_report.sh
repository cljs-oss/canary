#!/usr/bin/env bash

set -e -o pipefail

# we assume cwd is a clean task's workdir, see shell-launcher in commit-report! (report.clj)

# -- parameters -------------------------------------------------------------------------------------------------------------

TRAVIS_BUILD_ID=${TRAVIS_BUILD_ID}
CANARY_PRODUCTION=${CANARY_PRODUCTION}
CANARY_VERBOSITY=${CANARY_VERBOSITY:-0}
CANARY_JOB_COMMIT=${CANARY_JOB_COMMIT:-"jobs"}
CANARY_REPO_TOKEN=${CANARY_REPO_TOKEN}
CANARY_JOB_ID=${CANARY_JOB_ID}
CANARY_JOB_STATUS=${CANARY_JOB_STATUS}
CANARY_BUILD_ID=${CANARY_BUILD_ID}
CANARY_RESULT_DIR=${CANARY_RESULT_DIR:-`pwd`}
CANARY_ROOT_DIR=${CANARY_ROOT_DIR}
CANARY_REPORT_FILE=${CANARY_REPORT_FILE:-"$CANARY_RESULT_DIR/README.md"}
CANARY_TASKS_FILE=${CANARY_TASKS_FILE:-"$CANARY_RESULT_DIR/tasks.edn"}
CANARY_OPTIONS_FILE=${CANARY_OPTIONS_FILE:-"$CANARY_RESULT_DIR/options.edn"}
WORK_DIR=`pwd`

CANARY_JOB_COMMIT_URL="https://github.com/cljs-oss/canary/commit/${CANARY_JOB_COMMIT}"

if [[ -z "$CANARY_ROOT_DIR" ]]; then
  echo "ERROR!"
  echo "CANARY_ROOT_DIR env var must be specified"
  exit 3
fi

# -- functions --------------------------------------------------------------------------------------------------------------

pushd() {
    command pushd "$@" > /dev/null
}

popd() {
    command popd "$@" > /dev/null
}

# -- clone canary/results branch --------------------------------------------------------------------------------------------

if [[ "$CANARY_VERBOSITY" -gt 1 ]]; then
  echo "effective settings:\n"
  # https://unix.stackexchange.com/a/5691/188074
  comm -3 <(declare | sort) <(declare -f | sort)
fi

if [[ -n "$TRAVIS_BUILD_ID" ]]; then
  TRAVIS_BUILD_URL="https://travis-ci.org/cljs-oss/canary/builds/$TRAVIS_BUILD_ID"
else
  TRAVIS_BUILD_URL="n/a"
fi
TRAVIS_BUILD_INFO="Travis: $TRAVIS_BUILD_URL"

git clone --branch results https://github.com/cljs-oss/canary results
cd results

# configure repo
git config user.email "canary-bot@users.noreply.github.com"
git config user.name "Canary Bot"

git remote add up "https://${CANARY_REPO_TOKEN}@github.com/cljs-oss/canary.git"

# -- prepare content --------------------------------------------------------------------------------------------------------

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
DATE_YEAR=`date +%Y`
DATE_MONTH=`date +%m`
DATE_DAY=`date +%d`
REPORT_DIR="reports/$DATE_YEAR/$DATE_MONTH/$DATE_DAY/$REPORT_SLUG"

if [[ -d "$REPORT_DIR" ]]; then
  echo "removing previous report folder"
  rm -rf "$REPORT_DIR"
fi

mkdir -p "$REPORT_DIR"
pushd "$REPORT_DIR"

cp "$CANARY_REPORT_FILE" .
cp "$CANARY_TASKS_FILE" .
cp "$CANARY_OPTIONS_FILE" .

popd

# -- update root readme -----------------------------------------------------------------------------------------------------
# we are currently in working directory of the 'results' branch

RGEN_RUN_SCRIPT="$CANARY_ROOT_DIR/rgen/run.sh"
OVERVIEW_TABLE_FILE="$WORK_DIR/overview-table.md"
REPORTS_DIR="$WORK_DIR/results/reports"

"${RGEN_RUN_SCRIPT}" overview -r "${REPORTS_DIR}" -c 10 -o "${OVERVIEW_TABLE_FILE}"

# patch root readme with most recent reports
ROOT_README_NAME="README.md"
README_WITH_MARKER=`perl -pe 'BEGIN{undef $/;} s/\(begin_overview_table\)\n.*\n(.*?)\(end_overview_table\)/(begin_overview_table)\n\nOVERVIEW_TABLE_MARKER\n\n$1(end_overview_table)/smg' "$ROOT_README_NAME"`
NEW_OVERVIEW_TABLE=`cat "${OVERVIEW_TABLE_FILE}"`
NEW_README="${README_WITH_MARKER/OVERVIEW_TABLE_MARKER/$NEW_OVERVIEW_TABLE}"
echo "$NEW_README" > "$ROOT_README_NAME"

# -- commit to git ----------------------------------------------------------------------------------------------------------

git add --all .
git commit -F- <<EOF
Report for job #${CANARY_JOB_ID} via ${CANARY_JOB_COMMIT_URL}

Compiler: ${CANARY_BUILD_ID}
${TRAVIS_BUILD_INFO}
EOF

# -- push if in production --------------------------------------------------------------------------------------------------

if [[ -z "$CANARY_PRODUCTION" ]]; then
  echo "not pushing to GitHub because not in production"
else
  git push up results
fi
