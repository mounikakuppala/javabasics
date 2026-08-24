package com.Loops;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		 System.out.println("muplication table:"+n);
		for ( int i=1;i<=10;i++) {
			System.out.println(n*i);
		}

	}

}
