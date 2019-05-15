package com.eltaieb.microservice.userservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.eltaieb.microservice.userservice.dao.JpaProductReviewDao;
import com.eltaieb.microservice.userservice.entity.ProductReviewEntity;
import com.eltaieb.microservice.userservice.service.api.ReviewService;
import com.eltaieb.microservice.userservice.service.model.ReviewModel;

@Service
public class ReviewServiceBean implements ReviewService {

	private final JpaProductReviewDao jpaProductReviewDao;
	private final ModelMapper modelMapper;
	
	
	public ReviewServiceBean(JpaProductReviewDao jpaProductReviewDao,ModelMapper modelMapper) {
		super();
		this.jpaProductReviewDao = jpaProductReviewDao;
		this.modelMapper=modelMapper;
	}



	@Override
	public List<ReviewModel> findReviewModel(Long productId) {
		List<ProductReviewEntity> productReviewEntityList =  jpaProductReviewDao.getProductReviews(productId);;
		return productReviewEntityList.stream().map((pre)-> modelMapper.map(pre, ReviewModel.class)).collect(Collectors.toList());
	}

 

}
