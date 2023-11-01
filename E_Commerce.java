package com.xworkz.shopping.things;

public class E_Commerce extends Products{
	public E_Commerce()
	{
		super("Air Poads","Flipcart","Boat",true);
		System.out.println("This is subclass constructor");
		System.out.println(super.getProductName());
	System.out.println(super.getWhichShop());
	System.out.println(super.getBrand());
	System.out.println(super.isOnline());
	System.out.println("Constructor end");
	}

}
