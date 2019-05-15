package com.eltaieb.microservice.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.base.model.ServiceResponse;
import com.eltaieb.microservice.base.model.SuccessServiceResponse;
import com.eltaieb.microservice.productservice.facade.ProductServiceFacade;
import com.eltaieb.microservice.productservice.model.FullProductInfo;


@RestController
@RequestMapping("/product-info")
public class ProductInfoController {

	private ProductServiceFacade productServiceFacade;
 	
	
	public ProductInfoController(ProductServiceFacade productServiceFacade) {
		super();
		this.productServiceFacade = productServiceFacade;
 	}



	@RequestMapping(path="/{productId}")
	public ServiceResponse<FullProductInfo> getFullProduct(@PathVariable("productId") Long productInfo) throws ServiceException
	{
		FullProductInfo fullProductInfo =  productServiceFacade.getFullProduct(productInfo);
		return new SuccessServiceResponse<FullProductInfo>(fullProductInfo);
	}
	
}
