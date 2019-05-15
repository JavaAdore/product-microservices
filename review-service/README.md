# review-service
small service maintains product reviews </br>
Mostly used by 
<a href="https://github.com/JavaAdore/product-microservices/tree/master/product-service"> product-service </a> <br/>

# prerequisites
eureka server should be up and run<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/eureka-server">https://github.com/JavaAdore/product-microservices/tree/master/eureka-server</a> <br/>

authorization server should be up and run<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/authorization-server">https://github.com/JavaAdore/product-microservices/tree/master/authorization-server</a> <br/>

zipkin server nice be up and run so you can track the request<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/zipkin-server">https://github.com/JavaAdore/product-microservices/tree/master/zipkin-server</a> <br/> 



Postgres DB <br/>
 
 

environment variables should be added

# ZIPKIN_SERVER_IP = 127.0.0.1
127.0.0.1 the ip of machine where zipkin server runs
# SLEUTH_LOGGING_LEVEL=info
level of sleuth logging

 


# POSTGRES_SERVER_IP  					= 127.0.0.1
# POSTGRES_SERVER_PORT					= 5432
# POSTGRES_DBNAME     					= postgres     
# POSTGRES_PASS	      					= postgres
# POSTGRES_DBNAME			 			= postgres 
 
# AUTHORIZATION_SERVER_IP  			= 127.0.0.1
# AUTHORIZATION_SERVER_PORT			= 8888

# EUREKA_SERVER_IP      				= 127.0.0.1
# EUREKA_SERVER_PORT    				= 8761
 



# review-service provides the following functionalities

 FullProductInfo getFullProduct(Long productInfo) throws ServiceException;
 
 
# product-service exposes the following rest services


URL<br/>
http://{serverIp}:{port}/review/{productId}
description : Get product reviews( you can use 51 or 52 ) as product Id they are inserted for test
method type : GET
header      : locale: en or de
            : Authentication:bearer jwt

Sample Success Response<br/>
{
"code": "00",
"message": "Operation done successfully",
"content": [
  {
	"id": 50,
	"content": "It’s a great entry level gaming laptop",
	"numberOfStars": 9
	},
	  {
	"id": 51,
	"content": "I love this laptop, It is highly up-gradable",
	"numberOfStars": 8
	}
 ]
}

 
# build
mvn clean install 

# build and dockerizing
as root/Administration <br/>
mvn clean install docker:removeImage docker:build


# run
java -jar target/review-service.jar
