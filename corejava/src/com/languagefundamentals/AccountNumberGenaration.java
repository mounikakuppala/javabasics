package com.languagefundamentals;
import java.util.Scanner;


public class AccountNumberGenaration {
	 int accont_number;
	 int IFSC_code;
	 String holder_name;
	 double balance;
	 String bank_name;
	 AccountNumberGenaration(){
		 
	 }
	 
	 
	 
 	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a account number:");
		int account_number=sc.nextInt();
		System.out.println("enter a IFSC code:");
		int IFSC_code=sc.nextInt();		
		System.out.println(" enter a holder name:");
		String holder_name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter a balance:");
		double balance=sc.nextDouble();
		System.out.println("enter a bank name:");
		String bank_name=sc.next();
		
		

	}

}
