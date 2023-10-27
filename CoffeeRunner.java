package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.Coffee;

public class CoffeeRunner {
	public static void main(String args[]) {
		Coffee coffee=new Coffee();
		coffee.setBranchName("KAAMATH");
		String branchName=coffee.getBranchName();
		coffee.setFlovers("Black");
		String flovers=coffee.getFlovers();
		coffee.setPrice(60);
		int price=coffee.getPrice();
		coffee.setPlace("Banglore");
		String place=coffee.getPlace();
		coffee.setQuantity("KAAMATH");
		String quantity=coffee.getQuantity();
		System.out.println(" branchName:"+coffee.getBranchName());
		System.out.println(" Flovers:"+coffee.getFlovers());
		System.out.println(" Price:"+coffee.getPrice());
		System.out.println(" Place:"+coffee.getPlace());
		System.out.println(" Quantity:"+coffee.getQuantity());
	}

}

	

