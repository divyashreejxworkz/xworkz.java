package com.xworkz.building.runner;

import com.xworkz.building.BuildingInfo;
import com.xworkz.building.abstractImplementation.BuldingImplementation;
import com.xworkz.building.abstracts.Building;

public class BuildingRunner {
	public static void main(String[] args) {
		Building b=new BuldingImplementation();
		BuildingInfo i=new BuildingInfo();
		i.setPlace("Banglore");
		i.setAmount(200000);
		i.setCompanyName("SSK enterprices");
		String place=i.getPlace();
		int amount=i.getAmount();
		String companyName=i.getCompanyName();
		boolean save=b.onSave(i);
		System.out.println("save:"+save);
		}
}
