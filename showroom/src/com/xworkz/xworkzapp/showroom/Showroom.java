 package com.xworkz.xworkzapp.showroom;

import com.xworkz.xworkzapp.dto.CarDTO;

public class Showroom {
	
	public CarDTO  CarDTO[] = new CarDTO[4]; //showroom has many cars
	public int currentIndex;
	
     public  Showroom()
     {
    	 System.out.println("showroom object created");
     }
     
     
    public boolean addCars(CarDTO  carDTO)
    	 {
    	  boolean added = false;  //there is one way to access array element that is for loop;
    	  if(carDTO != null)
    	  {
    		  System.out.println(this.currentIndex + "current index\n");
    		  this.CarDTO[currentIndex] = carDTO;
    		  this.currentIndex++;
    		  added = true;
    		  return added;
    	  }
    	  else if(carDTO == null)
    	  {
    		  System.out.println("car dto is not added");
    	  }
    	  
    	  added = false;
    	  return added;
    	}
    
    public CarDTO[] displayCars() //method having CarDTO return statement
    {
    	CarDTO[] carDTOs = null; //default value of non primitive data type is null cz,CarDTO[] is of array type
    	System.out.println("showing cars details");
    	for(int i=0; i< CarDTO.length; i++)
    	{
    		if(CarDTO[i] != null)
    		{
    			System.out.println(CarDTO[i].getName() + " "+ CarDTO[i].getModelName() + " "+ CarDTO[i].getPrice());
    			carDTOs = CarDTO;
    	    }
    		else if(CarDTO[i] == null)
    		{
    			System.out.println("\ncar not available");
    		}
    	}
    	
    	System.out.println("Showing cars details");
    	return carDTOs;
    }
    
    public void deleteCarName(String name)
    
    {
    	System.out.println("start with deleting the car by name");
    	for(int i=0; i<CarDTO.length; i++)
    		if(CarDTO[i] != null)
    		{
    			 if(CarDTO[i].getName().equals(name))
    	     {
    	    	CarDTO[i] = null;
    	    	
    	     }
    	   }
    }
    
    
    
    public void UpdatedCarPriceByName(String name1, double price)
     {
	 System.out.println("start updating");
	 for(int i=0; i<CarDTO.length; i++)
	 {
		 if(CarDTO[i] != null)
		 {
			 if(CarDTO[i].getName().equals(name1))
			 {
				 CarDTO[i].setPrice(price);
				 //CarDTO[i].setName(name1);
				 System.out.println("price updated/n");
				 System.out.println(CarDTO[i].getName() + " " + CarDTO[i].getPrice());
			 }
			 
			 
		 }
		 
	 }
   }


    
   public void addCarByName(String name)   {
    	System.out.println("Start adding the data");
    	for(int i=0; i<CarDTO.length; i++)
    	{
    		if(CarDTO[i] != null)
    		{
    			if(CarDTO[i].getName().equals(name) )
    			{
    				System.out.println("expected name is present");
    			}
    			else
    			{
    				System.out.println("expected name is not present");
    			}
    		}
    		
    		System.out.println(CarDTO[i].getName() + " " + CarDTO[i].getModelName() + " " + CarDTO[i].getPrice());
    	}
    }
 }
//IN ONE CLASS HAVING REFERENCE OF ANOTHER CLASS IS CALLED HAS A RELATIONSHIP
