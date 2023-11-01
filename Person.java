package com.xworkz.shopping.things;

import lombok.experimental.SuperBuilder;

public class Person extends Dancer{
	public Person() {
		super("Divyashree","Brthanatya","Banglore",2);
		System.out.println("This is sub class costructor");
		System.out.println(super.getName());
		System.out.println(super.getWhichType());
		System.out.println(super.getPlace());
		System.out.println(super.getHowManyDncer());
		System.out.println("constructor end");
	}
	}
