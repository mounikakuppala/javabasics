package com.corejava;

public class Student {
	int studentid;
	String studentname;
	String address;
	int age;
	
	

	public static void main(String[] args) {
	System.out.println("main method started");
	Student s=new Student();
	System.out.println("student id:" +s.studentid);
	System.out.println("student name:"+s.studentname);
	System.out.println("student:"+s.address);
	System.out.println("age:"+s.age);
	System.out.println("*****************************************");
	
	Student s1=new Student();
	s1.studentid=101;
	s1.studentname="myra";
	s1.address="vijayawada";
	s1.age=20;
	System.out.println("student id:" +s1.studentid);
	System.out.println("student name:"+s1.studentname);
	System.out.println("student:"+s1.address);
	System.out.println("age:"+s1.age);
	

	
	System.out.println("main method ended");

	}

}
