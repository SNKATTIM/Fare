FROM openjdk:11
EXPOSE 8090
ADD target/Fare-0.0.1-SNAPSHOT Fare-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Fare-0.0.1-SNAPSHOT.jar"]
