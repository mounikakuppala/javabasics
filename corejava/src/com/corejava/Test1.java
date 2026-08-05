package com.corejava;

public class Test1 {
	static {
		System.out.println("static block called");
		
	}
	
	{
		System.out.println("instance block called");
		
	}
	Test1(){
		System.out.println("constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test1 t=new Test1();
		System.out.println("main method ended");
		
		

	}

}
