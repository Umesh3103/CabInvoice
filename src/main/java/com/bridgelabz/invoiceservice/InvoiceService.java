package com.bridgelabz.invoiceservice;

import java.util.Arrays;

public class InvoiceService {

	enum type {
		NORMAL, PREMIUM
	}

	private RideRepository rideRepository;

	public void setRideRepository(RideRepository rideRepository) {
		this.rideRepository=rideRepository;
	}

	/**
	 * 
	 * @param rides
	 * @return total fare, number of rides, average fare
	 */
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides)
			totalFare += ride.cabRide.calCostOfCabRide(ride);
		return new InvoiceSummary(rides.length, totalFare);
	}

	/**
	 * 
	 * @param userId
	 * @param rides
	 */
	public void addRides(String userId, Ride[] rides) {
		rideRepository.addRides(userId, rides);
	}

	/**
	 * 
	 * @param userId
	 * @return rides
	 */
	public InvoiceSummary getInvoiceSummary(String userId) {
		return this.calculateFare(rideRepository.getRides(userId));
	}

}
