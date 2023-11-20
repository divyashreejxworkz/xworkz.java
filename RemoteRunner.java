package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Remote;

public class RemoteRunner {
public static void main(String[] args) {
	Remote r = new Remote();
	Remote r1 = new Remote();
	r1.price=10000;
	System.out.println(" the toString method:"+r.toString());
	System.out.println("getClass method:"+r.getClass());
	System.out.println("hashCode method:"+r.hashCode());
	System.out.println(r.equals(r1));
}
}

