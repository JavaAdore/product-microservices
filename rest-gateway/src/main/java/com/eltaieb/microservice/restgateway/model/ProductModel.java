package com.eltaieb.microservice.restgateway.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
}
