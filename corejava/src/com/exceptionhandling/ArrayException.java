package com.exceptionhandling;

import java.util.Scanner;



public class ArrayException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter frist number:");
			String s=sc.nextLine();
			System.out.println("enter second number:");
			String s1=sc.nextLine();
			int s2=Integer.parseInt(s);
			int s3=Integer.parseInt(s1);
			int s4=s2/s3;
			System.out.println("in try"+s4);
		} catch(ArithmeticException ae) {
			System.out.println("in catch AE");
		}

	}

}
