package com.demo.bottle.dto;

public class BottleDto {

	private int id;
	private String name;
	private String type;
	private int price;
	public BottleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BottleDto(int id, String name, String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "\n";
	}
	
}
