package com.qa.controlflow;

public class Motorcycle2 
{
	private boolean quat;
	private String type; 
	private Boolean trikes;
	public boolean isQuat() 
	{
		return quat;
	}
	public void setQuat(boolean quat) {
		this.quat = quat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getTrikes() {
		return trikes;
	}
	public void setTrikes(Boolean trikes) {
		this.trikes = trikes;
	} 
	Motorcycle2(int year , String model, String make )
	{
		Motorcycle2 a = new Motorcycle2(year, make, make);
		
		
				
	}
}
