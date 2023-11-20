package com.xworkz.shopping.things;

public class Pen{
	public String brand="Cello";
	public String colour="Red";
	public int price=100;
	public String whichType ="Gel pen";
	@override
	public String toString() {
		System.out.println("to String method from pen");
		return "Pen:(brand:"+brand+" "+"colour:"+colour+" "+"price:"+price+" "+"whichType:"+whichType+")";
		}
	@override
	public int hashCode()
	{
	System.out.println("Hash code method");
	return price;
	}
	@override
	public boolean equals(Object obj)
	{
		if(this==obj) 
			return true;
			return false;
		}
	}
