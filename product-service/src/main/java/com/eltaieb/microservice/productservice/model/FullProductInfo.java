package com.eltaieb.microservice.productservice.model;

import java.util.List;

import com.eltaieb.microservice.productservice.service.model.ProductModel;

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
