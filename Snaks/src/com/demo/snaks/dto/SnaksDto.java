package com.demo.snaks.dto;

public class SnaksDto {

	private int id;
	private String sanksName;
	private String flavor;
	private String taste;
	private int price;
	
	public SnaksDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnaksDto(int id, String sanksName, String flavor, String taste, int price) {
		super();
		this.id = id;
		this.sanksName = sanksName;
		this.flavor = flavor;
		this.taste = taste;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSanksName() {
		return sanksName;
	}

	public void setSanksName(String sanksName) {
		this.sanksName = sanksName;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SnaksDto [id=" + id + ", sanksName=" + sanksName + ", flavor=" + flavor + ", taste=" + taste
				+ ", price=" + price + "]";
	}
	
}
