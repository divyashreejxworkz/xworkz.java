package com.xworkz.shopping.things;

public class Customer {
	private String productName;
	private int price;
	private String modelName;
	private String shopName;
	public Customer(String productName, int price, String modelName, String shopName) {
		this.productName = productName;
		this.price = price;
		this.modelName = modelName;
		this.shopName = shopName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	}
