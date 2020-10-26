package com.bridgelabz.invoiceservice;

import java.util.Arrays;

public class InvoiceService {

	private static final double MIN_COST_PER_KM = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5.0;
	private RideRepository rideRepository;

	/**
	 * 
	 * @param distance
	 * @param time
	 * @return fare
	 */
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MIN_COST_PER_KM + time * COST_PER_TIME;
		return Math.max(totalFare, MINIMUM_FARE);
	}

}
