package com.Loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		
		
		int sum=0;
       while(n!=1) {
   
  		 sum=0;
  		 while(n>0) {
            int r=n%10;
            sum+=r*r;
            n=n/10;
    	   
       }
  		 n=sum;

       }if(n==1) {
    	   System.out.println("it is a happy number");
       }else {
    	   System.out.println("it's not a happy number");
       }
	}
}


