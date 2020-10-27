package com.bridgelabz.invoiceservice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {

	Ride[] rides= null;
	InvoiceService invoiceService = null;
	RideRepository rideRepository=null;
	private InvoiceSummary expectedInvoiceSummary;

	@Before
	public void setUp() throws Exception {
		invoiceService = new InvoiceService();
		rideRepository = new RideRepository();
		invoiceService.setRideRepository(rideRepository);
		rides = new Ride[]{ 
				new Ride(CabRide.NORMAL,2.0, 5),
				new Ride(CabRide.PREMIUM,0.1, 1) 
				};
		expectedInvoiceSummary = new InvoiceSummary(2, 45.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		InvoiceSummary summary = invoiceService.calculateFare(rides);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}

	@Test
	public void givenUserIdAndRidesPremium_ShouldReturnInvoiceSummary() {
		String userId = "abc";
		invoiceService.addRides(userId, rides);
		InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
}
