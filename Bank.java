package com.xworkz.shopping.things;

public class Bank {
	private String bankName;
	private String personName;
	private long accountNumber;
	private String place;
	public Bank(String bankName, String personName, long accountNumber, String place) {
		this.bankName = bankName;
		this.personName = personName;
		this.accountNumber = accountNumber;
		this.place = place;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
