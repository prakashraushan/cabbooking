package com.udaan.cabbooking.model;

import java.util.Date;

public class Trip {

	private int id;

	private Cab cab;

	private Location startLocation;
	private Location endLocation;

	private Date bookedtime;

	private int riderId;

	private boolean isTripCompleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(Location startLocation) {
		this.startLocation = startLocation;
	}

	public Location getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(Location endLocation) {
		this.endLocation = endLocation;
	}

	public Date getBookedtime() {
		return bookedtime;
	}

	public void setBookedtime(Date bookedtime) {
		this.bookedtime = bookedtime;
	}

	public int getRiderId() {
		return riderId;
	}

	public void setRiderId(int riderId) {
		this.riderId = riderId;
	}

	public boolean isTripCompleted() {
		return isTripCompleted;
	}

	public void setTripCompleted(boolean isTripCompleted) {
		this.isTripCompleted = isTripCompleted;
	}

}
