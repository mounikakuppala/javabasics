package com.oops01.inheritance;

import java.util.Scanner;

class Student2 {
	void calculategrade(int marks) {
		System.out.println("student grade");

	}
}

class EngineeringStudent extends Student2 {
	@Override
	void calculategrade(int marks) {
		if (marks >= 90) {
			System.out.println("engineering grade: A");
		} else if (marks >= 75) {
			System.out.println("engineering grade:B");
		} else if (marks >= 60) {
			System.out.println("engineering grade:C");
		} else {
			System.out.println("engineering grade:F");
		}

	}
}

class MedicalStudent extends Student2 {
	@Override
	void calculategrade(int marks) {
		if (marks >= 85) {
			System.out.println("medical grade: A");
		} else if (marks >= 70) {
			System.out.println("medical grade:B");
		} else if (marks >= 55) {
			System.out.println("medical grade:C");
		} else {
			System.out.println("medical grade:F");
		}
	}

}

class ManagementStudent extends Student2 {
	@Override
	void calculategrade(int marks) {
		if (marks >= 80) {
			System.out.println("management grade: A");
		} else if (marks >= 65) {
			System.out.println("management grade:B");
		} else if (marks >= 50) {
			System.out.println("management grade:C");
		} else {
			System.out.println("management grade:F");
		}

	}

}

public class Student1 {

	public void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.engineering");
		System.out.println("2.medical");
		System.out.println("3.management");
		System.out.println("enter your name:");
		String name=sc.nextLine();
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		System.out.println("enter your marks:");
		int marks=sc.nextInt();
		
		switch (choice) 
		{
		case 1:
		System.out.println("engineering student");	
		Student2 s=new EngineeringStudent();
			
		s.calculategrade( marks);
	    break;
		
		case 2:
			System.out.println("medical student");
			Student2 s1=new MedicalStudent(); 
			s1.calculategrade(marks);
		break;	
			
		case 3:
			System.out.println("management student");
			Student2 s2=new MedicalStudent();
			s2.calculategrade(marks);
		break;
		default:
		 System.out.println("invalid choice");
		}
	
		
	}
}
