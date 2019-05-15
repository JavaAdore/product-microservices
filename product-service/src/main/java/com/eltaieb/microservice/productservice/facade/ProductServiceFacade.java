package com.eltaieb.microservice.productservice.facade;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.productservice.model.FullProductInfo;
import com.eltaieb.microservice.productservice.service.model.ProductModel;

public interface ProductServiceFacade {


	FullProductInfo getFullProduct(Long productInfo) throws ServiceException;

	ProductModel findProduct(Long productId) throws ServiceException;

  
	 
} 
