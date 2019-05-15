package com.eltaieb.microservice.authorizationserver.converter;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.stereotype.Service;

import com.eltaieb.microservice.authorizationserver.service.model.CustomUserDetails;


@Service
public class CustomJwtAccessTokenConverter extends JwtAccessTokenConverter {
 
	@Value("${config.oauth2.privateKey}")
	private String privateKey;
	
	@Value("${config.oauth2.publicKey}")
	private String publicKey;
	
	@PostConstruct
	public void init()
	{
		super.setSigningKey(privateKey);
		super.setVerifierKey(publicKey);
	}
	
	
    
}