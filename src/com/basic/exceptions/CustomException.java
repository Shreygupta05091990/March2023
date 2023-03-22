package com.basic.exceptions;

public class CustomException implements CustomExceptionInterface{

	@Override
	public void ageOutofRangeException() throws LessThanPermissibleException {
	
		{
			
		throw new LessThanPermissibleException("Age is less than the allowed for the entry ");
		}
		
	}

	public static void main(String[] args) {
		
		
		
		
		
		CustomException ce= new CustomException();
		try {
			ce.ageOutofRangeException();
		} catch (LessThanPermissibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
	}
	
	
	
	

}
