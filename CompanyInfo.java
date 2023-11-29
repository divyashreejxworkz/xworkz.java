package com.xworkz.companyInfo;

public class CompanyInfo {
	private String place;
	private String name;
	private int noOfEmployees;
	public CompanyInfo() {
		System.out.println("No-argument constructor");
	}
	public CompanyInfo(String place, String name, int noOfEmployees) {
		System.out.println("No-argument constructor");
		this.place = place;
		this.name = name;
		this.noOfEmployees = noOfEmployees;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	@Override
	
	public String toString()
	{
		System.out.println("toString() from CompanyInfo");
		return "Building:(place:"+place+" "+"name:"+name+" "+"noOfEmployees:"+noOfEmployees+")";
	}
	@Override
public int hashCode()
{
	System.out.println("hashcode is method ");
	int salary=50000;
	return salary;
}
	@Override
public boolean equals(Object obj) {
	if(this==obj)
		return true;
	return false;
}
}
