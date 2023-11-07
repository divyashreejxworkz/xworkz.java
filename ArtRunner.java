package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Pattern;

public class ArtRunner {
	public static void main(String[] args) {
	Pattern p = new Pattern();
	p.getArtDetails("Monalisa",50000);
	p.getArtDetails(50000,"Monalisa");
	p.getArtDetails("Monalisa",50000);
	}

}
