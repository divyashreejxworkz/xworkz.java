package com.xworkz.shopping.things;

public class Craft {
public String whichType;
public int totalCraft;
void getCraftDetails(String whichType,int totalCraft) {
	System.out.println("This is Craft Details");
}
void getCraftDetails(String whichType,byte totalCraft) {
	System.out.println("This is Craft Details");
}
void getCraftDetails(int totalCraft,String whichType) {
	System.out.println("This is Craft Details");
}
}
