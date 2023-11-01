package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.E_Commerce;

public class ProductsRunner {
	public static void main(String[] args) {
		E_Commerce e=new E_Commerce();
		e.setProductName("air poads");
		e.setWhichShop("Flipcart");
		e.setBrand("Boat");
		e.setOnline(true);
		String productName=e.getProductName();
		String whichShop=e.getWhichShop();
		String brand=e.getBrand();
		boolean isOnline=e.isOnline();
		System.out.println("product name:"+e.getProductName());
		System.out.println("which shop:"+e.getWhichShop());
		System.out.println("brand:"+e.getBrand());
		System.out.println("is online:"+e.isOnline());
	}
}
