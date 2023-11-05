package com.xworkz.shopping.things;

public class Biriyani extends Nonveg{
	protected String whichType;
	protected int price;
	public void getNonvegInfo() {
		super.foodName="Donne Biriyani";
		super.price=500;
		super.numberOfPlates=2;
		System.out.println("food name:"+super.foodName);
		System.out.println("price:"+super.price);
		System.out.println("numberOfPlates:"+super.numberOfPlates);
	}
}