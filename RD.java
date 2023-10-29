package com.xworkz.darara1.things;

public class RD {
	private String period;
	private String date;
	private String bank;
	public RD() {
		System.out.println("no-Arguments");
	}
	public RD(String period, String date, String bank) {
		System.out.println("All-Arguments");
		this.period = period;
		this.date = date;
		this.bank = bank;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	

}
