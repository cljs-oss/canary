#!/usr/bin/env bash

set -e -x -o pipefail

echo "-----------------------------------------------------------------------------------------------------------------------"
echo "running ${BASH_SOURCE[0]} on $(date)"

finish() {
  echo "finished ${BASH_SOURCE[0]} on $(date)"
  echo
  echo
}
trap finish EXIT

# ensure we start in canary's root folder
cd "$(dirname "${BASH_SOURCE[0]}")/.."

AUTO_JOB_CONFIG_FILE=~/.canary-auto-job-config.sh

if [[ -f "${AUTO_JOB_CONFIG_FILE}" ]]; then
  echo "sourcing ${AUTO_JOB_CONFIG_FILE}..."
  # shellcheck disable=SC1090
  source "${AUTO_JOB_CONFIG_FILE}"
fi

CANARY_AUTO_JOB_REPO_TOKEN=${CANARY_AUTO_JOB_REPO_TOKEN}
CANARY_AUTO_JOB_COMMITTER_NAME=${CANARY_AUTO_JOB_COMMITTER_NAME}
CANARY_AUTO_JOB_COMMITTER_EMAIL=${CANARY_AUTO_JOB_COMMITTER_EMAIL}
CANARY_AUTO_JOB_COMMAND=${CANARY_AUTO_JOB_COMMAND:-job}

if [[ -z "$CANARY_AUTO_JOB_REPO_TOKEN" ]]; then
  REPO_URL="git@github.com:cljs-oss/canary.git"
else
  REPO_URL="https://${CANARY_AUTO_JOB_REPO_TOKEN}@github.com/cljs-oss/canary.git"
fi

# we keep another working copy for jobs branch, see https://github.com/cljs-oss/canary/tree/jobs
JOB_BRANCH_FOLDER=".canary-jobs-branch"

# clone it if it does not exist yet
if [[ ! -d "$JOB_BRANCH_FOLDER" ]]; then
  git clone --branch jobs "${REPO_URL}" "${JOB_BRANCH_FOLDER}"
fi

cd "${JOB_BRANCH_FOLDER}"

GIT_CONFIG_USER_NAME_ARGS=()
if [[ -n "${CANARY_AUTO_JOB_COMMITTER_NAME}" ]]; then
  GIT_CONFIG_USER_NAME_ARGS=("-c" "user.name=$CANARY_AUTO_JOB_COMMITTER_NAME")
fi
GIT_CONFIG_USER_EMAIL_ARGS=()
if [[ -n "${CANARY_AUTO_JOB_COMMITTER_EMAIL}" ]]; then
  GIT_CONFIG_USER_EMAIL_ARGS=("-c" "user.email=${CANARY_AUTO_JOB_COMMITTER_EMAIL}")
fi

git fetch
git reset --hard origin/jobs
git "${GIT_CONFIG_USER_NAME_ARGS[@]}" "${GIT_CONFIG_USER_EMAIL_ARGS[@]}" commit --allow-empty -m "${CANARY_AUTO_JOB_COMMAND}"
git push
