package com.xworkz.xworkzapp;

public class IceCream {
	private String type;
	private double cost;
	private String flavour;

	
	public String getType()
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	
	
	public double getCost()
	{
		return cost;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public String getFlavour() {
		return flavour;
	}
	
	public void setFlavour(String flavour)
	
	{
		this.flavour = flavour;
	}
	
	public void healRemedy()
	{
		System.out.println("suggested by dentist");
	}
	
}
