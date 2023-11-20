package com.xworkz.shopping.things;

public class Toy {
	public String name="Cactus Talking toy";
	public String shop="Amazone";
	public String place="Banglore";
	public int price=500;
	public boolean isFreeDelivery=true;
	@override
	public String toString()
	{
		System.out.println("toString method from in pen");
		return "Pen:(name:"+name+" "+"shop:"+shop+" "+"place:"+place+" "+"price:"+price+" "+"isFreeDelivery:"+isFreeDelivery+")"; 
	}
	@override
	public int hashCode()
	{
		System.out.println("Hash code method");
		int amount=(500-56)+3*7;
		return amount;
	}
	@override 
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		return false;
	}
	}
