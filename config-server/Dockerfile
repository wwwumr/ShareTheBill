FROM openjdk:8-jdk-alpine

VOLUME /tmp

MAINTAINER chuyuxuan

COPY target/config-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9005

ENTRYPOINT ["java","-jar","/app.jar"]