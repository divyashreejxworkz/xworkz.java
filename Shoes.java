package com.xworkz.shopping.things;

public class Shoes {
public String brand="Sparx";
public String colour="Black";
public int price=1000;
@override
public String toString() {//object of class methods and toString() we are using
	System.out.println("toString method from shoes");
	return "Shoes:(brand:"+brand+" "+"colour:"+colour+" "+"price:"+price+")";
	}
@override
public int hashCode() {//hashCode() method
	System.out.println("hash code method");
	int number =(1000%2)-5*3;
	return number;
}
public boolean equals(Object obj) {//equals() method
	if(this==obj)
		return true;
	return false;
	}
}
