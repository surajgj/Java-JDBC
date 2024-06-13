package com.jdbc.mobile.credentials;

public enum SqlCredentials {

	URL("jdbc:mysql://localhost:3306/mobile"), USER("root"), PASS("Surya@46623"); 

	String value;
	
	private SqlCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
