package com.udaan.cabbooking.mgr;

import java.util.List;
import java.util.Map;

import com.udaan.cabbooking.model.Cab;
import com.udaan.cabbooking.model.Driver;
import com.udaan.cabbooking.model.Location;
import com.udaan.cabbooking.model.Rider;
import com.udaan.cabbooking.model.Trip;

public interface IBookingService {

	// TODO implement Factory pattern to pass driver or rider and create appropriate
	// instance
	Driver addDriver(String driverId);

	Rider addRider(String riderId, Location l);

	void addCab(String id, Driver d, Location l);

	void updateCabLocation(long x, long y);

	void updateDriverAvailability(String driverId);

	Cab bookCab(Rider r);

	void bookCab(String userId, Location location);

	List<Trip> fetchHistory(String userId);

	void endTrip(String userId, String driverId);

	Map<String, Driver> fetchDrivers();

}
