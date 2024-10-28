# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/springboot-app-0.0.1-SNAPSHOT.jar app.jar

# Set environment variable to use external configuration file
ENV SPRING_CONFIG_LOCATION=file:/config/application.properties

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
