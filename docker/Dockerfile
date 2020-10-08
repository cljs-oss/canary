FROM ubuntu:20.04

WORKDIR /root

ENV DEBIAN_FRONTEND noninteractive

# install basic deps
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    software-properties-common wget curl git sudo

# install Java 11
RUN add-apt-repository ppa:openjdk-r/ppa && \
    apt-get update && \
    apt install -y --no-install-recommends \
    openjdk-11-jdk ca-certificates-java && \
    java -version

# for clojurescript build script
RUN apt-get install -y --no-install-recommends maven && \
    mvn --version

# for internal canary scripts
RUN apt-get install -y --no-install-recommends jq && jq --version

# install latest lein
ENV LEIN_ROOT 1
RUN cd /usr/bin && \
    wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein && \
    chmod a+x lein && \
    yes y | lein upgrade

VOLUME ["/root/.m2"]
VOLUME ["/var/cache"]
VOLUME ["/canary/runner"]
VOLUME ["/canary/rgen"]

WORKDIR "/canary/runner"
ENTRYPOINT ["/canary/runner/run.sh"]

RUN echo "\n==============\nBuild summary:" && \
    lsb_release -a && \
    echo && \
    java -version && \
    mvn --version && \
    lein --version && \
    jq --version && \
    echo "==============\n"
