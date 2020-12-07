package com.xworkz.doll;

import java.util.Date;

public class Doll {
	
	private String name;
	private double price;
	public Date date = new Date();//creating an object for class type is mandatory
	
	
	
	public Doll() {
		System.out.println("cute things");
	}

	
	     public String getName()  //get is used to return
	     {
	    	return name;
	     }
	     
	     public void setName(String name)//set is used to modify
	     {
	    	 this.name = name;
	    	 
	     }
	     
	     public double getPrice()
	     {
	    	 return price;
	     }
	     
	     public void setPrice(double price)
	     {
	    	 this.price = price;
	     }
}
