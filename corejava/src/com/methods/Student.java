package com.methods;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s=new Student();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String name=sc.nextLine();
		System.out.println("enter a age:");
		int age=sc.nextInt();
		System.out.println("enter a course:");
	    String course=sc.nextLine();
	    sc.nextLine();
	    System.out.println("enter a marks:");
	    double marks=sc.nextDouble();
		s.displaystudent(name,age,course,marks);
		
		System.out.println("main methiod ended");

	} 
	void displaystudent(String name,int age,String course,double marks) {
		System.out.println("Student name:"+name);
		System.out.println("Student  age:"+age);
		System.out.println("Student course:"+course);
		System.out.println("Student  marks:"+marks);
         
		
	}
	

}
