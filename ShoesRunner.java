package com.xworkz.shopping.driver;
import com.xworkz.shopping.things.Shoes;
public class ShoesRunner {
	public static void main(String[] args) {
		Shoes s = new Shoes();
		Shoes s1 = new Shoes();
		s.brand="Bata";
		System.out.println("the object value:"+s.toString());
		System.out.println("get the class:"+s.getClass());
		System.out.println("hash code:"+s.hashCode());
		System.out.println(s.equals(s));
	}
}
