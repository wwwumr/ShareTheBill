FROM openjdk:8-jdk-alpine

VOLUME /tmp

MAINTAINER chuyuxuan

COPY target/wordladder-0.0.1-SNAPSHOT.jar app.jar

COPY src/main/resources/static/dictionary.txt src/main/resources/static/dictionary.txt

EXPOSE 9000

ENTRYPOINT ["java","-jar","/app.jar"]