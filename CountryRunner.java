package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.Country;
import com.xworkz.darara1.things.State;

public class CountryRunner {
	public static void main(String args[]) {
		Country c=new Country();
		State s=new State();
		s.setName("Karnataka");
		s.setNumberOfDistics(28);
		s.setNumberOfStates(30);
		s.setNumberOfThaloks(25);
		s.setPopulation("6crors");
		c.setState(s);
		System.out.println(c.getState().getNumberOfDistics());
	}

}
