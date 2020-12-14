package com.xworkz.xworkzbean.util;

import com.xworkz.xworkzbean.speaker.Speaker;


public class SpeakerUtil {
	public static void main(String[] args) {
		
	Speaker speaker = new Speaker(2000.0 , 16); 
	   {
			//System.out.println(speaker.getBatteryBackupForHours());
			speaker.getBatteryBackupForHours();
			System.out.println(speaker.isconnected());
			
			speaker.onOrOff();
			
			speaker.increaseVolume();
			speaker.increaseVolume();
//			speaker.increaseVolume();
//			speaker.increaseVolume();
//			speaker.increaseVolume();
//			speaker.increaseVolume();
//			speaker.increaseVolume();
			speaker.onOrOff();
			
		}
	}
	

}
