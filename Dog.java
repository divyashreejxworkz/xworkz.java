package com.xworkz.shopping.things;


public class Dog extends Animal{
	public Dog() {
		super("loosy",5000);
		System.out.println("This is dirived class costructor ");
		System.out.println(super.getName());
		System.out.println(super.getPetPrice());
		System.out.println("Constructor end");
		}
	}

	
		