package com.eltaieb.microservice.productservice.feign;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.eltaieb.microservice.productservice.model.ReviewModel;
@Component 
public class ReviewFeignClientFallBack implements ReviewFeignClient{

	@Override
	public List<ReviewModel> getProductReviews(Long productId) {
		List<ReviewModel> reviews = new ArrayList<>();
		return reviews;
	}

}
