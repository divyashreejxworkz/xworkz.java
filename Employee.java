package com.xworkz.shopping.things;
public class Employee extends Company{
	    public Employee()
		{
			super("Google",1000,25,"Larry Page Sergey Brin");
			System.out.println("this is sub class constructor");
			System.out.println(super.getName());
			System.out.println(super.getTotalEmployees());
			System.out.println(super.getTotalDepartment());
			System.out.println(super.getFounders());
			System.out.println("Constructor end");
	    }
	}


