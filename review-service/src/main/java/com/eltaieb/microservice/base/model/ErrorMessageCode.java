package com.eltaieb.microservice.base.model;

public enum ErrorMessageCode {
	
	OPERATION_COMPLETED_SUCCESSFULLY("00","OPERATION_DONE_SUCCESSFULLY"),
	GENERAL_BACKEND_ERROR("15","GENERAL_BACKEND_ERROR"),
	 
;	
	
	private String code;
	private String messageKey;
	
	

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	ErrorMessageCode()
	{
		
	}
	
	ErrorMessageCode(String code)
	{
		this.code= code;
	}
	
	ErrorMessageCode(String code,String messageKey)
	{
		this.code= code;
		this.messageKey = messageKey;
	}
	
	public String getCode() {
		return code;
	}
	
}
