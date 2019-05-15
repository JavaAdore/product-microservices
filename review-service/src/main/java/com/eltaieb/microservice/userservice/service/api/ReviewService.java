package com.eltaieb.microservice.userservice.service.api;

import java.util.List;

import com.eltaieb.microservice.userservice.service.model.ReviewModel;

public interface ReviewService {

	List<ReviewModel> findReviewModel(Long productId);

 
 
	
	
}
 