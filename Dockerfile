FROM artifactory.asredanesh.com/docker/openjdk:17-jdk-alpine-tz
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} test-hello.jar
#ARG CERT=target/*.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/test-hello.jar"]
#####
