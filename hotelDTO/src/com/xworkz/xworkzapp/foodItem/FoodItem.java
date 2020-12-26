package com.xworkz.xworkzapp.foodItem;

import com.xworkz.xworkzapp.hotelDTO.HotelDTO;

public class FoodItem {
	
	public HotelDTO foodItem[] = new  HotelDTO[10];
	
	public  int currentIndex;
	
	public FoodItem()
	{
		System.out.println("Hotel object is created");
	}
	
	
	public void addHotelDetails(HotelDTO dto, int currentIndex)
	{
		System.out.println("adding hotel details");
		this.currentIndex = currentIndex; 
		System.out.println("added all details");
	
	}
	
  public void showHotelDetailsByLocation()
  {
	 // HotelDTO[] hotelDTOs = null; 
  	  System.out.println("showing hotel details");
  	  
  	for(int i=0; i<foodItem.length; i++)
  	{
  		if(foodItem != null){
  			System.out.println(foodItem[i].getName() + " " + foodItem[i].getLocation() + " " + foodItem[i].getFoodItems());
  		
  		}
  		
  			else if(foodItem[i] == null)
    		{
    			System.out.println("\food item is  not available");
    		}
    	}
    	
    	System.out.println("Showing food item details");
    	
    }
  			
 }

	
	 
	
	
	
	
	
	
		    
		    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
