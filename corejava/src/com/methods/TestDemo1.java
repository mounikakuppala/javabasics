package com.methods;

public class TestDemo1 {
	//no return type +no arguments;

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo1 t= new TestDemo1();
		t.display();// instance method
		show();//static method
		System.out.println("main method ended");
		
		

	}
	 void display() {
     System.out.println("display method called");		
	}
	 private  static void show() {
		 System.out.println("show method called");
		 
	 }

}
