FROM openjdk:17

MAINTAINER Rajesh <Raj@gmail.com>

COPY target/spring.jar  /usr/app/spring.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring.jar"]