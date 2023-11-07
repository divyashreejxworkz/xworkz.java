package com.xworkz.shopping.things;

public class Art {
public String pictureName;
public int price;
protected void getArtDetails(String pictureName, int price) {
	System.out.println("This is getting the art details");
}
protected void getArtDetails(int price,String pictureName) {
	System.out.println("This is getting the art details");
}
protected void getArtDetails(String pictureName, byte price) {
	System.out.println("This is getting the art details");
}
}

