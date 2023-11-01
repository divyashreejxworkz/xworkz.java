package com.xworkz.shopping.things;

public class HighLavel extends ProgrammingLanguage {
public HighLavel() {
	super("Plankalkul","Karnod Zuse","1951","Corrado Bohm");
	System.out.println("this is subclass constructor");
	System.out.println(super.getFirstLounguage());
	System.out.println(super.getCreatedBy());
	System.out.println(super.getGenarationYear());
	System.out.println(super.getCompilerCreatedBy());
	System.out.println("constructor end");
}
}
