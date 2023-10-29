package com.xworkz.darara1.things;


public class Payment {
	private String personName;
	private boolean offline;
	private int amount;
	private Online online;
	public Payment() {
		System.out.println("no-arguments");
	}
	public Payment(String personName, boolean offline, int amount,Online online) {
		System.out.println("All-Arguments");
		this.personName = personName;
		this.offline = offline;
		this.amount = amount;
		this.online=online;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public boolean offline() {
		return offline;
	}
	public void setOffline(boolean offline) {
		this.offline = offline;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Online getOnline() {
		return online;
	}
	public void setOnline(Online online) {
		this.online = online;
	}
	
	

}
