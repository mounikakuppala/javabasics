package com.oops01.inheritance;

  public class Vehicle {
	 void start() {
		 System.out.println("vehicle class called");
	 
     }

  }
   class Car extends Vehicle{
	 void drive() {
		 System.out.println("drive method called");
		 
 
 }
  
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.drive();
	}
  }

	

	
