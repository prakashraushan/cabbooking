package com.udaan.cabbooking.model;

public abstract class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {

	}

	User(String n) {
		this.name = n;
	}

}
