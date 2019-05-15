package com.eltaieb.microservice.base.model;

public enum ErrorMessageCode {

	OPERATION_COMPLETED_SUCCESSFULLY("00", "OPERATION_DONE_SUCCESSFULLY"),
	GENERAL_BACKEND_ERROR("15", "GENERAL_BACKEND_ERROR"),
	INVALID_USER_NAME_OR_PASSWORD("10001", "INVALID_USER_NAME_OR_PASSWORD"),
	AUTHENTICATION_ERROR("10002", "AUTHENTICATION_ERROR")

	;

	final private String code;
	final private String messageKey;

	public String getMessageKey() {
		return messageKey;
	}

	ErrorMessageCode(String code, String messageKey) {
		this.code = code;
		this.messageKey = messageKey;
	}

	public String getCode() {
		return code;
	}

}
