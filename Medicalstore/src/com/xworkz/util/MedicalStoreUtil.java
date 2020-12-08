package com.xworkz.util;

import com.xworkz.Medicalstore.MedicalStore;

public class MedicalStoreUtil {
	
	public static void main(String[] args) {
		MedicalStore m = new MedicalStore();
		m.setAddress("kuvempunagar");
		m.setName("med-plus");
		m.settypeOfMedicine("corona");
		System.out.println(m.getAddress() + " " + m.getName() + " " + m.gettypeOfMedicine());
		
	}

}
