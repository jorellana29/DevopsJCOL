FROM openjdk:jdk-alpine
VOLUME /tmp
ARG JAR_FILE
EXPOSE 8090
COPY {JAR_FILE} devop-test.jar
ENTRYPOINT ["java", "-jar", "/devop-test.jar"]