package com.xworkz.pizzahut.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "pizza_hut")
public class PizzaHutDTO {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "PIZZA_ID")
	private int pizzaID;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "IS_AVAILABLE")
	private boolean isAvailable;

	@Column(name = "SIZE")
	private String size;

	@Column(name = "TYPE")
	private String type;

	public PizzaHutDTO(String name, String location, double price, boolean isAvailable, String size, String type) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.size = size;
		this.type = type;
	}

}
