package com.xyzcarportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;

	private String make;

	private String model;

	private String registeration;

	private String price;
	
	private Long sellerId;
	
	private String sellStatus;

	public Car() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Car(Integer id, String name, String make, String model, String registeration, String price, Long sellerId,
			String sellStatus) {
		super();
		this.id = id;
		this.name = name;
		this.make = make;
		this.model = model;
		this.registeration = registeration;
		this.price = price;
		this.sellerId = sellerId;
		this.sellStatus = sellStatus;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", make=" + make + ", model=" + model + ", registeration="
				+ registeration + ", price=" + price + ", sellerId=" + sellerId + ", sellStatus=" + sellStatus + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegisteration() {
		return registeration;
	}

	public void setRegisteration(String registeration) {
		this.registeration = registeration;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellStatus() {
		return sellStatus;
	}

	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}
	
	

}
