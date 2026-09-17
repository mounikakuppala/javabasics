package com.methods;

class Student1 {
	int sid;
	String name;
	int age;
	String city;
}

public class TestMethodsDemo9 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Student1 s = getStudentInfo();
		printStudentInfo(s);

		System.out.println("main method ended ");
	}

	static void printStudentInfo(Student1 s) {
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.city);
	}

	// Factory method
	static Student1 getStudentInfo() {
		Student1 s = new Student1();
		s.sid = 45;
		s.name = "Rohit";
		s.age = 38;
		s.city = "Mumbai";

		return (Student1) s;
	}

}
