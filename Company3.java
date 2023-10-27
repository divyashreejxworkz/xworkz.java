package com.xworkz.darara1.driver;

public class Company3 {
	//instance varible
	public int numberOfEmployee;
	public String name;
	public String place;
	//constructor overloading/parameterized constructor
	public Company3(int numberOfEmployee,String name,String place) {
		this.numberOfEmployee= numberOfEmployee;
		this.name=name;
		this.place=place;
		System.out.println("numberOfEmployee:"+this.numberOfEmployee+"name:"+this.name+"place:"+this.place);
	}		
}


