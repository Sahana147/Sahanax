
package com.xworkz.xworkzapp.cosmetic.dto;

import com.xworkz.xworkzapp.cosmetic.constants.CosmeticType;
import com.xworkz.xworkzapp.cosmetic.constants.Shades;

public class CosmeticsDTO {

	private String brand;
	private double price;
	private CosmeticType cosmeticType;
	private Shades shades;
	private int quantity;

	public CosmeticsDTO() {

	}

	public CosmeticsDTO(String brand, double price, CosmeticType cosmeticType, Shades shades, int quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.cosmeticType = cosmeticType;
		this.shades = shades;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}

	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	public Shades getShades() {
		return shades;
	}

	public void setShades(Shades shades) {
		this.shades = shades;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "CosmeticsDTO[brand =" + brand + " , price = " + price + ", cosmeticType = " + cosmeticType
				+ ", shades = " + shades + ", quantity = " + quantity + "]";
	}
     
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CosmeticsDTO) {
			CosmeticsDTO casting = (CosmeticsDTO) obj;
			if (this.brand != null && this.cosmeticType != null) {

				if (this.brand.equals(casting.getBrand()) && this.cosmeticType.equals(casting.getCosmeticType()))
					;
				{
					System.out.println("CosmeticsDTO is equal");
					return true;
				}
			}
		}

		else
			System.out.println("CosmeticDTO is not equal");
		return false;
	}
	
	
	public int compareTo(CosmeticsDTO arg) {
		
		if (this.quantity < arg.quantity) {
			return -1;
		}
		if (this.quantity == arg.quantity) {
			return 0;
		}
		if (this.quantity > arg.quantity)
			return 1;
		return 0;
	}

}
