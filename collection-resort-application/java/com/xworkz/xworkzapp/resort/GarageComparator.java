package com.xworkz.xworkzapp.resort;

import java.util.Comparator;

public class GarageComparator  implements Comparator<String>{
	@Override
	public int compare(String arg0, String arg1) {
		
		return arg1.compareTo(arg0);
	}

	

}
