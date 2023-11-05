package com.xworkz.shopping.things;

public class Nonveg extends Food{
	protected String foodName;
	protected int price;
	protected int numberOfPlates;
	public void getFoodDetails() {
	super.name="Biriyani";
	super.place="banglore";
	super.shopName="Gowdru mane";
	System.out.println("foodname:"+super.name);
	System.out.println("place:"+super.place);
	System.out.println("shop name:"+super.shopName);
	}
 }
