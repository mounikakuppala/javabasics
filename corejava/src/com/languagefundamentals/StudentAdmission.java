package com.languagefundamentals;


public class StudentAdmission {
	int id;
	String name;
	String course;

	StudentAdmission() {
		this(10);
	}

	StudentAdmission(int id) {
		this(10,"mounika");
		

	}

	StudentAdmission(int id, String name) {
		this(10,"mounika","cse");


	}

	StudentAdmission(int id, String name, String course) {

		this.id = id;
		this.name = name;
		this.course = course;
	}

	public static void main(String[] args) {
		
		StudentAdmission s=new StudentAdmission();
		System.out.println("enter a id:"+s.id);

		System.out.println("enter a name:"+s.name);
		System.out.println("enetr a course:"+s.course);
		
		
		

	}

}
