package com.udaan.cabbooking.model;

public abstract class Vehicle {

	Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	Vehicle() {

	}

	Vehicle(Location l) {
		this.location = l;
	}

}
