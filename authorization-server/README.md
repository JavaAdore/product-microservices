# authorization-server
JWT(Json Web Token) based authorization server to authenticate user and provide public key used across all microservices <br/>
Just for simplicity it relies on in memeory authentication manager with username "user" and password "password" providing role "USER" 

# prerequisites
eureka server should be up and run<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/eureka-server">https://github.com/JavaAdore/product-microservices/tree/master/eureka-server</a> <br/>

zipkin server nice be up and run so you can track the request<br/>
<a href="https://github.com/JavaAdore/product-microservices/tree/master/zipkin-server">https://github.com/JavaAdore/product-microservices/tree/master/zipkin-server</a> <br/> 


 
environment variables should be added

# EUREKA_SERVER_IP      = 127.0.0.1
# EUREKA_SERVER_PORT    = 8761


# ZIPKIN_SERVER_IP = 127.0.0.1
127.0.0.1 the ip of machine where zipkin server runs
# SLEUTH_LOGGING_LEVEL=INFO
level of sleuth logging
 







# Authorization Server exposes the following rest services

URL<br/>
http://{serverIp}:{port}/login/basic<br/>
description  : Login with username and password
method type  : POST
header       : locale: en or de
Content-Type : Application/JSON
sample request<br/>
{
	"userName":"user",
     "password":"password"
}

Sample success Response<br/>
{
 "code": "00",
 "message": "Done successfully",
 "content": {
"access_token":"here is access token",
 "token_type": "bearer",
 "refresh_token":  "here is refresh token",
 "expires_in": 3599,
 "scope": "read write",
 "jti": "626fcbd5-6400-4337-b6a6-c7521298759b"
 }
}


Sample failure response <br/>
{
 "code": "10001",
 "message": "Invalid username or password",
 "content": null
}



# build
mvn clean install 

# build and dockerizing
as root/Administration <br/>
mvn clean install docker:removeImage docker:build

# run
java -jar target/authorization-server.jar
