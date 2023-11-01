package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Dog;

public class AnimalRunner {
	public static void main(String[] args) {
	Dog d=new Dog();
	d.setName("Loosy");
	d.setPetPrice(5000);
	String name=d.getName();
	System.out.println("name:"+d.getName());
	int petPrice=d.getPetPrice();
	System.out.println("pet Price:"+d.getPetPrice());
	}

}
