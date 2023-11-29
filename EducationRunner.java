package com.xworkz.education.runner;

import com.xworkz.education.abstracts.Education;
import com.xworkz.education.abstractsImplementation.EducationImplementation;
import com.xworkz.educationInfo.EducationInfo;

public class EducationRunner {
	public static void main(String[] args) {
		Education e=new EducationImplementation();
		EducationInfo i = new EducationInfo();
		i.setName("SCE");
		i.setPlace("Banglore");
		i.setTotalStrength(1000);
		String name=i.getName();
		String place=i.getPlace();
		int totalStrength=i.getTotalStrength();
		boolean value=e.onSave(i);
		System.out.println("value:"+value);
	}

}
