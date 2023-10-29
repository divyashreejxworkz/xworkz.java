package com.xworkz.darara1.things;

public class Education {
	private String qualification;
	private String place;
	private String passedOut;
	private String personName;
	private String dateOfBirth;
	public Education()
	{
		System.out.println("no-Arguments");
	}
	public Education(String qualification, String place, String passedOut, String personName, String dateOfBirth) {
		System.out.println("All-Arguments");
		this.qualification = qualification;
		this.place = place;
		this.passedOut = passedOut;
		this.personName = personName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPassedOut() {
		return passedOut;
	}
	public void setPassedOut(String passedOut) {
		this.passedOut = passedOut;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
