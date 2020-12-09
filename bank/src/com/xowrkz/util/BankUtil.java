package com.xowrkz.util;

import com.xowrkz.bank.SBI;

public class BankUtil {
	public static void main(String[] args) {

		
		SBI sbi = new SBI("rajajinagar", 3456756789l);
		sbi.setAddress("rajajinagar");
		sbi.setMoneyBalance(3456756789l);
		System.out.println(sbi.getAddress() + " "+ sbi.getMoneyBalance());
	}

}
