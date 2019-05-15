# product-service
small service maintains product data </br>
 
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
 
# AUTHORIZATION_SERVER_IP  =127.0.0.1
# AUTHORIZATION_SERVER_PORT=8888

# EUREKA_SERVER_IP      = 127.0.0.1
# EUREKA_SERVER_PORT    = 8761




# product-service provides the following functionalities
 FullProductInfo getFullProduct(Long productInfo) throws ServiceException;
 
# product-service exposes the following rest services

URL<br/>
http://{serverIp}:{port}/product-info/{productId}
description : Get product with it’s reviews ( you can use 51 or 52 ) as product Id they are inserted for test
method type : GET
header      : locale: en or de
            : Authentication:bearer jwt
Sample success Response
{
   "code": "00",
   "message": "Operation done successfully",
   "content": {
   "productModel": {
   "id": 51,
   "name": "Dell XPS 15-9575",
   "description": "Business Laptop",
   "price": 870
},

"reviews": [
				  {
					"id": 54,
					"content": "did not like it too much",
					"numberOfStars": 4
				  },
				  {
					"id": 55,
					"content": "it works exactly as I expect",
					"numberOfStars": 8
					}]
 }
}

Sample failure response
{
     "code": "20003",
     "message": "No such product",
     "content": null
}

 


# build
mvn clean install 

# build and dockerizing
as root/Administration <br/>
mvn clean install docker:removeImage docker:build

# run
java -jar target/product-service.jar
