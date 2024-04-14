FROM openjdk:11-jre-slim
EXPOSE 8081
ADD target/filmsapp.jar filmsapp.jar
ENTRYPOINT ["java", "-jar", "filmsapp.jar"]