# Base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file from the correct directory
COPY target/*.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
