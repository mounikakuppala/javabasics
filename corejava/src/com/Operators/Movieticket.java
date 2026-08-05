package com.Operators;

import java.util.Scanner;

public class Movieticket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select ticket type:");
		System.out.println("1.silver=200");
		System.out.println("2.gold=300");
		System.out.println("3.platinum=500");
		System.out.println("exit");
	
		System.out.println("enter  your choice :");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter your age:");
			 int age=sc.nextInt();
			 double price=200;
			 
			if(age>60){
            price=price-(price*0.10);
            
			}
			 System.out.println("silver :"+price);
		break;
		case 2:
			System.out.println("enter a age:");
			 age=sc.nextInt();
			double goldprice=300;
			if (age>=60) {
				goldprice=goldprice-(goldprice*10/100);
				
			}
			System.out.println("gold price:"+goldprice);
			break;
		case 3:
			System.out.println("enter a age:");
			age=sc.nextInt();
			double platinumprice=500;
			if(age>=60) {
				platinumprice=platinumprice-(platinumprice*10/100);
			}
			System.out.println("platinum price:"+platinumprice);
			break;
			default:
			System.out.println("invalid choice");
			
			
		
			
        	
		}
		
		

	}

}
