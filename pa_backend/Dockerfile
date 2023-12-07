# # Build stage
# FROM maven:3.9.6 AS build

# WORKDIR /app

# COPY . .

# RUN mvn clean package

# FROM adoptopenjdk/openjdk16:ppc64le-centos-jdk-16_36

# COPY --from=build /app/target/paPlatypusBackend-0.0.1-SNAPSHOT.jar /usr/local/lib/paPlatypusBackend-0.0.1-SNAPSHOT.jar

# ENTRYPOINT ["java", "-jar", "/usr/local/lib/paPlatypusBackend-0.0.1-SNAPSHOT.jar"]
# Build stage
FROM maven:3.9.6 AS build

WORKDIR /app

COPY . .

RUN mvn clean package

# Final stage
FROM openjdk:16

COPY --from=build /app/target/paPlatypusBackend-0.0.1-SNAPSHOT.jar /usr/local/lib/paPlatypusBackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/usr/local/lib/paPlatypusBackend-0.0.1-SNAPSHOT.jar"]