package com.eltaieb.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@EnableAsync
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableResourceServer 
@EnableJpaRepositories 
@PropertySource(value = {"classpath:db.properties"})
public class ReviewServiceApplication {

  
	public static void main(String[] args) {
		
 
		SpringApplication.run(ReviewServiceApplication.class, args);
	}
	 
	 	

	 
	 
}

