package com.xworkz.xworkzbean.earphone;

public class EarPhone {
	
	private String brand;
	private double price;
	
	public EarPhone(String brand, double price){
		this.brand = brand;
		this.price = price;
		
		System.out.println("earphone object is created");
		System.out.println("arg 1 is printed " + this.brand);
		System.out.println("arg 2 is printed " + this.price);
	}
	// properties to define functionalities
		private int maxVol = 30;
		private int minVol = 0;
		private int currentVol;
		private boolean connected;
		
		
		public boolean isconnected() {
			return connected;
			}
			
		
		public void onOrOff()
		{
			System.out.println("inside onOrOff()");
			
			if(isconnected()== false) 
			{
				this.connected = true;
				System.out.println("earphone is connected");
			}
			else if(isconnected()==true)
			{
				this.connected = false;
				System.out.println("earphone disconnected");
			}
			
		}

		public void increaseVolume()
		{
			System.out.println("inside increaseVolume()");
			if(isconnected()==true)
			{
				if(this.currentVol < this.maxVol) 
				{
                    this.currentVol = this.currentVol+1;
                    System.out.println(" current value is: " + this.currentVol);
				}
				else
				{
					System.out.println("max vol is reached");
				}
			}
			else
			{
				System.out.println("macha earphone disconnected");
			}
			
		}
		
		
		public void decreaseVolume() 
		{
			System.out.println("inside decreaseVolume()");
			if (connected == true)
			{
				if (this.currentVol > this.minVol)
				{
					this.currentVol = this.currentVol - 1;
                }
			}
	                            
		

			if (this.currentVol > this.minVol) 
			{
				if (this.currentVol > this.currentVol - 1);
				System.out.println(" current value is: " + this.currentVol);
			}
			else
			{
				System.out.println("min volume reached");
			}
			}
		
		public String getBrand() { //getter statement
			return brand;
		}

		public double getPrice() {   //getter statement
			return price;
		}
		
		public void setConnected(boolean connected) {
			this.connected = connected;
		}

	
	
	
	

}
