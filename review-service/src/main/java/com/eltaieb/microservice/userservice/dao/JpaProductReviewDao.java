package com.eltaieb.microservice.userservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eltaieb.microservice.userservice.entity.ProductReviewEntity;

public interface JpaProductReviewDao extends CrudRepository<ProductReviewEntity, Long>{

	
	@Query("select pr from "+ProductReviewEntity.ENTITY_NAME+" pr where pr.productId = :#{#productId}  ")
	List<ProductReviewEntity> getProductReviews(@Param("productId") Long productId);
}
