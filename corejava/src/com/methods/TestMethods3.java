package com.methods;

public class TestMethods3 {
  //no return type ,with arguments;
	public static void main(String[] args) {
		System.out.println("main method started");
		TestMethods3 t3=new TestMethods3();
		t3.show();
		
		t3.show(10,20);//call by value
        t3.add(30,40);		
		
		System.out.println("main method method ended");
		

	}
	void show() { //no arguments
		System.out.println("good morning");
	}
	void  show(int a,int b) {  //arguments
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
		
	}
	void add(int c,int d) {
		
		 int sum=c+d;
		System.out.println(" a and b sum values:"+sum);
		
		
	}

}
