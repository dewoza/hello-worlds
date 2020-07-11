# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/htmlsingle/#using-boot-devtools)

*[Codejava.net Spring Boot RESTful Tutorial](https://www.codejava.net/frameworks/spring-boot/spring-boot-hello-world-restful-web-services-tutorial)

To set another port than the default 8080:
open /src/main/resources/application.properties
plainly write:
server.port = 8090

Run failures:
If Port is already in use and the PID is needed to kill:
Web server failed to start. Port 8080 was already in use.

Open a terminal
Find the blocking process with
sudo lsof -i :portNumber
Kill the process with its PID
kill PID
or
sudo kill PID
or
sudo kill -9 PID
