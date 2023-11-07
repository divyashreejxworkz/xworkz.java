package com.xworkz.shopping.things;
@override
public class Paper extends Craft{
	public void getCraftDetails(String whichType,int totalCraft) {
		System.out.println("The paper is a craft");
	}
	public void getCraftDetails(String whichType,byte totalCraft) {
		System.out.println("The paper is a craft");
	}
	public void getCraftDetails(int totalCraft,String whichType) {
		System.out.println("The paper is a craft");
	}
}
