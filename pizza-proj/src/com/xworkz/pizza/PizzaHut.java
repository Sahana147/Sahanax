package com.xworkz.pizza;// string package present java.lang- standard r default package available 

public class PizzaHut {
	//instance variables(States or attributes t properties)
	
	public String address;
    public 	String typesOfPizzas;
	public double price;
	
	public PizzaHut() {
		this("jaynagar","pastapizza");
		System.out.println("ending with zero para const");
	}
	public PizzaHut(double price) {
		this();
		System.out.println("inside one para");
		
		System.out.println(price);
		
	}
	
	
	public PizzaHut(String address, String typesOfPizzas) {
		 //System.out.println("inside two para");
		this.address = address;
		this.typesOfPizzas = typesOfPizzas;
		System.out.println("ending two para");
	
	}

}
//contructor recursion  is not not possible bcz of stack overflow
