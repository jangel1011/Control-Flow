package com.qa.controlflow;

public class Garage
{
  
	public static void calculate() 
	{
	
		
	}
	

	public static void main(String[] args) 
	{
		Car a = new Car(2010 , "GTR " , "nissian", "blue ",true , false);
		Car d = new Car(2009 , "supra " , "toyota", "blue ",true , false);
		Car b = new Car(2005, "Sentra" , "nissian" , "blue ",true , false  );
		
		
		System.out.println(a.make + " " + a.model + a.year);
		System.out.println(d.make + " " + d.model + d.year);
		System.out.println(d.make + " " + b.model + " "+ b.year + " " );
		
		
		
				

	}
	
}
