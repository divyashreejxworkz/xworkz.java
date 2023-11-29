package com.xworkz.house.runner;

import com.xworkz.house.abstractImplementation.HouseImplementation;
import com.xworkz.house.abstracts.House;
import com.xworkz.houseInfo.HouseInfo;

public class HouseRunner {
	public static void main(String[] args) {
		House h=new HouseImplementation();
		HouseInfo i = new HouseInfo();
		i.setPlace("Banglore");
		i.setRent(10000);
		i.setDuration("11months");
		String place=i.getPlace();
		int rent=i.getRent();
		String duration=i.getDuration();
		boolean value=h.onSave(i);
		System.out.println("value:"+value);
				}
}
