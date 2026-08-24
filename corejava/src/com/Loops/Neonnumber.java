package com.Loops;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int n1=n*n;
		 int sum=0;
		 while(n1>0) {
          int r=n1%10;
          sum=sum+r;
          n1=n1/10;
			 
		 }
		if(sum==n) {
			System.out.println("it is neon number");
			
		}
		else {
			System.out.println("not neon number");
		}

	}

}
