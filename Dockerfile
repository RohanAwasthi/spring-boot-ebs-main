# Use the official OpenJDK 17 image
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app


# Use the official OpenJDK 17 image
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

#Create a ARG variable with the name JAVA_OPTS
ARG JAVA_OPTS

# Create a ENV variable with the name JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS

# Copy the target jar file into the container at /app
COPY target/demo-app-0.0.1-SNAPSHOT.jar demo-app.jar

# Expose port 8080
EXPOSE 8080

# Create a ENTRYPOINT to run the jar file with the JAVA_OPTS variable
ENTRYPOINT exec java $JAVA_OPTS -jar /app/demo-app.jar