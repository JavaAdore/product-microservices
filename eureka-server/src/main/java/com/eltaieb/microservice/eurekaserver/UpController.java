package com.eltaieb.microservice.eurekaserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// just sample controle helps to me to ensure that eureka server is up and run 
// I made docker compose file start services one by one .. as long almost all services relies on eureka
// I just want to ensure that euerka is up and run .. then start other services
@RestController()
@RequestMapping("/")
public class UpController {

	
	@RequestMapping(path = "/up")
	public String applicationIsUp()
	{
		return "application is up";
	}
}
