package com.xworkz.darara1.things;
import com.xworkz.darara1.things.Education;
public class JobSeeker {
	private String name;
	private String address;
	private long contactNumber;
	private String qualification;
	private String experience;
	private int salary;
	private Education education;
	public JobSeeker()
	{
		System.out.println("no-arguments");
	}
	public JobSeeker(String name, String address, long contactNumber, String qualification, String experience,
			int salary, Education education) {
		System.out.println("All-arguments");
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.qualification = qualification;
		this.experience = experience;
		this.salary = salary;
		this.education = education;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
}