FROM openjdk:8-jdk-alpine

VOLUME /tmp

MAINTAINER chuyuxuan

COPY target/service-feign-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9003

ENTRYPOINT ["java","-jar","/app.jar"]