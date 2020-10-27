package com.bridgelabz.invoiceservice;

public enum CabRide {

	NORMAL(10.0,1.0,5.0), PREMIUM(15.0,2.0,20.0);

	private double costPerKm;
	private double costPerMin;
	private double minFarePerRide;

	CabRide(double costPerKm, double costPerMin, double minFare) {
		this.costPerKm=costPerKm;
		this.costPerMin=costPerMin;
		this.minFarePerRide=minFare;
	}
	
	public double calCostOfCabRide(Ride ride){
		double rideCost = ride.getDistance()*costPerKm + ride.getTime()* costPerMin;
		return Math.max(rideCost, minFarePerRide);
	}
}
