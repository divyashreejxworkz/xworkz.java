package com.xworkz.shopping.things;

public class Indoor extends Sports {
	public Indoor(){
		super("caram",2,"Banglore","chess");
		System.out.println("This is sub class constructor");
		System.out.println(super.getName());
		System.out.println(super.getTotalPlayers());
		System.out.println(super.getPlace());
		System.out.println(super.getNewSports());
		System.out.println("Constructor end");
	}

}
