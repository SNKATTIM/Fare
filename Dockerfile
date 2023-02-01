FROM openjdk:11
EXPOSE 8090
ADD target/*.jar fare.jar
ENTRYPOINT ["java", "-jar","/fare.jar"]
