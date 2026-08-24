package com.Loops;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		 boolean isprime=false;
	
		
		if(n<=1) {
			 isprime=false;
		}
		else {
			for (int i=2;i<n;i++)
			if(n%1==0) {
			   isprime=false;
			  break;
				
				
			}
		}
		
	
	if(isprime) {
	
		System.out.println("it is prime number");
	}
	else {
		System.out.println("it's not a prime number");
	}
}
}



