package com.xworkz.industry;

public class Industry {
	
	public String type;
	public String area;
	public int noOfWorker;
	
	public Industry(String type, String area, int noOfWorker) {
	
		this.area = area;
		this.noOfWorker = noOfWorker;
		this.type = type;
		
	}
	
	public String production()
	{
		return "producing";
	}
	
}
