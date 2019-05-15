# Micro Services Eureka Server (Discovery Server)
will be responsible for communication across different microservices (clients)
Each microservice will register itself in this server then it will be available for other microservices



The following environment variables should be presented
 
# EUREKA_SERVER_PORT=8761
8761 is the default port of eureka-server, but it could be replaced with any unused port


# build
mvn clean install 

# build and dockerizing
as root/Administration <br/>
mvn clean install docker:removeImage docker:build
# run
java -jar target/eureka-server.jar

# browse
<a href="http://127.0.0.1:8761">http://127.0.0.1:8761</a>



