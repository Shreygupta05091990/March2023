package com.Abstractclass;

public class AbstractClassChild extends  AbstractClasss {

	 int  i =11;
	
	@Override
	public void doPayment() {
		
		System.out.println("Payment done via UPI -->" + i );
		
	}
	
	public static void main(String[] args) {
		
		AbstractClasss abs = new AbstractClassChild() ;
	    abs.doPayment();	
	
	}
	

}
