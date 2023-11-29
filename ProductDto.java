package com.xworkz.product.dto;

public class ProductDto {

	private String name;
	private int price;
	private String typeOf;
	private String shopName;
	private float discount;

	public ProductDto() {
		System.out.println("No-argument constructor");
	}

	public ProductDto(String name, int price, String typeOf, String shopName, float discount) {
		this.name = name;
		this.price = price;
		this.typeOf = typeOf;
		this.shopName = shopName;
		this.discount = discount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOf() {
		return typeOf;
	}

	public void setTypeOf(String typeOf) {
		this.typeOf = typeOf;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {// object of class methods and toString() we are using//represent the object
		System.out.println("toString method from shoes");
		return "Product:(name:" + name + " " + "price:" + price + " " + "typeOf:" + typeOf + " " + "shopName:"
				+ shopName + " " + "discount:" + discount + ")";
	}

	@Override
	public int hashCode() {// hashCode() method//
		System.out.println("hash code method");
		int number = (10 % 2) - 5 * 3;
		return number;
	}

	@Override
	public boolean equals(Object obj) {// equals() method
		System.out.println("This is equals method");
		return true;

	}
}
