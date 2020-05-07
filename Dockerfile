FROM openjdk:8
ADD target/calculator-1.0-SNAPSHOT.jar calculator-1.0.SNAPSHOT.jar

ENTRYPOINT ["java", "-cp", "target/calculator-1.0-SNAPSHOT.jar", "Calculator"]
