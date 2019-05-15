package com.eltaieb.microservice.userservice.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = ProductReviewEntity.TABLE_NAME)
@Entity(name = ProductReviewEntity.ENTITY_NAME)
public class ProductReviewEntity {

	public final static String TABLE_NAME = "product_review";
	public final static String ENTITY_NAME = "ProductReview";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_review_pk_seq")
	@SequenceGenerator(name="product_review_pk_seq" , sequenceName="product_review_pk_seq",allocationSize=1)
	private Long id;

	
	@Column(name="content")
	private String content;
	
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="number_of_stars")
	private Integer numberOfStars;
	
	
}
