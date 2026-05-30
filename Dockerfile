FROM eclipse-temurin:21-jd
WORKDIR /app
COPY target/*.jar app.jar
CMD ["java", "-jar","app.jar"]

