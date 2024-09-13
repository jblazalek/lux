FROM openjdk:22
WORKDIR /med
COPY target/med-0.0.1-SNAPSHOT.jar med.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar","med.jar" ]