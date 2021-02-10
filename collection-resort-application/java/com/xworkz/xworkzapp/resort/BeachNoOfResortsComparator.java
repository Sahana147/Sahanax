package com.xworkz.xworkzapp.resort;

import java.util.Comparator;


import com.xworkz.xworkzapp.resort.dto.BeachDTO;

public class BeachNoOfResortsComparator  implements Comparator<BeachDTO> {
	
	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		System.out.println(o1 +"   "+o2);
		Integer o1No=o1.getNoOfResorts();
		Integer o2No=o2.getNoOfResorts();
		return o2No.compareTo(o1No);
	}

}
