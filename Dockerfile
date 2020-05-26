FROM openjdk:11
EXPOSE 8287
ADD target/devop-test.jar devop-test.jar
ENTRYPOINT ["java","-jar","/devop-test.jar"]