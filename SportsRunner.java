package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Indoor;

public class SportsRunner {
	public static void main(String[] args) {
		Indoor i=new Indoor();
		i.setName("caram");
		i.setTotalPlayers(2);
		i.setPlace("banglore");
		i.setNewSports("chess");
		String name=i.getName();
		int totalPlayers=i.getTotalPlayers();
		String place=i.getPlace();
		String newSports=i.getNewSports();
		System.out.println("Name:"+i.getName());
		System.out.println("total players:"+i.getTotalPlayers());
		System.err.println("place:"+i.getPlace());
		System.out.println("new sports:"+i.getNewSports());
		}
}
