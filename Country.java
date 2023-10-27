package com.xworkz.darara1.things;

public class Country {
private State state;
public Country() {
	System.out.println("No-Arguments");
}
public Country(State state) {
System.out.println("All-arguments");
	this.state = state;
}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}


}
