package com.example.demo.exception2;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String errormessage;

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}	
	
	public BusinessException(){};
	public BusinessException(String errormessage) {
		super();
		this.errormessage = errormessage;
	}
}
