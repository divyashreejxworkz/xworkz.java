package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Product;

public class CustomerRunner {
	public static void main(String[] args) {
		Product p=new Product();
		p.setProductName("TV");
		p.setPrice(50000);
		p.setModelName("LED");
		p.setShopName("Swastik");
		String productName=p.getProductName();
		int price=p.getPrice();
		String modelName=p.getModelName();
		String shopName=p.getShopName();
		System.out.println("ProductName:"+p.getProductName());
		System.out.println("price:"+p.getPrice());
		System.out.println("ModelName:"+p.getModelName());
		System.out.println("Shop name:"+p.getShopName());
		}
}
