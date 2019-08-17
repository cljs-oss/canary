#!/usr/bin/env bash

set -e -x -o pipefail

echo "-----------------------------------------------------------------------------------------------------------------------"
echo "running ${BASH_SOURCE[0]} on $(date)"

finish () {
  echo "finished ${BASH_SOURCE[0]} on $(date)"
  echo
  echo
}
trap finish EXIT

# ensure we start in canary's root folder
cd "$(dirname "${BASH_SOURCE[0]}")/../..";

AUTO_JOB_CONFIG_FILE=~/.canary-auto-job-config.sh

if [[ -f "${AUTO_JOB_CONFIG_FILE}" ]]; then
  echo "sourcing ${AUTO_JOB_CONFIG_FILE}..."
  # shellcheck disable=SC1090
  source "${AUTO_JOB_CONFIG_FILE}"
fi

CANARY_AUTO_JOB_REPO_TOKEN=${CANARY_AUTO_JOB_REPO_TOKEN}
CANARY_AUTO_JOB_COMMIT_AUTHOR=${CANARY_AUTO_JOB_COMMIT_AUTHOR}
CANARY_AUTO_JOB_COMMITTER_NAME=${CANARY_AUTO_JOB_COMMITTER_NAME}
CANARY_AUTO_JOB_COMMITTER_EMAIL=${CANARY_AUTO_JOB_COMMITTER_EMAIL}
CANARY_AUTO_JOB_COMMAND=${CANARY_AUTO_JOB_COMMAND:-job}

if [[ -z "$CANARY_AUTO_JOB_REPO_TOKEN" ]]; then
  REPO_URL="git@github.com:cljs-oss/canary.git"
else
  REPO_URL="https://${CANARY_AUTO_JOB_REPO_TOKEN}@github.com/cljs-oss/canary.git"
fi

if [[ -n "$CANARY_AUTO_JOB_COMMIT_AUTHOR" ]]; then
  GIT_COMMIT_AUTHOR="--author=\"${CANARY_AUTO_JOB_COMMIT_AUTHOR}\""
fi

# we keep another working copy for jobs branch, see https://github.com/cljs-oss/canary/tree/jobs
JOB_BRANCH_FOLDER=".canary-jobs-branch"

# clone it if it does not exist yet
if [[ ! -d "$JOB_BRANCH_FOLDER" ]]; then
  git clone --branch jobs "${REPO_URL}" "${JOB_BRANCH_FOLDER}"
fi

cd "${JOB_BRANCH_FOLDER}"

if [[ -n "${CANARY_AUTO_JOB_COMMITTER_NAME}" ]]; then
  git config user.name "${CANARY_AUTO_JOB_COMMITTER_NAME}"
fi
if [[ -n "${CANARY_AUTO_JOB_COMMITTER_EMAIL}" ]]; then
  git config user.email "${CANARY_AUTO_JOB_COMMITTER_EMAIL}"
fi

git fetch
git reset --hard origin/jobs
# TODO: we could check if there were recent job requests and skip if hot
# bash COMMIT_AUTHOR might contain spaces and bash escaping rules are crazy, have to branch
if [[ -n "$GIT_COMMIT_AUTHOR" ]]; then
  git commit -m "${CANARY_AUTO_JOB_COMMAND}" --allow-empty "${GIT_COMMIT_AUTHOR}"
else
  git commit -m "${CANARY_AUTO_JOB_COMMAND}" --allow-empty
fi

git push
