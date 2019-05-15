package com.eltaieb.microservice.restgateway.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class FullProductInfo {

	private ProductModel productModel;
	
	private List<ReviewModel> reviews;

	public FullProductInfo(ProductModel productModel, List<ReviewModel> reviews) {
		super();
		this.productModel = productModel;
		this.reviews = reviews;
	}
	
	
	
}
