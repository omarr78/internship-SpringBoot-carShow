# Use a lightweight JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy JAR file into container
COPY target/carshow-0.0.1-SNAPSHOT.jar app.jar

# Expose port (match with your Spring Boot server.port if changed)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
