package com.xworkz.darara1.things;

public class State {
	private String name;
	private int numberOfDistics;
	private String population;
	private int numberOfThaloks;
	private int numberOfStates;
	public State()
	{
		System.out.println("No-arguments");
	}
	public State(String name, int numberOfDistics,String population, int numberOfThaloks, int numberOfStates) {
		System.out.println("All-arguments");
		this.name = name;
		this.numberOfDistics = numberOfDistics;
		this.population = population;
		this.numberOfThaloks = numberOfThaloks;
		this.numberOfStates = numberOfStates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfDistics() {
		return numberOfDistics;
	}
	public void setNumberOfDistics(int numberOfDistics) {
		this.numberOfDistics = numberOfDistics;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public int getNumberOfThaloks() {
		return numberOfThaloks;
	}
	public void setNumberOfThaloks(int numberOfThaloks) {
		this.numberOfThaloks = numberOfThaloks;
	}
	public int getNumberOfStates() {
		return numberOfStates;
	}
	public void setNumberOfStates(int numberOfStates) {
		this.numberOfStates = numberOfStates;
	}
	

}
