FROM ubuntu:xenial

WORKDIR /root

ENV DEBIAN_FRONTEND noninteractive

# install basic deps
RUN apt-get -y update
RUN apt-get -y upgrade
RUN apt-get -y install software-properties-common wget curl git sudo

# install Java 11
RUN add-apt-repository ppa:openjdk-r/ppa
RUN apt-get update
RUN apt install -y openjdk-11-jdk ca-certificates-java
RUN java -version

# install latest lein
ENV LEIN_ROOT 1
RUN cd /usr/bin \
    && wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein \
    && chmod a+x lein \
    && lein
RUN yes y | lein upgrade

# for clojurescript build script
RUN apt-get -y install maven
RUN mvn --version

# for internal canary scripts
RUN apt-get -y install python
RUN python --version

VOLUME ["/root/.m2"]
VOLUME ["/var/cache"]
VOLUME ["/canary/runner"]
VOLUME ["/canary/rgen"]

WORKDIR "/canary/runner"
ENTRYPOINT ["/canary/runner/run.sh"]
