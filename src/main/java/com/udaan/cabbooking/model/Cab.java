package com.udaan.cabbooking.model;

public class Cab extends Vehicle {

	private String id;
	private String name;
	private Driver driver;

	private Rider rider;

	public Cab() {
		super();
	}

	public Cab(String cabId, Driver d, Location l) {
		super(l);
		this.id = cabId;
		this.driver = d;

	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Rider getRider() {
		return rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

}
