package com.basic.exceptions;

public class CustomUncheckedException extends RuntimeException{
	
	String message;
	public CustomUncheckedException(String message) {
		
		super(message);
		
	}
	

}
