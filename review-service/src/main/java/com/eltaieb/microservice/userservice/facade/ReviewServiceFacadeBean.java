package com.eltaieb.microservice.userservice.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.eltaieb.microservice.userservice.service.api.ReviewService;
import com.eltaieb.microservice.userservice.service.model.ReviewModel;

@Service
public class ReviewServiceFacadeBean implements ReviewServiceFacade {

	
	private final ReviewService reviewService;
	
	
	
	
	public ReviewServiceFacadeBean(ReviewService reviewService) {
		super();
		this.reviewService = reviewService;
	}




	@Override
	public List<ReviewModel> findReviewModel(Long productId) {
		
		return reviewService.findReviewModel(productId);
		
		
		 
	}

}
