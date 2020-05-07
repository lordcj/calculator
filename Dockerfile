FROM zenika/alpine-maven

RUN mkdir -p /devops/calculator
RUN apk add --no-cache git
RUN apk add --no-cache openssh

RUN git clone https://github.com/lordcj/calculator /devops/calculator

WORKDIR /devops/calculator

RUN mvn clean install package
RUN java -cp target/calculator-1.0-SNAPSHOT.jar com/calculator/Calculator
