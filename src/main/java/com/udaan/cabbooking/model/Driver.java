package com.udaan.cabbooking.model;

public class Driver extends User {

	private String id;
	private boolean isAvailable;

	public Driver(String name, String driverId) {
		super(name);
		this.id = driverId;

	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
