package com.Operators;
import java.util.Scanner;

public class AdditionorSubtraction {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter frist number:");
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		System.out.println("enter operator:");
		char ch=sc.next().charAt(0);
		int result=(ch=='+')?(num1+num2):(num1-num2);
		System.out.println(result);
	

	}

}
