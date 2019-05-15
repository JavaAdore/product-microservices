package com.eltaieb.microservice.userservice.facade;

import java.util.List;

import com.eltaieb.microservice.userservice.service.model.ReviewModel;

public interface ReviewServiceFacade {

	List<ReviewModel> findReviewModel(Long productId);

  
	 
} 
