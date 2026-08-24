package com.Loops;

import java.util.Scanner;

public class SecondLargestDigit {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		int largest=-1;
		int secondlargest=-1;
		while(n>0) {
			int digit=n%10;
			if(digit>largest) {
				secondlargest=largest;
				largest=digit;
				
			}else if (digit>secondlargest&&digit!=largest) {
				secondlargest=digit;
				
			}
			n=n/10;
		}
		if(secondlargest==-1) {
			System.out.println("Second largest distinct digit does not exist");
		}else {
			System.out.println("second largest digit:"+secondlargest);
		}

	}

}
