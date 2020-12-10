package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Ganga;
import com.xworkz.xworkzapp.river.Kaveri;
import com.xworkz.xworkzapp.river.Yamuna;

public class RiverUtil {
	public static void main(String[] args) {
		
		Ganga g = new Ganga();
		g.setBirthPlace("Gangothri");
		g.setRiverType("long");
		g.setEndPlace("BayofBengal");
		System.out.println(g.getBirthPlace() + "\n" + g.getRiverType() + "\n" + g.getEndPlace());
		
		Kaveri k = new Kaveri();
		k.setBirthPlace("kodagu ");
		k.setRiverType("medium ");
		k.setEndPlace("mysore ");
		System.out.println(k.getBirthPlace() + "\n" + k.getRiverType() + "\n" + k.getEndPlace());
		
		
		Yamuna y = new Yamuna();
		y.setBirthPlace("jammu ");
		y.setRiverType("Short");
		y.setEndPlace("kanyakumari");
		System.out.println(y.getBirthPlace() + "\n" + y.getRiverType() + "\n" + y.getEndPlace());
	}

}
