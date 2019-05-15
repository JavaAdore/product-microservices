# product-microservices-dockerizing
Just contains docker-compse.yml and .env file used to run product microservices in docker container, So I can scale , cluster .. etc


# prerequisites
docker & docker-compose are properly installed on your machine

# Steps

#clone 
<a href="https://github.com/JavaAdore/product-microservices.git">https://github.com/JavaAdore/product-microservices.git </a> <br/>


cd authorization-server<br/>
then build it by <br/>
mvn clean install docker:removeImage docker:build <br/>
 
cd eureka-server<br/>
then build it by <br/>
mvn clean install docker:removeImage docker:build <br/>

cd product-service<br/>
then build it by <br/>
mvn clean install docker:removeImage docker:build <br/>
 
cd rest-gateway<br/>
then build it by <br/>
mvn clean install docker:removeImage docker:build <br/>
 

cd review-service<br/>
then build it by <br/>
mvn clean install docker:removeImage docker:build <br/>

cd zipkin-server<br/>
then build it by <br/>
mvn clean install docker:removeImage docker:build <br/>



 
#after building all repositories above
configure ports in .env file <br/>

open terminal under root/Administrator user
type 
docker-compose up<br/>
press enter



