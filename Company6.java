package com.xworkz.darara1.things;

import com.xworkz.darara1.things.Education;

public class Company6 {
	private String name;
	private String address;
	private String qualification;
	private String designation;
	private int salary;
	private Education education;

	public Company6() {
		System.out.println("no-arguments");
	}

	public Company6(String name, String address, String qualification, String designation, int salary,
			Education education) {
		System.out.println("All-arguments");
		this.name = name;
		this.address = address;
		this.qualification = qualification;
		this.designation = designation;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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
