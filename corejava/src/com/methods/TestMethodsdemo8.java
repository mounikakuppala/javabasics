package com.methods;

import java.util.Scanner;

public class TestMethodsdemo8 {
   static double findAreaOfRectangle(double length,double breadth) {
    	double arrec=length*breadth;
    	return arrec;
    }
    double findoftriangle(float base,float height) {
    	double artri=0.5*base*height;
    	return artri;
    }
    int findareaofsquare(double side) {
    	double arsq=side*side;
    	return (int)arsq;
    }
    double findAreaOfCircle(double radius) {
		double arCir = Math.PI * radius * radius;
		return arCir;
	}
    
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  length:");
		double l=sc.nextDouble();
		System.out.println("enter breadth l");
		double b=sc.nextDouble();
	

		double arec = findAreaOfRectangle(l, b);

		System.out.println("area of reactangle is :"+arec);
		
		

	}

}
