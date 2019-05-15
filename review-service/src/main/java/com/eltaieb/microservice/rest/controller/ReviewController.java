package com.eltaieb.microservice.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.base.model.ServiceResponse;
import com.eltaieb.microservice.base.model.SuccessServiceResponse;
import com.eltaieb.microservice.userservice.facade.ReviewServiceFacade;
import com.eltaieb.microservice.userservice.service.model.ReviewModel;


@RestController()
@RequestMapping("review")
 public class ReviewController {
	
	private ReviewServiceFacade reviewServiceFacade;
	
	public ReviewController(ReviewServiceFacade reviewServiceFacade)
	{
		this.reviewServiceFacade=reviewServiceFacade;
	}
   
	  
	@RequestMapping("/{productId}")
	public ServiceResponse<List<ReviewModel>> getProductReviews(@PathVariable("productId") Long productId)
	{
		List<ReviewModel> reviews =  reviewServiceFacade.findReviewModel(productId);
		return new SuccessServiceResponse<List<ReviewModel>>(reviews); 
	}
	
	
}



	 

	
	
	
	 
