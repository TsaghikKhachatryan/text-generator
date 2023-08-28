FROM openjdk:17-oracle
WORKDIR /app
COPY target/text-generator-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","text-generator-0.0.1-SNAPSHOT.jar"]