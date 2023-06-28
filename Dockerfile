FROM amazoncorretto:17-alpine-jdk 
MAINTAINER FPA
COPY target/FPA-0.0.1-SNAPSHOT.jar FPA-app.jar
ENTRYPOINT ["java","-jar","/FPA-app.jar"]
