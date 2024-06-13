package com.demo.liquor.dto;

public class LiquorDto {

	private int id;
	private String brand;
	private String ml;
	private double alcohol;
	private int price;
	
	public LiquorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LiquorDto(int id, String brand, String ml, double alcohol, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.ml = ml;
		this.alcohol = alcohol;
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

	public String getMl() {
		return ml;
	}

	public void setMl(String ml) {
		this.ml = ml;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LiquorDto [id=" + id + ", brand=" + brand + ", ml=" + ml + ", alcohol=" + alcohol + ", price=" + price
				+ "]";
	}
	
}
