FROM openjdk:11
ADD target/ac-laboratory-0.0.1-SNAPSHOT.jar ac-laboratory-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ac-laboratory-0.0.1-SNAPSHOT.jar"]