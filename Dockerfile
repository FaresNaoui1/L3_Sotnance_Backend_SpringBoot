# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/SotnanceL3Api-0.0.1-SNAPSHOT.jar .

# Expose port 8080 to the outside world
EXPOSE 8080

# Define the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "SotnanceL3Api-0.0.1-SNAPSHOT.jar"]
