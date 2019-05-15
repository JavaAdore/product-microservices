package com.eltaieb.microservice.productservice.service.impl;

import org.springframework.stereotype.Service;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.base.model.ErrorMessageCode;
import com.eltaieb.microservice.productservice.service.api.ProductService;
import com.eltaieb.microservice.productservice.service.api.ValidationService;

@Service
public class ValidationServiceBean implements ValidationService {

	private final ProductService productService;
	
	
	
	public ValidationServiceBean(ProductService productService) {
		super();
		this.productService = productService;
	}

	@Override
	public void validateFindProductModel(Long productId) throws ServiceException {
		 
		validateProductId(productId);
		
		validateProductExistance(productId);
	}

	private void validateProductExistance(Long productId) throws ServiceException {
		boolean exists = productService.isProductExist(productId);	
		if(!exists)
		{
			throw new ServiceException(ErrorMessageCode.NO_SUCH_PRODUCT);

		}
	}

	private void validateProductId(Long productId) throws ServiceException {

		if(null == productId || productId<0)
		{
			throw new ServiceException(ErrorMessageCode.INVALID_PRODUCT_ID);
		}
		
	}
	
	 

}
