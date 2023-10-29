package com.xworkz.darara1.things;

public class FD {
	private int amount;
	private String bank;
	private String person;
	public FD()
	{
		System.out.println("no-arguments");
	}
	public FD(int amount, String bank, String person) {
System.out.println("All-Arguments");
		this.amount = amount;
		this.bank = bank;
		this.person = person;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	

}
