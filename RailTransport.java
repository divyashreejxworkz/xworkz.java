package com.xworkz.shopping.things;

public class RailTransport extends Transport{
	public String place="Mharashtra";
	public int amount=3000;
	public void getTrainDetails() {
		System.out.println("getTrainDetails");
		System.out.println("Train Details:"+place+" "+amount);
	}

}
