package com.demo.laptop.dto;

public class LaptopDto {

	private int id;
	private String name;
	private String processor;
	private int ram;
	private int storage;
	private double price;
	
	public LaptopDto(int id, String name, String processor, int ram, int storage, double price) {
		super();
		this.id = id;
		this.name = name;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}
	
	public LaptopDto() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "LaptopDto [id=" + id + ", name=" + name + ", processor=" + processor + ", ram=" + ram + ", storage="
				+ storage + ", price=" + price + "]";
	}
	
	
}
