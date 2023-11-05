package com.xworkz.shopping.things;

public class Product extends Customer {
	public Product() {
		super("TV",50000,"LED","SWASTIC");
		System.out.println("this is sub class constructor");
		System.out.println(super.getProductName());
		System.out.println(super.getPrice());
		System.out.println(super.getModelName());
		System.out.println(super.getShopName());
		System.out.println("constructor end");
	}
	}
