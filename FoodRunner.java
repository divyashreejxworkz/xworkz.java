package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Biriyani;

public class FoodRunner extends Biriyani {
	public static void main(String[] args) {
		Biriyani b=new Biriyani();
		b.getFoodDetails();
		b.getNonvegInfo();
		FoodRunner f=new FoodRunner();
		System.out.println("access property");
		System.out.println(f);
	}

}
