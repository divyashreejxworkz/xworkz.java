package com.xworkz.darara1.things;
public class Online {
	private int amount;
	private String address;
	private String bank;
	public Online() {
		System.out.println("no-Arguments");
	}
	public Online(int amount, String address, String bank) {
		System.out.println("All-Arguments");
		this.amount = amount;
		this.address = address;
		this.bank = bank;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	

}
