package com.xworkz.util;

import java.util.Scanner;

import com.xworkz.pizza.PizzaHut;

public class PizzaHutUtil {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the address");
		String address = sc.next();
		
		System.out.println("enter the type of pizzas");
		String typeOfPizzas = sc.next();
		
		//System.out.println("enter the price of pizzas");
		//double price = sc.nextDouble();
		
		PizzaHut pizza = new PizzaHut( address, typeOfPizzas);
		System.out.println(pizza.address + " " + pizza.typesOfPizzas);
		
		sc.close();
		
	//PizzaHut pizza = new PizzaHut( 490.0);
	//System.out.println(pizza.address);
		
	}

}
