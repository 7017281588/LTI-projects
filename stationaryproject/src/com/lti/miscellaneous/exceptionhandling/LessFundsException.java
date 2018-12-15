package com.lti.miscellaneous.exceptionhandling;

public class LessFundsException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LessFundsException(String message) {
		super();
		this.message = message;
	}
	
	
}
