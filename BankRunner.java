package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.Bank;
import com.xworkz.darara1.things.FD;
import com.xworkz.darara1.things.Online;
import com.xworkz.darara1.things.Payment;
import com.xworkz.darara1.things.RD;
import com.xworkz.darara1.things.Account;

public class BankRunner {
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.setName("SBI");
		b.setAddress("Dasarahalli");
		b.setPlace("Banglore");
		RD r=new RD();
		r.setPeriod("1Month");
		r.setDate("11/12/23");
		r.setBank("SBI");
		FD f=new FD();
		f.setAmount(15000);
		f.setBank("SBI");
		f.setPerson("Divyashree");
		Payment p=new Payment();
		p.setPersonName("Deepak");
		p.setOffline(false);
		p.setAmount(4500);
		Online o=new Online();
		o.setAmount(3000);
		o.setAddress("Hassan");
		o.setBank("SBI");
		p.setOnline(o);
		Account a=new Account();
		a.setBankAddress("sadashiva nagar");
		a.setAccounNumber(124567777l);
		a.setIfcCode("IFC12345455");
		a.setRd(r);
		a.setFd(f);
		b.setPayment(p);
		b.setAccount(a);
		System.out.println(b.getPayment().getOnline().getAmount());
		System.out.println(b.getAccount().getRd().getPeriod());
		System.out.println(b.getAccount().getFd().getAmount());
	}
}