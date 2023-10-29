package com.xworkz.darara1.things;
import com.xworkz.darara1.things.Company6;
import com.xworkz.darara1.things.JobSeeker;
public class Naukri{
	private String companyName;
	private String designation;
	private String whichType;
	private Company6 company6;
	private JobSeeker jobSeeker;
	
	public Naukri()
	{
		System.out.println("no-arguments");
		}

	public Naukri(String companyName, String designation, String whichType, Company6 company6, JobSeeker jobSeeker) {
		System.out.println("All-arguments");
		this.companyName = companyName;
		this.designation = designation;
		this.whichType = whichType;
		this.company6 = company6;
		this.jobSeeker = jobSeeker;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getWhichType() {
		return whichType;
	}

	public void setWhichType(String whichType) {
		this.whichType = whichType;
	}

	public Company6 getCompany6() {
		return company6;
	}

	public void setCompany6(Company6 company6) {
		this.company6 = company6;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	
}

	
	
