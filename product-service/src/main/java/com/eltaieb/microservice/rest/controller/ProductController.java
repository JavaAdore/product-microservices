package com.eltaieb.microservice.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.productservice.facade.ProductServiceFacade;
import com.eltaieb.microservice.productservice.service.model.ProductModel;


@RestController()
@RequestMapping("product")
 public class ProductController {
	
	private ProductServiceFacade productServiceFacade;
	
	public ProductController(ProductServiceFacade productServiceFacade)
	{
		this.productServiceFacade=productServiceFacade;
	}
   
	  
	@RequestMapping("/{productId}")
	public ProductModel test(@PathVariable("productId") Long productId) throws ServiceException
	{
		return productServiceFacade.findProduct(productId);
	}
	
	
}



	 

	
	
	
	 
