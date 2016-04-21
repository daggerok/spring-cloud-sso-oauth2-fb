FROM java:8
MAINTAINER Maksim Kostromin <daggerok@gmail.com>
ENV DOCKER_HOST 192.168.99.100
# spring boot produces logs, so we need /tmp for it
VOLUME /tmp
# copy executable application fat jar as app.jar
ADD daggerok-discovery-service-registry-1.jar app.jar
# expose public port
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
