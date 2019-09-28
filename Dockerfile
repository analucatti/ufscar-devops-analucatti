FROM openjdk:8-alpine
LABEL maintainer="Ana Maria Lucatti Santos <analucatti23@gmail.com>"

COPY ./target/docker-0.0.1-SNAPSHOT.jar /opt/ufscar/dc/docker.jar

ENV ACTUATOR_ENDPOINTS info
EXPOSE 8080

CMD ["java", "-jar", "/opt/ufscar/dc/docker.jar","--management.endpoints.web.exposure.include=${ACTUATOR_ENDPOINTS}"]

# docker build -t hello-docker .
# docker run -p 8090:8080 --rm --name terminalLinux hello-docker