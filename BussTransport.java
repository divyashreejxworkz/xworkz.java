package com.xworkz.shopping.things;

public class BussTransport extends Transport{
	public String place="chanai";
	public int amount=2000;
	public void getBussDetails() {
		System.out.println("getBussDetails");
		System.out.println("Buss Details:"+place+" "+amount);
	}
	}
