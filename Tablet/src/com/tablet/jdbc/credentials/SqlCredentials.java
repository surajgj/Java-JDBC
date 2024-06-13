package com.tablet.jdbc.credentials;

public enum SqlCredentials {

	URL("jdbc:mysql://localhost:3306/tablet"), USER("root"), PASS("Surya@46623");
	
	String getValue;

	private SqlCredentials(String getValue) {
		this.getValue = getValue;
	}

	public String getGetValue() {
		return getValue;
	}
	
	
}
