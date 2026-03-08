#base image
FROM eclipse-temurin:17-jdk

MAINTAINER saqlenpasha1

#copy the jar file to the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#command to run the application. run this command when the container is created using this image.
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]

