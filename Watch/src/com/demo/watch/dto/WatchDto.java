package com.demo.watch.dto;

public class WatchDto {

	private int id;
	private String brandName;
	private String type;
	private String strap;
	private double price;
	
	
	public WatchDto(int id, String brandName, String type, String strap, double price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.type = type;
		this.strap = strap;
		this.price = price;
	}
	
	public WatchDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStrap() {
		return strap;
	}

	public void setStrap(String strap) {
		this.strap = strap;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WatchDto [id=" + id + ", brandName=" + brandName + ", type=" + type + ", strap=" + strap + ", price="
				+ price + "]";
	}
	
	
}
