FROM ubuntu:18.04
MAINTAINER Shobhit Joshi (XXXXXX@gmail.com)

#Run commands inside BASE IMAGE
RUN apt-get update
RUN apt-get install -y git
RUN mkdir -p /devops/calculator
RUN git clone https://github.com/lordcj/calculator.git /devops/calculator
RUN apt-get install -y openjdk-8-jdk
RUN apt install -y maven

RUN java -version
RUN mvn -version

WORKDIR /devops/calculator
RUN mvn clean install -DskipTests
RUN java -cp target/calculator-1.0-SNAPSHOT.jar com/calculator/Calculator
