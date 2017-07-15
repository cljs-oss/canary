#!/usr/bin/env bash

set -e -o pipefail -x

# this is an example of a raw shell script embedding tests into canary
# this not a recommended way, recommended way is to trigger CI build on planck repo and observe results there

# source: https://github.com/cljs-oss/planck/blob/master/.travis.yml

#git clone https://github.com/mfikes/planck

#cd planck && script/build && script/test
