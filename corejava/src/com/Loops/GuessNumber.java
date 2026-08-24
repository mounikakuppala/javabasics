package com.Loops;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	Random r= new Random();
	int n=r.nextInt(10);
	
	for(int i=1;i<=3;i++) {
		System.out.println("enter your guess:");
		int guess=sc.nextInt();
		if(guess==n) {
			System.out.println("you won");
			break;
			
		}
		if(i==3) {
			System.out.println("you lost!");
			System.out.println("random number was:"+n);
			
		}else {
			
			System.out.println("wrong guess,try again");
			System.out.println("you left only this attempts");
		}
	}
	

	}

}
