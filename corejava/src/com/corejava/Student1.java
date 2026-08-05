package com.corejava;

public class Student1 {
	//static variables
 static String collegename;
 static String location;
 
	 //instance variables
	 String studentname;
	 int marks;
	 
	 // static block 
		 static {
			 collegename="vcube";
			 location="hyderabad";
			 System.out.println("static method called");
		 }
		 //instance block
		 {
			System.out.println("instance method called"); 
			
		 }
	 
	public static void main(String[] args) {
		System.out.println("main method started");
		Student1 s=new Student1();
		s.studentname="mouni";
		s.marks=94;
		
		
		System.out.println("college name:"+collegename);
		System.out.println("location:"+location);
		System.out.println("student name:"+s.studentname);
		System.out.println("student marks:"+s.marks);
		
	
		System.out.println("main method ended");

	}

}
