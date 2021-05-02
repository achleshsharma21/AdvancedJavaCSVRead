package com.nagarro.learning.AdvancedJava;

import java.util.List;

public class FlightView {
public void viewFlights(List<FlightModel> flightList)
{
	if(flightList.size()!=0) {
	System.out.println("\n \t\t ***** FLIGHT INFORMATION *****");
	for(FlightModel f:flightList)
	{
		System.out.println("Flight Number: "+f.getFlightNum());
		System.out.println("Departure Location: "+f.getDepLocation());
		System.out.println("Arrival Location: "+f.getArrLocation());
		System.out.println("Date: "+f.getValidDate());
		System.out.println("Fare: "+f.getFlightFare());
		System.out.println("Duration: "+f.getFlightDuration());
		System.out.println("*******************************");
	}
}
	else
	{
		System.out.println("No Matches Found...");
	}
}
}