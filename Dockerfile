FROM openjdk:8
RUN java -cp target/calculator-1.0-SNAPSHOT.jar com/calculator/Calculator

ENTRYPOINT ["java", "-cp", "target/calculator-1.0-SNAPSHOT.jar", "com/calculator/Calculator"]
