package com.qa.controlflow;

public class Car extends Vehicle
{ 
	Car(int year, String model, String make , String color , boolean supercar, boolean sedan ) 
	{
		super(year, model, make);
		
	}
	private boolean superCar; 
	private String color;
	private boolean sedan;
	
	public boolean isSuperCar()
	{
		return superCar;
	}
	public void setSuperCar(boolean superCar) 
	{
		this.superCar = superCar;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public boolean isSedan() 
	{
		return sedan;
	}
	public void setSedan(boolean sedan) 
	{
		this.sedan = sedan;
	}
	
}	
		
