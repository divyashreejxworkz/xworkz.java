package com.xworkz.shopping.things;

public class Remote {
	public String name="Remote Car";
	public String shop="Amazone";
	public String place="Banglore";
	public int price=2000;
	public boolean isFreeDelivery=false;
	public String whichType="Shell";
	@override
	public String toString()
	{
		System.out.println("toString method from in pen");
		return "Pen:(name:"+name+" "+"shop:"+shop+" "+"place:"+place+" "+"price:"+price+" "+"isFreeDelivery:"+isFreeDelivery+" "+"whichType:"+whichType+")"; 
	}
	@override
	public int hashCode()
	{
		System.out.println("Hash code method");
		int amount=(2000%10)+3*7;
		return amount;
	}
	@override 
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		return false;
	}
	}


