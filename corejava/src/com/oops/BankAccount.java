package com.oops;

public class BankAccount {

	private long accountnumber;
	private String holdername;
	private double balance;
	
	public void setAccountNumber(long accountnumber) {
		this.accountnumber=accountnumber;
		
		this.balance=5000;
	}
	public long getAccountNumber() {
		return accountnumber;
		
	}
	
	 public void setHolderName(String holdername) {
		 this.holdername=holdername;
		 
	 }
	 public String getHolderName() {
		 return holdername ;
		 
	 }
	 public void  setBalance(double balance) {
		 this.balance=balance;
		 
	 }
	public double getBalance() {
		return balance;
	}
	public void deposite(double amount) {
		amount=balance+amount;
		System.out.println("deposite amount:"+amount);
		
	}
	
	 public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("withdraw amount:"+amount);
			
		}
		
	}
	 
	 public void display(){
		System.out.println("account number:"+accountnumber);
		System.out.println("holder name:"+holdername);
		System.out.println("final balance:"+balance);
	}
}