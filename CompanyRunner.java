package com.xworkz.company.runner;

import com.xworkz.company.abstractImplementaion.CompanyImplementation;
import com.xworkz.company.abstracts.Company;
import com.xworkz.companyInfo.CompanyInfo;

public class CompanyRunner {
	public static void main(String[] args) {
		Company c=new CompanyImplementation();
		CompanyInfo i = new CompanyInfo();
	i.setPlace("Google");
	i.setPlace("Banglore");
	i.setNoOfEmployees(500);
	String place=i.getPlace();
	String name=i.getName();
	int noOfEmployees=i.getNoOfEmployees();
	boolean save=c.onSave(i);
	System.out.println("save:"+save);
	}
	
	

}
