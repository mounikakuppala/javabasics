package com.oops01.inheritance;

public class Person {
	String name;
	int age;
	void displayperson() {
		System.out.println("person name:"+name);
		System.out.println("person age:"+age);
	}
	public static void main() {
 }
}
	class Student extends Person{
		String collegename;
		void student() {
			System.out.println("student college name:"+collegename);
		}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Student s=new Student();
		s.name="mounika";
		s.age=20;
		s.collegename="vcube";
		s.displayperson();
		s.student();
		

	}

}
