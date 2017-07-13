FROM ubuntu:xenial

WORKDIR /root

ENV DEBIAN_FRONTEND noninteractive

# install basic deps
RUN apt-get -y update
RUN apt-get -y upgrade
RUN apt-get -y install software-properties-common wget curl git sudo

# install Java 8: http://www.webupd8.org/2012/09/install-oracle-java-8-in-ubuntu-via-ppa.html
RUN add-apt-repository ppa:webupd8team/java
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
RUN apt-get -y update
RUN apt-get -y install oracle-java8-installer oracle-java8-set-default
RUN java -version

# install latest lein
ENV LEIN_ROOT 1
RUN cd /usr/bin \
    && wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein \
    && chmod a+x lein \
    && lein
RUN yes y | lein upgrade

# for planck
RUN apt-get -y install clang cmake pkg-config javascriptcoregtk-3.0 libglib2.0-dev libzip-dev libcurl4-gnutls-dev libicu-dev

# for clojurescript build script
RUN apt-get -y install maven
RUN mvn --version

VOLUME ["/root/.m2"]
VOLUME ["/var/cache"]
VOLUME ["/runner"]

WORKDIR "/runner"
ENTRYPOINT ["/runner/run.sh"]
