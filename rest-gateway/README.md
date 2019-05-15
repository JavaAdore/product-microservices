# rest-gateway
Act as a single entry application and responsible for dispatching the requests to other micro services
this is the only port which is exposed for public network and accepts requests from internet


# prerequisites
eureka server should be up and run<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/eureka-server">https://github.com/JavaAdore/product-microservices/tree/master/eureka-server</a> <br/>

# rest-gateway service currently routes to the following services

http://PRODUCT_SERVER_IP:8080/<a href="https://github.com/JavaAdore/product-microservices/tree/master/authorization-server">authorization-server</a>/login/basic <br/> details about /login/basic could be found <a href="https://github.com/JavaAdore/product-microservices/tree/master/authorization-server">here</a>
<br/>




http://PRODUCT_SERVER_IP:8080/<a href="https://github.com/JavaAdore/product-microservices/tree/master/product-service">product-server</a>/product-info/{productId} <br/> details about /product-info/{productId} could be found <a href="https://github.com/JavaAdore/product-microservices/tree/master/product-service">here</a>
<br/>


environment variables should be added

# REST_GATEWAY_PORT  = 8080

# EUREKA_SERVER_IP   = 127.0.0.1

# EUREKA_SERVER_PORT = 8761


 
# build
mvn clean install 

# build and dockerizing
as root/Administration <br/>
mvn clean install docker:removeImage docker:build


# run
java -jar target/rest-gateway.jar
