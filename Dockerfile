FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/SotnanceL3Api-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080

# Define default values for environment variables (optional)
ENV MYSQL_HOST=localhost
ENV MYSQL_PORT=3306
ENV MYSQL_DB_NAME=fares_api

ENTRYPOINT ["java","-jar","demo.jar"]
