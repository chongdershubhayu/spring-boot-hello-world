FROM openjdk:8-jdk-alpine
ARG JAR_FILE=spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar
COPY target/${JAR_FILE} app.jar
RUN mkdir /tmp
ENTRYPOINT ["java","-jar","/app.jar","--spring.config.location=/tmp/application.properties"]
EXPOSE 8080/tcp
