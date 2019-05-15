package com.eltaieb.microservice.userservice.service.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class ReviewModel implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
		
	private String content;
	
	private Integer numberOfStars;
	
	
	
 	
}
