package com.xworkz.life.runner;

import com.xworkz.life.abstractImplementation.LifeAbstractImplementation;
import com.xworkz.life.abstracts.Life;
import com.xworkz.lifeinfo.LifeDto;

public class LifeRunner {
	public static void main(String[] args) {
		Life l=new LifeAbstractImplementation();
		LifeDto d= new LifeDto();
		d.setInsurance("LIC");
		d.setPlace("Banglore");
		d.setAmount(25000);
		boolean save=l.onSave(d);
		System.out.println("save:"+save);
		
	}

}
