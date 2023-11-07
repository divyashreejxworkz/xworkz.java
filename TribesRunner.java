package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Language;

public class TribesRunner {
	public static void main(String[] args) {
		Language l=new Language();
		l.getTribesInfo("India");
		l.getTribesInfo("India","");
		l.getTribesInfo("JerU","India","Bagh print saree");
	}

}
