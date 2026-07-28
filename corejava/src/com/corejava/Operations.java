package com.corejava;
import java.util.Scanner;
public class Operations {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operations o=new Operations();
		
		System.out.println("enter a frist number:");
		int a=sc.nextInt();
		System.out.println(" enter a second number:");
		int b=sc.nextInt();
		o.addition(a,b);
		o.subtration(a, b);
		o.multiplication(a,b);
		o.division(a, b);
		
		
		
	

	}
	int addition(int a,int b) {
		System.out.println("addition:"+ (a+b));
		return a+b;
	}
int subtration(int a,int b) {
	System.out.println("subtration:"+(a-b));
	return a-b;
}
int multiplication(int a, int b) {
	System.out.println("multiplication:"+(a*b));
	return a*b;
	
}
int division(int a,int b) {
	System.out.println("division:"+(a/b));
	return a/b;
}
}
