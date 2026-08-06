package com.methods;

public class Testmethod2 {
	//no returntype +no arguments 

	public static void main(String[] args) {
	System.out.println("main method started");
	Testmethod2 t1=new Testmethod2();
	t1.addition();
	t1.subtration();
	t1.multiplication();
	
	System.out.println("main method ended");
	}
	void addition() {
		 int a=10;
		 int b=20;
		 int c=a+b;
		 System.out.println("addition:"+c);
		
	}
	void subtration() {
		int a=40;
		int b=50;
		int c=a+b;
		System.out.println("subtration:"+c);
		
	}
	void multiplication() {
		int a=60;
		int b=10;
		int c=a*b;
		System.out.println("multiplication:"+c);
		
	}
}
