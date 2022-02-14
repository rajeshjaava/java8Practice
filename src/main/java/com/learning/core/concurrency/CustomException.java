package com.learning.core.concurrency;

public class CustomException extends RuntimeException {
	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	CustomException(String message){
		this.message=message;
		
	}

}
