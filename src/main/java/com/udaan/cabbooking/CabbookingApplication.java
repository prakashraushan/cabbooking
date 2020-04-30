package com.udaan.cabbooking;

import java.util.Iterator;
import java.util.Map;

import com.udaan.cabbooking.mgr.IBookingService;
import com.udaan.cabbooking.mgrimpl.BookingServiceImpl;
import com.udaan.cabbooking.model.Cab;
import com.udaan.cabbooking.model.Driver;
import com.udaan.cabbooking.model.Location;
import com.udaan.cabbooking.model.Rider;

public class CabbookingApplication {

	public static void main(String[] args) {

		System.out.println("Welcome");

		IBookingService bookingService = new BookingServiceImpl();

		Driver d = bookingService.addDriver("Driver01");
		bookingService.addCab("1", d, new Location(50, 20));

		Driver d2 = bookingService.addDriver("Driver02");
		bookingService.addCab("2", d2, new Location(10, 22));

		Driver d3 = bookingService.addDriver("Driver03");
		bookingService.addCab("3", d3, new Location(30, 50));

		Map<String, Driver> drivers = bookingService.fetchDrivers();

		Iterator iterator = drivers.entrySet().iterator();

		while (iterator.hasNext()) {

			Map.Entry<String, Driver> mapEntry = (Map.Entry) iterator.next();

			String id = mapEntry.getKey();

			System.out.println(id);
		}

		Rider r = bookingService.addRider("rider01", new Location(10, 19));

		Cab bookedCab = bookingService.bookCab(r);

		if (bookedCab != null) {
			System.out.println("booked cab is " + bookedCab.getId());

		} else {
			System.out.println("No cabs available around please try again later!!");

		}

	}

}
