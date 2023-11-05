package com.xworkz.shopping.things;

public class CarTransport extends Transport{
	public String place="Dehali";
	public int amount=3000;
	public void getCarDetails() {
		System.out.println("getCarDetails");
		System.out.println("Car Details:"+place+" "+amount);
	}

}



