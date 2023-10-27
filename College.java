package com.xworkz.darara1.things;

public class College {
	public String name;
	public String place;
	public int totalStudents;
	public byte totalClassRooms;
	public College()
	{
		System.out.println("This is default constructor");
	}
	public College(String name,String place,int totalStudents,byte totalClassRooms) {
		System.out.println("this is parameterized constructor");
		this.name=name;
		this.place=place;
		this.totalStudents=totalStudents;
		this.totalClassRooms=totalClassRooms;
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.totalStudents);
		System.out.println(this.totalClassRooms);
	}

}


}
