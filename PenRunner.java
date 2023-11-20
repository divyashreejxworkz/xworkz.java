package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Pen;

public class PenRunner {
public static void main(String[] args) {
	Pen p = new Pen();
	Pen p1 = new Pen();
	p1.colour="Black";
	System.out.println(" the toString method:"+p.toString());
	System.out.println("getClass method:"+p.getClass());
	System.out.println("hashCode method:"+p.hashCode());
	System.out.println(p.equals(p1));
}
}
