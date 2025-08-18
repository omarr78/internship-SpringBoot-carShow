# Use a lightweight JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy JAR file into container
COPY target/carshow-0.0.1-SNAPSHOT.jar app.jar

# Expose port 
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]


# docker build -t omarrnabil/carshow:1.0 .
# docker run -p 5000:8080 omarrnabil/carshow:1.0
# docker login
# docker push omarrnabil/carshow:1.0
