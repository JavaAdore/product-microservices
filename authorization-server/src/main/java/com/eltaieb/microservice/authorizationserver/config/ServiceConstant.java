package com.eltaieb.microservice.authorizationserver.config;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class ServiceConstant {

	@Value("${OAUTH2_CLIENT_ID}")
	private String clientId;

	@Value("${OAUTH2_SECRET}")
	private String secret;
	
	public final static String PUBLIC_USER_ROLE_CODE="PUBLIC_USER";

	public static final String FACEBOOK_DEFAULT_DATE_FORMAT = "MM/dd/yyyy";
	
	public static final long VERIFICATION_EMAIL_EXPIRY_AMOUNT=1;
	
	public static final TemporalUnit VERIFICATION_EMAIL_EXPIRY_UNIT=ChronoUnit.WEEKS;

	public static final long MIN_DURATION_IN_MINUTES_BETWEEN_VERIFICATION_TOKEN_SEND_EMAIL = 5;

	public static final long MAX_USER_VERIFICATION_CODE_LENGTH = 6;


}
