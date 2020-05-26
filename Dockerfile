FROM openjdk:8-jdkd-alpine
VOLUME /tmp
EXPOSE 8287
ARG JAR_FILE=target/devop-test.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
