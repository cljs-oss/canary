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

cd ..

# we keep another working copy for jobs branch, see https://github.com/cljs-oss/canary/tree/jobs
JOB_BRANCH_FOLDER="canary-jobs-branch"

# clone it if it does not exist yet
if [[ ! -d "$JOB_BRANCH_FOLDER" ]]; then
  git clone --branch jobs git@github.com:cljs-oss/canary.git ${JOB_BRANCH_FOLDER}
fi

cd ${JOB_BRANCH_FOLDER}

git fetch
git reset --hard origin/jobs
# TODO: we could check if there were recent job requests and skip if hot
git commit -m "job" --allow-empty --author="BinaryAge Bot <bot@binaryage.com>"
git push
