FROM openjdk:8-jdk-alpine
MAINTAINER proyectoIntegrador
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-crud-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-crud-0.0.1-SNAPSHOT.jar"]