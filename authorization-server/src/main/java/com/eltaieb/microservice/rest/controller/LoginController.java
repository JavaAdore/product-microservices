package com.eltaieb.microservice.rest.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.authorizationserver.model.UserNamePasswordLoginModel;
import com.eltaieb.microservice.authorizationserver.service.impl.AccessTokenGeneratorBean;
import com.eltaieb.microservice.authorizationserver.service.model.CustomUserDetails;
import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.base.model.ServiceResponse;
import com.eltaieb.microservice.base.model.SuccessServiceResponse;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("login/")
public class LoginController {

	private AccessTokenGeneratorBean accessTokenGenerator;

	private AuthenticationManager authenticationManager;

	public LoginController(AccessTokenGeneratorBean accessTokenGenerator, AuthenticationManager authenticationManager) {
		super();
		this.accessTokenGenerator = accessTokenGenerator;
		this.authenticationManager = authenticationManager;
	}

	@PostMapping("/basic")
	public ServiceResponse<OAuth2AccessToken> login(@RequestBody UserNamePasswordLoginModel userNamePasswordLoginModel)
			throws ServiceException {

		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
				userNamePasswordLoginModel.getUserName(), userNamePasswordLoginModel.getPassword());
		Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		User user = (User) authentication.getPrincipal();
		OAuth2AccessToken oAuth2AccessToken = accessTokenGenerator.generateOAuth2AccessToken(user);

		return new SuccessServiceResponse<OAuth2AccessToken>(oAuth2AccessToken);

	}

}