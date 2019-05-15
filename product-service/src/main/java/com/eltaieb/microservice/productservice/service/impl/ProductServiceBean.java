package com.eltaieb.microservice.productservice.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eltaieb.microservice.productservice.dao.JpaProductDao;
import com.eltaieb.microservice.productservice.entity.ProductEntity;
import com.eltaieb.microservice.productservice.service.api.ProductService;

@Service
public class ProductServiceBean implements ProductService {

	
	private final JpaProductDao jpaProductDao;
	
	
	public ProductServiceBean(JpaProductDao jpaProductDao) {
		super();
		this.jpaProductDao = jpaProductDao;
	}


	@Override
	public boolean isProductExist(Long productId) {
		return jpaProductDao.existsById(productId);
	}


	@Override
	public Optional<ProductEntity> findProductEntityById(Long id) {
		return jpaProductDao.findById(id);
	}

 

}
