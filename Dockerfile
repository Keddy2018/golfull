FROM khipu/openjdk17-alpine
COPY "./target/golfull-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]