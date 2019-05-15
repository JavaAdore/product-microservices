package com.eltaieb.microservice.productservice.facade;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.productservice.entity.ProductEntity;
import com.eltaieb.microservice.productservice.feign.ReviewFeignClient;
import com.eltaieb.microservice.productservice.model.FullProductInfo;
import com.eltaieb.microservice.productservice.model.ReviewModel;
import com.eltaieb.microservice.productservice.service.api.ProductService;
import com.eltaieb.microservice.productservice.service.api.ValidationService;
import com.eltaieb.microservice.productservice.service.model.ProductModel;
  
@Service 
public class ProductServiceFacadeBean implements ProductServiceFacade {

	
	private final ReviewFeignClient reviewFeignClient;
	private final ValidationService validationService;
	private final ProductService productService;
	private final ModelMapper modelMapper;

	public ProductServiceFacadeBean(ReviewFeignClient reviewFeignClient,
			ValidationService validationService,ProductService productService,
			ModelMapper modelMapper) {
		super();
		this.reviewFeignClient = reviewFeignClient;
		this.validationService=validationService;
		this.productService=productService;
		this.modelMapper=modelMapper;
	}

	@Override
	public ProductModel findProduct(Long productId) throws ServiceException {
		validationService.validateFindProductModel(productId);
		ProductEntity productEntity =  productService.findProductEntityById(productId).get();
		return modelMapper.map(productEntity,ProductModel.class);
	}

	@Override
	public FullProductInfo getFullProduct(Long productId) throws ServiceException {
		ProductModel productModel = findProduct(productId);
		List<ReviewModel> reviews = reviewFeignClient.getProductReviews(productId);
		return new FullProductInfo(productModel, reviews);
		
	}

   
	 

}
