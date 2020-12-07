package com.xworkz.util;

import com.xworkz.cartoon.Cartoons;

public class CartoonsUtil {
	public static void main(String[] args) {
		Cartoons cartoon = new Cartoons();
		cartoon.setEpisodes("all");
		cartoon.setName("mr.Bean");
		System.out.println(cartoon.getEpisodes() + " " + cartoon.getName());
		System.out.println(cartoon.date);
		
		
		
		}

}
