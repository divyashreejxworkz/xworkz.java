package com.xworkz.building;

public class BuildingInfo {
	private String place;
	private int amount;
	private String companyName;
	public BuildingInfo() {
		System.out.println("No-argument constructor");
	}

	public BuildingInfo(String place, int amount, String companyName) {
		System.out.println("All-argument constructor");
		this.place = place;
		this.amount = amount;
		this.companyName = companyName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		System.out.println("toString method from BuildingInfo");
		return "BuildingInfo:(place;"+place+" "+" amount:"+amount+""+"companyName:"+companyName+")";
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode method");
		int discount=2500%5;
		return discount;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		return false;
		}

	}
	
	


