package com.bridgelab.hotelReservationmangementSystem;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class HotelReservationTest {
	
	Hotel hotel1 = new Hotel("LakeWood", 110);
	HotelReservation hotelReservation = null;

	@Before
	public void initialize() {
		hotelReservation = new HotelReservation();
	}

	@Test
	public void Hotelreservation() {
		boolean welcome = hotelReservation.printWelcome();
		Assert.assertEquals(true, welcome);
	}

}
