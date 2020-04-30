package com.udaan.cabbooking.model;

public class Rider extends User {

	public Rider() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Location location;
	private String uId;

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Rider(String id, String name, Location l) {
		super(name);
		this.uId = id;
		this.location = l;

	}

	public void RequestCab(Location l) {

	}

	public void fetchTrip(int userId) {

	}
}
