package com.example.demo.exception2;

import org.springframework.stereotype.Component;

@Component
public class ControllerException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errmessage;
	
	public ControllerException(){}
	public ControllerException(String errmessage) {
		super();
		this.errmessage = errmessage;
	}

	public String getErrmessage() {
		return errmessage;
	}
	
	public void setErrmessage(String errmessage) {
		this.errmessage = errmessage;
	}
}
