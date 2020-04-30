package com.udaan.cabbooking.mgrimpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.udaan.cabbooking.mgr.IBookingService;
import com.udaan.cabbooking.model.Cab;
import com.udaan.cabbooking.model.Driver;
import com.udaan.cabbooking.model.Location;
import com.udaan.cabbooking.model.Rider;
import com.udaan.cabbooking.model.Trip;

@Service
public class BookingServiceImpl implements IBookingService {

	Map<String, Driver> drivers;
	Map<String, Rider> riders;

	Map<String, Cab> cabs;

	Map<String, List<Trip>> trips;

	Integer maxDistance = 5;

	public BookingServiceImpl() {
		drivers = new HashMap<>();
		riders = new HashMap<>();
		cabs = new HashMap<>();

	}

	@Override
	public Driver addDriver(String driverId) {

		if (!drivers.containsKey(driverId)) {
			drivers.put(driverId, new Driver(driverId, driverId));
			return drivers.get(driverId);
		}

		return null;

	}

	@Override
	public void addCab(String id, Driver d, Location l) {
		if (!cabs.containsKey(id)) {
			cabs.put(id, new Cab(id, d, l));
		}

	}

	@Override
	public Cab bookCab(Rider r) {

		Location riderLoction = r.getLocation();

		boolean isCabAvailable = false;

		Cab cabResult = null;

		System.out.println("inside impl of bookcab");

		Iterator iterator = this.cabs.entrySet().iterator();
		while (iterator.hasNext()) {

			Map.Entry<String, Cab> mapEntry = (Map.Entry) iterator.next();

			String id = mapEntry.getKey();

			Cab c = mapEntry.getValue();

			c.getLocation();

			double distance = riderLoction.fetchDistance(c.getLocation());

			long dist = Math.round((distance) * 100000.0 / 100000.0);

			System.out.println("cab number is " + c.getId());

			System.out.println("distance is" + dist);

			// Instead of adding in list just taking one cab within distance limit and
			// returning
			if (dist <= maxDistance) {
				cabResult = c;
				isCabAvailable = true;
				break;
			}
		}

		if (isCabAvailable) {
			return cabResult;
		} else {
			return null;
		}

	}

	@Override
	public Rider addRider(String riderId, Location l) {
		if (!riders.containsKey(riderId)) {
			riders.put(riderId, new Rider(riderId, riderId, l));
			return riders.get(riderId);
		}

		return null;

	}

	@Override
	public void updateCabLocation(long x, long y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDriverAvailability(String driverId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bookCab(String userId, Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Trip> fetchHistory(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endTrip(String userId, String driverId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Driver> fetchDrivers() {
		// TODO Auto-generated method stub
		return this.drivers;
	}

}
