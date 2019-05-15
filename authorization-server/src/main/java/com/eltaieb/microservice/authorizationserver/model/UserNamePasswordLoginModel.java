package com.eltaieb.microservice.authorizationserver.model;

import lombok.Data;

@Data
public class UserNamePasswordLoginModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

}
