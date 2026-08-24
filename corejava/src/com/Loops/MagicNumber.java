package com.Loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	
	while(n>9) {
     
     int  sum=0;
     int r=0;
     while(n>0) {
    	 r=n%10;
    	 sum=sum+r;
    	 n=n/10;
    	 
     }
    n=sum;
	}
	if(n==1) {
		System.out.println("it is a magic number:"+n);
		
	}else {
		System.out.println("it's not a magic number:"+n);
	}
	
	}
}


