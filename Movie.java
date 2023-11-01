package com.xworkz.shopping.things;

public class Movie extends Director {
public Movie() {
super("Bhatru","Galipata2",100000000,500000000);
System.out.println("This is subclass constructor");
System.out.println(super.getPersonName());
System.out.println(super.getMovieName());
System.out.println(super.getInvestAmmount());
System.out.println(super.getEarnAmmount());
System.out.println("constructor end");
}
}
