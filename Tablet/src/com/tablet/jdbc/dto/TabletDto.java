package com.tablet.jdbc.dto;

public class TabletDto {

	private int id;
	private String name;
	private int ram;
	private int rom;
	private int price;
	
	public TabletDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TabletDto(int id, String name, int ram, int rom, int price) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.rom = rom;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TabletDto [id=" + id + ", name=" + name + ", ram=" + ram + ", rom=" + rom + ", price=" + price + "]";
	}
	
	
	
}
