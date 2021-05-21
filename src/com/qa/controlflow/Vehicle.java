package com.qa.controlflow;

public class Vehicle 
{	
	protected int year; 
	protected String model; 
	protected String make;
	
	
		Vehicle(int year , String model , String make )
		{
			this.make=make;
			this.model=model;
			this.year=year;
			
		}
		public int getYear() 
		{
		return year;
		}
		public void setYear(int year)
		{
		this.year = year;
		}
		public String getModel()
		{
		return model;
		}
		public void setModel(String model) 
		{
		this.model = model;
		}
		public String getMake() {
		return make;
		}
		public void setMake(String make) 
		{
		this.make = make;
		} 
		public static void main(String[] args) 
		{
			Vehicle one = new Vehicle(2010 , "GTR " , "nissian");
			
			
		}
	
}
