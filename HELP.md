# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

# How to use InerceptorExceptionDemo App

#Invalid Request 1.
curl --location --request POST 'http://localhost:8080/api/hello' \
--header 'Content-Type: application/json' \
--data-raw '{
	"id":"123",
	"name":"asd",
	"city":"sao paulo",
	"country":"brazil"
}'

#Invalid request 2.

curl --location --request GET 'http://localhost:8080/api/hello' \
--header 'Content-Type: application/json' 

#Valid Request 1.
curl --location --request POST 'http://localhost:8080/api/hello' \
--header 'Content-Type: application/json' \
--header 'auth-key: 12345' \
--data-raw '{
	"id":"123",
	"name":"asd",
	"city":"sao paulo",
	"country":"brazil"
}'

# valid request 2.":
curl --location --request GET 'http://localhost:8080/api/hello' \
--header 'Content-Type: application/json' \
--header 'auth-key: 12345'

# ################################################################
#1. Open the Settings --> Build-Execution-Deployment --> Compiler

    and enable the Make Project Automatically.

2. Then press ctrl+shift+A and search for the registry. In the registry, make the following configuration enabled.

compiler.automake.allow.when.app.running

3. Restart the IDE.

ref:https://dzone.com/articles/spring-boot-application-live-reload-hot-swap-with
# ###########################################3
