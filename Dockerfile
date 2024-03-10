FROM eclipse-temurin:17-jre-alpine
#copy jar from local into docker image
COPY target/SpringMongoProject-0.0.1-SNAPSHOT.jar SpringMongoProject-0.0.1-SNAPSHOT.jar
#command line to run jar
ENTRYPOINT ["java", "-jar","/SpringMongoProject-0.0.1-SNAPSHOT.jar"]