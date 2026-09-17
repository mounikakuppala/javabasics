package com.methods;

import java.util.Scanner;

public class BankApplication {
	
	
	 static long accountnumber=1234567;
	 static String holdername="mounika";
	 static double balance=3000;
	 static int pin=1234;

	
	static double getBalance() {
		
		
		return balance;
	}
	static void  deposit(double amount) {
		balance=balance+amount;
		System.out.println("deposite:"+amount);
		System.out.println("current balance is :"+balance);
		
	}
	static boolean withdraw(double amount) {
		
//		if(amount<=balance) {
		if(amount > 0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("withdraw successfull");
			System.out.println("current balance is:"+balance);
			return true;
			
		}
		return false;
		
	}
	static boolean transfer(long accountnumber,double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("transfer successful");
			System.out.println("transfer amount:"+amount);
			System.out.println("reciever account:"+accountnumber);
			System.out.println("current balance:"+balance);
			return true;
			
		}
		
		return false;
	}
	static  void checkaccountdetails() {
		
		System.out.println("current balance is:"+balance);
		
	}
	static boolean changepin(int oldpin,int newpin) {
		if(oldpin==pin) {
			if(newpin>=1000 && newpin<=9999) {
				pin=newpin;
				System.out.println("pin change sucessfully");
				return true;
			}
			
			System.out.println("new pin must contain 4 digits");
			return false;
			
		}
		System.out.println("old pin is incorrect");
		return false;
		
	}
	static boolean validatepin(int enteredpin) {
		
		if(pin==enteredpin) {
			System.out.println("login successfull");
			return true;
		}
		System.out.println("invalid pin");
		return false;
		
	}


	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a pin:");
		int enteredpin =sc.nextInt();
		
		if(validatepin(enteredpin)) {
			System.out.println("holder name:"+holdername);
			double x = getBalance();
			System.out.println("balance amount:"+x);
			System.out.println("deposite amount");
			deposit(2000);
			System.out.println("withdraw amount");
			withdraw(1000);
			System.out.println("transfer details");
			transfer(123456789,2000);
			System.out.println("account details");
			checkaccountdetails();
			
			System.out.println("enter old pin:");
			int oldpin=sc.nextInt();
			
			System.out.println("enter new pin:");
			int newpin=sc.nextInt();
			
			if(changepin(oldpin,newpin)) {
				System.out.println("pin rest successfull");
			}else {
				System.out.println("pin reset failed");
			}
			
		}else {
			System.out.println("access denied");
		}
		    
		
		
		System.out.println("main method ended");
		
		

	}

}
