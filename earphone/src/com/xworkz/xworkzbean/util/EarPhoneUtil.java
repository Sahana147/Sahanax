package com.xworkz.xworkzbean.util;

import com.xworkz.xworkzbean.earphone.EarPhone;

public class EarPhoneUtil {
	public static void main(String[] args) {
		
		EarPhone ear = new EarPhone("sony" , 1236.0);
		
		{
			
			ear.getBrand();
			System.out.println(ear.isconnected());
			
			ear.onOrOff();
			
			ear.increaseVolume();
			ear.increaseVolume();
			ear.increaseVolume();
//			ear.increaseVolume();
//			ear.increaseVolume();
//			ear.increaseVolume();
//			ear.increaseVolume();
			ear.onOrOff();
			
		}
	}
	
		
	}


