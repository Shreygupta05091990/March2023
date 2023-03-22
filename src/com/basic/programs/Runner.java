package com.basic.programs;


class Bank{
	
	public Number InterestRate() {
		
		return 12;
	}
}
class HDFC extends Bank{
	
public Integer InterestRate() {
		
		return 10;
	}
	
}

class HDFC_Lakhimpur extends HDFC{
	
public Integer InterestRate() {
		
		return 15;
	}
	
}


public class Runner {

	
	public static void main(String[] args) {
	   
		Bank bank = new Bank();
		int  Bank_rate=(int)bank.InterestRate() ;
		System.out.println("The rate of Interest is "+ Bank_rate );

		HDFC hdfc= new HDFC();//Object of HDFC bank gets created 
		int  hdfc_rate=hdfc.InterestRate() ;
		System.out.println("The rate of Interest is "+ hdfc_rate );
		
		Bank b = new HDFC();// Object of HDFC Bank gets created   ---Explanation
		/* Here , IDE suggests Interest rate() from Bank Class with 'b', but at run time this  method is being 
		  overridden by same method in HDFC class . 
		*/ 
		
		int  Hdfc_rate =(int)b.InterestRate();
		System.out.println("The rate of Interest is "+ Hdfc_rate );
	    
	
		Bank HDFC_Lakhimpur1= new HDFC_Lakhimpur();
		int  hdfc_rate_Lakhimpur=(int)HDFC_Lakhimpur1.InterestRate() ;
		System.out.println("The rate of Interest is "+ hdfc_rate_Lakhimpur );
		
		
		HDFC a= new HDFC_Lakhimpur();
		int  h1=a.InterestRate() ;
		System.out.println("The rate of Interest is "+ h1 );
		
	}
	
	
	
}