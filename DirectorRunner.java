package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Movie;

public class DirectorRunner {
	public static void main(String[] args) {
		Movie m=new Movie();
		m.setPersonName("Bhatru");
		m.setMovieName("Galipata2");
		m.setInvestAmmount(100000000);
		m.setEarnAmmount(500000000);
		String personName=m.getPersonName();
		String movieName=m.getMovieName();
		int investAmmount=m.getInvestAmmount();
		int earnAmmount=m.getEarnAmmount();
		System.out.println("person name:"+m.getPersonName());
		System.out.println("movie name:"+m.getMovieName());
		System.out.println("invest Ammount:"+m.getInvestAmmount());
		System.out.println("earn ammount:"+m.getEarnAmmount());
	}
}
