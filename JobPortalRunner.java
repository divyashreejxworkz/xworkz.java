package com.xworkz.darara1.driver;
import com.xworkz.darara1.things.Company6;
import com.xworkz.darara1.things.Education;
import com.xworkz.darara1.things.JobPortal;
import com.xworkz.darara1.things.JobSeeker;
import com.xworkz.darara1.things.Linkdin;
import com.xworkz.darara1.things.Naukri;
public class JobPortalRunner {
	public static void main(String args[]) {
		JobPortal j=new JobPortal();
		j.setPortalName("Naukri");
		j.setPlace("Banglore");
		j.setJobType("IT");
		Education e=new Education();
		e.setQualification("BE");
		e.setPlace("Banglore");
		e.setPassedOut("2020th");
		e.setPersonName("Divyashree");
		e.setDateOfBirth("4/4/96");
		Company6 c=new Company6();
		c.setName("Divyashree");
		c.setAddress("Nagarabhavi");
		c.setQualification("BE");
		c.setDesignation("Engineer");
		c.setSalary(2500);
		c.setEducation(e);
		JobSeeker s=new JobSeeker();
		s.setName("Divyashree");
		s.setAddress("Banglore");
		s.setContactNumber(9834567246l);
		s.setQualification("BE");
		s.setExperience("2years");
		s.setSalary(23000);
		s.setEducation(e);
		Naukri n=new Naukri();
		n.setCompanyName("google");
		n.setDesignation("Senior Developer");
		n.setWhichType("IT");
		n.setCompany6(c);
		n.setJobSeeker(s);
		Linkdin l=new Linkdin();
		l.setCompanyName("Micro soft");
		l.setDesignation("Senior Developer");
		l.setWhichType("IT");
		l.setCompany6(c);
		l.setJobSeeker(s);
		j.setNaukri(n);
		j.setLinkdin(l);
		System.out.println(j.getNaukri().getCompany6().getName());
		System.out.println(j.getNaukri().getJobSeeker().getAddress());
		System.out.println(j.getNaukri().getCompany6().getEducation().getQualification());
		System.out.println(j.getNaukri().getJobSeeker().getEducation().getPersonName());
		System.out.println(j.getLinkdin().getCompany6().getName());
		System.out.println(j.getLinkdin().getJobSeeker().getAddress());
		System.out.println(j.getLinkdin().getCompany6().getEducation().getPassedOut());
		System.out.println(j.getLinkdin().getJobSeeker().getEducation().getDateOfBirth());
		}
}
