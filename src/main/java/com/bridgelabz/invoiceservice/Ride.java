package com.bridgelabz.invoiceservice;

public class Ride {

	private double distance;
	private int time;
	public final CabRide cabRide;

	public Ride(CabRide ride, double distance, int time) {
		this.cabRide=ride;
		this.distance = distance;
		this.time = time;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
