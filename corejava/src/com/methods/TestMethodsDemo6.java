package com.methods;

import java.util.Scanner;
//with return type+no argument;

public class TestMethodsDemo6 {
	double getsalary() {
		double sal=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary:");
		sal=sc.nextDouble();
		return sal;
	}
	double getbonus() {
		double bonus=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your bonus:");
		bonus=sc.nextDouble();
		return bonus;
		
	}
	

	public static void main(String[] args) {
		System.out.println("main methiod started");
		TestMethodsDemo6 t=new TestMethodsDemo6();
		double b=t.getbonus();
		double s=t.getsalary();
		System.out.println("total salary of the employee:"+(b+s));
		
		
		
	}

}
