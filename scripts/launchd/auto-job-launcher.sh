#!/usr/bin/env bash

# ensure we start in canary's root folder
cd "$(dirname "${BASH_SOURCE[0]}")/../..";

# make sure we use latest version of auto-job.sh
git fetch
git reset --hard origin/master

# run auto-job
./scripts/launchd/auto-job.sh 2>&1
