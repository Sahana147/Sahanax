package com.xworkz.laptop;

public class Laptop {
	private String ramSize;
	private String processor;
	private String systemType;
	
	public Laptop() {
		
	}
	
	public Laptop( String ramSize, String processor,String systemType){
		this.ramSize = ramSize;
		this.processor = processor;
		this.systemType = systemType;
	}
	
	public String getRamSize() {
		return ramSize;
	}
	
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getSystemType() {
		return systemType;
	}
	
	public void setSystemType(String systemType) {
		this.systemType =systemType;
	}
}

