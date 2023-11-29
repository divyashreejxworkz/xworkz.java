package com.xworkz.houseInfo;

public class HouseInfo {
	private String place;
	private int rent;
	private String duration;
	public HouseInfo() {
		System.out.println("No-Argument constructor");
	}
	public HouseInfo(String place, int rent, String duration) {
		System.out.println("All-Argument constructor");
		this.place = place;
		this.rent = rent;
		this.duration = duration;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	
public String toString()
{
	System.out.println("toString is method");
	return "House:(place:"+place+""+"rent:"+rent+""+"duration:"+duration+")";
}
	@Override
public int hashCode()
{
	System.out.println("hasCode is method");
	int amount=10000;
	return amount;
}
	@Override
public boolean equals(Object obj) {
	if(this==obj) 
		return true;
		return false;
	}
	
}
	


