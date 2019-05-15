package com.eltaieb.microservice.base.aspect;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

 
@Service
@RequestScope
public class SecurityUtilityBean {

	HttpServletRequest request;

	public SecurityUtilityBean(HttpServletRequest request) {
		this.request = request;
	}

	public Locale getRequesterLocale() {
		if (request != null) {
			String localeAsString = request.getHeader("locale");
			if (null != localeAsString) {
				return new Locale(localeAsString);
			}
		}
		return Locale.ENGLISH;
	}
 

}
