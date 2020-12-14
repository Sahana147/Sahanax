package com.xworkz.xworkzbean.speaker;

public class Speaker {
	private double price;
	//private static String brandName = "Noise";
	private int batteryBackupForHours;

	public Speaker(double price, int batteryBackupForHours) {
		this.price = price;
		this.batteryBackupForHours = batteryBackupForHours;

		System.out.println("speaker object is created");
		
		System.out.println("arg 1 is " + this.price);
		System.out.println("arg 2 is " + this.batteryBackupForHours);
   }

	// properties to define functionalities
	private int maxVol = 6;
	private int minVol = 0;
	private boolean connected;
	private int currentVol;

	public void onOrOff() {
		System.out.println("inside onOrOff()");

		if(isconnected() == false) {
			this.connected = true;
			System.out.println("speaker is connected");
		} 
		else if (isconnected() == true) {
			this.connected = false;
			System.out.println("speaker disconncted");
		}
	}

	public void increaseVolume() {
		System.out.println("inside increaseVolume()");
		if (connected == true) {
			if (this.currentVol < this.maxVol)

			{
				this.currentVol = this.currentVol + 1;
				System.out.println(this.currentVol);
			} else {
				System.out.println("max vol reached");
			}
		} else {
			System.out.println("dadda speaker is not connected");

		}
	}

	public void decreaseVolume() {
		System.out.println("inside decreaseVolume()");
		if (connected == true) {
			if (this.currentVol > this.minVol)

			{
				this.currentVol = this.currentVol - 1;

			}
		}
                            
	

		if (this.currentVol > this.minVol) {
			if (this.currentVol > this.currentVol - 1);
			System.out.println(" current value is: " + this.currentVol);
		} else {
			System.out.println("min volume reached");
		}

	}

	public boolean isconnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public int getBatteryBackupForHours() { //getter statement
		return batteryBackupForHours;
	}

	public double getPrice() {   //getter statement
		return price;
	}

}
