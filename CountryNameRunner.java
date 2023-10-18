package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.CountryName;

public class CountryNameRunner {
	public static void main(String args[]) {
		CountryName countryname=new CountryName();
		countryname.getName("India");
		countryname.getName("Astrelia");
		countryname.getName("Africa");
		countryname.getName("USA");
		countryname.getCountry();
		countryname.upDate("India","Bharatha");
		countryname.getCountry();
		countryname.delete("India");
		countryname.getCountry();
	}

}
