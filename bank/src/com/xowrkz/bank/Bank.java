package com.xowrkz.bank;

public class Bank {

	private String address;
	private long moneyBalance;
	
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	 public Bank(String address, long moneyBalance){
	 this.address =address;
	 this.moneyBalance=moneyBalance;
	 }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMoneyBalance() {
		return moneyBalance;
	}

	public void setMoneyBalance(long moneyBalance) {
		this.moneyBalance = moneyBalance;
	}

}
