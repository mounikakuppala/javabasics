package com.oops01.inheritance;

import java.util.Scanner;

public class PersonalLoan {
	Scanner sc=new Scanner(System.in);
	boolean isPhoneValid() {
		System.out.println("enter your mobile number:");
		String phone=sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}
	boolean isAadharValid() {
		System.out.println("enter your aadhar:");
		String aadhar=sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
		
	}
	boolean isPanValid() {
		System.out.println("enter your pan card details:");
		String pan=sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		
		
	}
	
	double getLoanRoi() {
		double roi=8.5;
		int cibil=getCibilScore();
		if (cibil >= 300 && cibil<= 549) {
			System.out.println("Lenders see you as high risk, and getting new loans is very hard");
			roi=roi+4.0;
		}else if(cibil>=550 && cibil<= 649) {
			System.out.println("You may get approval, but often with higher interest rates");
			roi=roi+3.0;
			
		}else if(cibil>=650 && cibil<= 749) {
			System.out.println("Banks view you as dependable, making loan approval easier");
			roi=roi+1.5;
			
		}else if(cibil>=750 &&cibil<= 900) {
			System.out.println(" You get fast approvals and the best interest rates");
			roi=roi+0.5;
		}else {
			System.out.println("invalid cibil information!");
			roi=roi+10.0;
		}
		return roi;
	}
	int getCibilScore() {
		System.out.println("enter your  cibil score:");
		int cibil=sc.nextInt();
		return cibil;
	}
	double getCustomerSalary() {
		System.out.println("enter your salary:");
		double salary=sc.nextInt();
		return salary;
	}
	int getCustomerAge() {
		System.out.println("enter your age:");
		int age=sc.nextInt();
		return age;
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vcube banking");
		PersonalLoan p=new PersonalLoan();
		double salary=p.getCustomerSalary();
		int age=p.getCustomerAge();
		int cibil=p.getCibilScore();
		if(salary>=900000.00 && age>=26 &&(cibil>=300 && cibil<=900)) {
			System.out.println("basic information is validated check personal details");
			if(p.isPhoneValid() && p.isAadharValid() && p.isPanValid()) {
				System.out.println("details are good  and loan  got aproved");
				System.out.println("your loan ROI is:"+p.getLoanRoi());
				
				
			}else {
				System.out.println("something went wrong");
			}
		}else {
			System.out.println("you are not eligible for personal loan and your loan got rejected");
		}
		
		System.out.println("main method ended");

	}

}
