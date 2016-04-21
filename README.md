spring-cloud-sso-oauth2-fb [![build](https://travis-ci.org/daggerok/spring-cloud-sso-oauth2-fb.svg?branch=master)](https://travis-ci.org/daggerok/spring-cloud-sso-oauth2-fb)
==========================

```sh
git clone ... && cd $_
gradle :cloud-config-server:bootRun
gradle :discovery-service-registry:bootRun
gradle :fb-sso-oauthed-service:bootRun
open http://localhost:8080
...
```

docker in general (app url must be configured for docker ip in dev fb apps admin ui)

```sh
gradle clean build buildDocker
docker run -p 8888:8888 -it daggerok/daggerok-cloud-config-server:1
docker run -p 8761:8761 -it daggerok/daggerok-discovery-service-registry:1
docker run -p 8080:8080 -it daggerok/daggerok-fb-sso-oauthed-service:1
```

remove none-images (side-effect)

```sh
docker rmi -f $(docker images |grep " <none> " | awk '{print $3}')
```

[spring-cloud-security](http://cloud.spring.io/spring-cloud-security/)
[registering with facebook](https://spring.io/guides/gs/register-facebook-app/)
[gradle docker plugin](https://github.com/Transmode/gradle-docker)
[spring boot docker](https://spring.io/guides/gs/spring-boot-docker/)
