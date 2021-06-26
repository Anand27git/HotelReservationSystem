package com.bridgelab.hotelReservationmangementSystem;

import org.junit.Test;
import java.util.ArrayList;
import org.junit.Before;

public class HotelReservationTest {

	ArrayList<Hotel> hotelList = new ArrayList<>();
	Hotel hotel1 = new Hotel("LakeWood", 110);
	Hotel hotel2 = new Hotel("Bridgewood", 160);
	Hotel hotel3 = new Hotel("Ridgewood.", 220);
	HotelReservation hotelReservation = null;

	@Before
	public void initialize() {
		hotelReservation = new HotelReservation();
	}

	@Test
	public void addthehotels() {
		hotelList.add(hotel1);
		hotelList.add(hotel2);
		hotelList.add(hotel3);
	}

}
