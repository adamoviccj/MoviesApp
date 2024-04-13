FROM openjdk:11-jre-slim
COPY target/*.jar moviesapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "moviesapp.jar"]