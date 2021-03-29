FROM amazoncorretto:15-alpine
ARG JAR_FILE=target/example_application-0.0.1-SNAPSHOT-spring-boot.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]