package com.eltaieb.microservice.productservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = ProductEntity.TABLE_NAME)
@Entity(name = ProductEntity.ENTITY_NAME)
public class ProductEntity {

	public final static String TABLE_NAME = "product";
	public final static String ENTITY_NAME = "Product";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_pk_seq")
	@SequenceGenerator(name="product_pk_seq" , sequenceName="product_pk_seq",allocationSize=1)
	private Long id;

	
	@Column(name="name_en")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private BigDecimal price;
	
	
}
