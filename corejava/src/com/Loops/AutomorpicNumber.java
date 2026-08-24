package com.Loops;

import java.util.Scanner;

public class AutomorpicNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int original=n;
		 int square=n*n;
		 int temp=n;
		 int digits=0;
		 
		
		
		while(temp>0) {
			 digits++;
			
			
			temp=temp/10;
		}
		int divisor=1;
			for(int i=1;i<=digits;i++) {
				divisor=divisor*10;
			}
				int lastdigit=square%10;
		if(lastdigit==original) {
			System.out.println("it is a automorpic number:");
		}else {
			System.out.println("it's not a automorpic number:");
		}

	}

}
