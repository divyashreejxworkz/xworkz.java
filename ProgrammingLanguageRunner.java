package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.HighLavel;

public class ProgrammingLanguageRunner {
	public static void main(String[] args) {
		HighLavel h=new HighLavel();
		h.setFirstLounguage("Plankalkul");
		h.setCreatedBy("Karnod Zuse");
		h.setGenarationYear("1951");
		h.setCompilerCreatedBy("Corrado Bohm");
		String firstLounguage=h.getFirstLounguage();
		String createdBy=h.getCreatedBy();
		String genarationYear=h.getGenarationYear();
		String compilerCreatedBy=h.getCompilerCreatedBy();
		System.out.println("First language:"+h.getFirstLounguage());
		System.out.println("Created by:"+h.getCreatedBy());
		System.out.println("genaration Year:"+h.getGenarationYear());
        System.out.println("Compiler created by:"+h.getCompilerCreatedBy());
	}
}
