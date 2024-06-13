package com.demo.bike.dto;

public class BikeDto {

	private int id;
	private String brand;
	private int cc;
	private int topSpeed;
	private int price;
	
	public BikeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BikeDto(int id, String brand, int cc, int topSpeed, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.cc = cc;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BikeDto [id=" + id + ", brand=" + brand + ", cc=" + cc + ", topSpeed=" + topSpeed + ", price=" + price
				+ "]";
	}
	
}
