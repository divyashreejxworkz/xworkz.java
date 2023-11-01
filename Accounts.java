package com.xworkz.shopping.things;

public class Accounts extends Bank {
public Accounts()
{
	super("SBI","Divyashree",23456777l,"Dasarahalli");
	System.out.println(super.getBankName());
	System.out.println(super.getPersonName());
	System.out.println(super.getAccountNumber());
	System.out.println(super.getPlace());
	System.out.println("Constructor end");
	}
}
