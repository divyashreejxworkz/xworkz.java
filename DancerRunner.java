package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Person;

public class DancerRunner {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Divyashree");
		p.setWhichType("Barthanatya");
		p.setPlace("Banglore");
		p.setHowManyDncer(2);
		String name=p.getName();
		String whichType=p.getWhichType();
		String place=p.getPlace();
		int howManyDancer=p.getHowManyDncer();
		System.out.println("name:"+p.getName());
		System.out.println("which type:"+p.getWhichType());
		System.out.println("place:"+p.getPlace());
		System.out.println("how many dancer:"+p.getHowManyDncer());
	}
}
