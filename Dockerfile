FROM openjdk:11
EXPOSE 8080
ADD target/devop-test.jar devop-test.jar
ENTRYPOINT ["jar","-jar","/devop-test.jar"]
