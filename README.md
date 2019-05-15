# product-microservices 
simply is a set of microservices to get product with it's reviews for authorized users <br/>
In order to do this using microservice architecture services will be splitted into following components


# <a href="https://github.com/JavaAdore/product-microservices/tree/master/rest-gateway">Rest Gateway</a> :<br/>
Will be only exposed layer into internet it’s responsible to be the single entry point for the solution it will receive all requests ( HTTP), then routes the request into the proper microservice as per routing configuration
In this module Zuul gateway will be used in order to achieve that.

# <a href="https://github.com/JavaAdore/product-microservices/tree/master/authorization-server">authorization-server</a>:
<br/>  will be responsible for user authentication and generates client JWT, and provide public key used to validate this JWT

# <a href="https://github.com/JavaAdore/product-microservices/tree/master/eureka-server">eureka-server</a> :<br/> In order to apply microservice architecture Discovery Server should be their, each microservice will register in self in the discovery server under its name, it has round robin load balancer in order to dispatch coming requests to particular microservice instances 
In this module Eureka Server will be used

#<a href="https://github.com/JavaAdore/product-microservices/tree/master/product-service">product-service</a> :<br/> will maintain the data of the products

#<a href="https://github.com/JavaAdore/product-microservices/tree/master/review-service">review-service</a>
 will maintain the data of the reviews

#<a href="https://github.com/JavaAdore/product-microservices/tree/master/zipkin-server">zipkin-server</a>:<br/>
In order to track the request since it received by the  Rest Gateway until sending back the response to the client, All microservices will use such framework called Spring Cloud Sleuth, this framework shall create a unique identifier to each request ( event request is dispatched or communicated into another microservice through feign client or whatever) and push logs into Zipkin Server which provides a GUI shows informations about requests ( it’s number , response time in milliseconds, failure points if any ..)

#<a href="https://github.com/JavaAdore/product-microservices/tree/master/product-microservices-dockerizing">product-microservices-dockerizing</a>:<br/>
small project contains docker-compose file with .env( for passing environment variables) in order to public all previous products

