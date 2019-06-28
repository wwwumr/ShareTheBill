FROM openjdk:8-jdk-alpine

VOLUME /tmp

MAINTAINER chuyuxuan

COPY target/gateway-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9007

ENTRYPOINT ["java","-jar","/app.jar"]