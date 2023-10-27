package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.Company5;

public class Company5Runner {
	public static void main(String args[]) {
		 Company5 c=new  Company5();
		 c.setNumberOfEmployee(700);
		 c.setName("ASPL");
		 c.setPlace("Banglore");
		 int numberOfEmployee=c.getNumberOfEmployee();
		 String name=c.getName();
		 String place=c.getPlace();
		System.out.println("Number of employees:"+c.getNumberOfEmployee()); 
		System.out.println("Name:"+c.getName()); 
		System.out.println("Place:"+c.getPlace()); 
	}

}