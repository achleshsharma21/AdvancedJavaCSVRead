package com.nagarro.learning.AdvancedJava;

import java.util.Date;

public class FlightModel {
	
	public String flightNum;
	public String depLocation;
	public String arrLocation;
	public Date validDate;
	public String flightTime;
	public int flightFare;
	public String seatAvail;
	public String classType;
	public String flightDuration;
	
	public FlightModel()
	{
	}
	
	public FlightModel(String flightNum, String depLocation, String arrLocation, Date validDate, String flightTime,
		int flightFare, String seatAvail, String classType, String flightDuration) {
		super();
		this.flightNum = flightNum;
		this.depLocation = depLocation;
		this.arrLocation = arrLocation;
		this.validDate = validDate;
		this.flightTime = flightTime;
		this.flightFare = flightFare;
		this.seatAvail = seatAvail;
		this.classType = classType;
		this.flightDuration = flightDuration;
	}
	
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getDepLocation() {
		return depLocation;
	}
	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}
	public String getArrLocation() {
		return arrLocation;
	}
	public void setArrLocation(String arrLocation) {
		this.arrLocation = arrLocation;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public int getFlightFare() {
		return flightFare;
	}
	public void setFlightFare(String flightFare) {
		this.flightFare = Integer.parseInt(flightFare);
	}
	public String getSeatAvail() {
		return seatAvail;
	}
	public void setSeatAvail(String seatAvail) {
		this.seatAvail = seatAvail;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightNum =" + flightNum + ", depLocation=" + depLocation + ", arrLocation=" + arrLocation
				+ ", validDate=" + validDate + ", flightTime=" + flightTime + ", flightFare=" + flightFare
				+ ", seatAvail=" + seatAvail + ", classType=" + classType + ", flightDuration=" + flightDuration + "]";
	}
	
}
