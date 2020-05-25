package com.devops.bpichincha.devoptest.exceptions;

public class InvalidMethodRequest extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String message;
	

	public InvalidMethodRequest(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
