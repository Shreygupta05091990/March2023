package com.Interface;



public class ImpleAgeInterface implements AgeInterface {
	
	
	

	public static void main(String[] args) {
		
		ImpleAgeInterface ia = new ImpleAgeInterface();
		ia.updateAge();

	}

	@Override
	public void updateAge() {
		
		System.out.println("The updated age value is :- " + i );
		
	}

}
