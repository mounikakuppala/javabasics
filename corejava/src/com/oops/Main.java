package com.oops;

public class Main {

	public static void main(String[] args) {
		System.out.println("main method started");
		BankAccount b=new BankAccount();
		b.setAccountNumber(4533453);
		b.setHolderName("mounika");
		b.setBalance(2000);
		System.out.println(b.getAccountNumber());
		System.out.println(b.getBalance());
		System.out.println(b.getHolderName());
		b.deposite(3000);
		b.withdraw(1000);
		b.display();
		
	}

}
