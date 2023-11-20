package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Toy;

public class ToyRunner {
	public static void main(String[] args) {
		Toy t=new Toy();
		Toy t1=new Toy();
		t1.shop="Flipcart";
		System.out.println("toString method:"+t.toString());
		System.out.println("getClass:"+t.getClass());
		System.out.println("hashCode methode:"+t.hashCode());
		System.out.println(t.equals(t1));
		
	}

}
