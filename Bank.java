package com.xworkz.darara1.things;

public class Bank {
	private String name;
	private String address;
	private String place;
	private Payment payment;
	private Account account;
	public Bank() {
		System.out.println("no-arguments");
	}
	public Bank(String name, String address, String place, Payment payment, Account account) {
		System.out.println("All-arguments");
		this.name = name;
		this.address = address;
		this.place = place;
		this.payment = payment;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
