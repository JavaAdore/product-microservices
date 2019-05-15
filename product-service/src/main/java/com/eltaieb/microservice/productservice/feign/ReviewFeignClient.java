package com.eltaieb.microservice.productservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eltaieb.microservice.base.feignclient.config.ContentExtractorFeignConfiuration;
import com.eltaieb.microservice.productservice.model.ReviewModel;

 
@FeignClient(name="REVIEW-SERVICE", configuration =ContentExtractorFeignConfiuration.class ,fallback = ReviewFeignClientFallBack.class   )
 
public interface ReviewFeignClient {

	
	@RequestMapping("review/{productId}")
	public List<ReviewModel> getProductReviews(@PathVariable("productId") Long productId);
}
