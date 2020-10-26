package com.bridgelabz.invoiceservice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {

	InvoiceService invoiceService=null;

	@Before
	public void setUp(){
		invoiceService = new InvoiceService();
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare(){
		double distance = 2.0;
		int time = 5;
		double fare = invoiceService.calculateFare(distance,time);
		Assert.assertEquals(25, fare,0);
	}

}
