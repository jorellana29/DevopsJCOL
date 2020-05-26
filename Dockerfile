FROM openjdk:11-jdk-alpine
EXPOSE 8080
ADD target/devop-test.jar devop-test.jar
ENTRYPOINT ["java","-jar","/devop-test.jar devop-test.jar"]