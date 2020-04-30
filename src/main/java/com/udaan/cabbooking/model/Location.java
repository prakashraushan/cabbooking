package com.udaan.cabbooking.model;

public class Location {

	private long x;
	private long y;

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}

	public Location(long xloc, long yloc) {
		this.x = xloc;
		this.y = yloc;
	}

	public void updateLocation(long updatedx, long updatedy) {
		x = updatedx;
		y = updatedy;
	}

	public double fetchDistance(Location l2) {

		return Math.sqrt(Math.pow(x - l2.getX(), 2) + Math.pow(y - l2.getY(), 2) * 1.0);
	}

	public double fetchDistance(Location l1, Location l2) {

		return Math.sqrt(Math.pow(l2.getX() - l1.getX(), 2) + Math.pow(l2.getY() - l1.getY(), 2) * 1.0);
	}

}
