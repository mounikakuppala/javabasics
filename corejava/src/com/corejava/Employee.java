package com.corejava;

public class Employee {
	String empname;
	int empsal;
	static  String companyname;

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e= new Employee();
		e.empname="mounika";
		e.empsal=10000000;
		companyname="vcube";
		
		System.out.println("employee name:"+e.empname);
		System.out.println("employee salary:"+e.empsal);
		System.out.println("employee company name:"+companyname);//static variable
		System.out.println("main method ended");
	}

}
