package com.basic.exceptions;

public class LessThanPermissibleException extends Exception {

	String message ;
	public LessThanPermissibleException(String message) {
		
		this.message=message;
		
	}
	
	
}
