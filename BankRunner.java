package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Accounts;

public class BankRunner {
	public static void main(String[] args) {
		Accounts a=new Accounts();
		a.setBankName("SBI");
		a.setPersonName("Divyashree");
		a.setAccountNumber(23456777l);
		a.setPlace("Dasarahalli");
		String bankName=a.getBankName();
		String personName=a.getPersonName();
		long accountNumber=a.getAccountNumber();
		String place=a.getPlace();
		System.out.println("bank name:"+a.getBankName());
		System.out.println("Person name:"+a.getPersonName());
		System.out.println("Account Number:"+a.getAccountNumber());
		System.out.println("place:"+a.getPlace());
				}
	}
