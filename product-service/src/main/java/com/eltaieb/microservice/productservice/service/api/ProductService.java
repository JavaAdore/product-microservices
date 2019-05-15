package com.eltaieb.microservice.productservice.service.api;
import java.util.Optional;

import com.eltaieb.microservice.productservice.entity.ProductEntity;
public interface ProductService {

	boolean isProductExist(Long productId);
	
	Optional<ProductEntity> findProductEntityById(Long id);
 
 
	
	
}
 