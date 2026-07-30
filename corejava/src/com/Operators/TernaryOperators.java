package com.Operators;
import java.util.Scanner;

public class TernaryOperators {
	int totalmarks=100;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int marks=sc.nextInt();
		
		String grade=(marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"C":(marks>=40)?"D":"fail";
		System.out.println("grade values:"+grade);
		
		

	}

}
