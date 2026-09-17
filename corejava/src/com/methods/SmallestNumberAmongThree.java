package com.methods;

import java.util.Scanner;

public class SmallestNumberAmongThree {

	public static void main(String[] args) {
		System.out.println("main method started");
		SmallestNumberAmongThree s=new SmallestNumberAmongThree();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=s.findsmallestnumber(a,b,c);
		System.out.println(result);
		

	}
 int findsmallestnumber(int a,int b,int c) {
	 return Math.max(a,Math.max (b,c));
	 
 }
}
