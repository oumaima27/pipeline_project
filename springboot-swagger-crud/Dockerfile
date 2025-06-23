# Use a lightweight JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Argument to locate the JAR file
ARG JAR_FILE=target/*.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
