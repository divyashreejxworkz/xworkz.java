package com.xworkz.educationInfo;

public class EducationInfo {
	private String name;
	private String place;
	private int totalStrength;
	public EducationInfo() {
		System.out.println("No-Arguments");
	}
	public EducationInfo(String name, String place, int totalStrength) {
		System.out.println("All-Arguments");
		this.name = name;
		this.place = place;
		this.totalStrength = totalStrength;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getTotalStrength() {
		return totalStrength;
	}
	public void setTotalStrength(int totalStrength) {
		this.totalStrength = totalStrength;
	}
	public String toString()
	{
		System.out.println("toString() method from EducationInfo");
		return "Education:(name:"+name+" "+" place:"+place+""+"totalStrength:"+totalStrength+")";
		}
	public int hashCode()
	{
		System.out.println("hashCode() is method ");
		int total=500-100;
		return total; 
	}
	
	public boolean equals(Object obj)
	{
	System.out.println("equals() is a method");
	return true;
	}

}
