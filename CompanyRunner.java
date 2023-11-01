package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Employee;

public class CompanyRunner {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Google");
		e.setTotalEmployees(1000);
		e.setTotalDepartment(25);
		e.setFounders("Larry Page Sergey Brin");
		String name =e.getName();
		int totalEmployees=e.getTotalEmployees();
		int totalDepartment=e.getTotalDepartment();
		String founders=e.getFounders();
		System.out.println("name:"+e.getName());
		System.out.println("Total Employees:"+e.getTotalEmployees());
		System.out.println("Total Department:"+e.getTotalDepartment());
		System.out.println("Founder:"+e.getFounders());
	}

}
