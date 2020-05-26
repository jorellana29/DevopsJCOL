FROM openjdk:11
EXPOSE 8080
ADD target/devops-test.jar devops-test.jar
ENTRYPOINT ["jar","-jar","/devops-test.jar"]
