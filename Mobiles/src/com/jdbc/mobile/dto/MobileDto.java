package com.jdbc.mobile.dto;

public class MobileDto {
	
	private int id;
	private String brand;
	private int storage;
	private int ram;
	private String processor;
	private int price;
	
	public MobileDto(int id, String brand, int storage, int ram, String processor, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.storage = storage;
		this.ram = ram;
		this.processor = processor;
		this.price = price;
	}
	
	public MobileDto() {
		super();
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
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MobileDto [id=" + id + ", brand=" + brand + ", storage=" + storage + ", ram=" + ram + ", processor="
				+ processor + ", price=" + price + "]";
	}
}
