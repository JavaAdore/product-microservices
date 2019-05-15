package com.eltaieb.microservice.productservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.eltaieb.microservice.productservice.entity.ProductEntity;

public interface JpaProductDao  extends CrudRepository<ProductEntity, Long>   {

}
