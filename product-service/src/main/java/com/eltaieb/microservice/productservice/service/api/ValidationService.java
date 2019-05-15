package com.eltaieb.microservice.productservice.service.api;

import com.eltaieb.microservice.base.exception.ServiceException;

public interface ValidationService {

	void validateFindProductModel(Long productId) throws ServiceException;

 
	 
}
