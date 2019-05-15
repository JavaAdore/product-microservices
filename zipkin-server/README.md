# zipkin-server
Centralized server to monitor requests and communication across microservices, feeded by sleuth <br/>
Through zikpen & sleuth adminstrator can track the request since it comes from the client across all microservices and service to service communication untill response is delivered back to the client<br/>
So in case of error admin can determine where the failure is.


# prerequisites
eureka server should be up and run<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/eureka-server">https://github.com/JavaAdore/product-microservices/tree/master/eureka-server</a> <br/>



The following environment variables should be presented
# ZIPKIN_SERVER_PORT = 9411


# build
mvn clean install 

# build and dockerizing
as root/Administration <br/>
mvn clean install docker:removeImage docker:build

# run
java -jar target/zipkin-server.jar
# browse 
http://127.0.0.1:9411/zipkin/
