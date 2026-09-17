package com.methods;

public class MobileRecharge {
	void showPlanDetails() {
		System.out.println("current recharge plan:");
		System.out.println("Plan Name : Unlimited 299");
		System.out.println("Validity  : 28 Days");
		System.out.println("Data      : 1.5 GB/Day");
		System.out.println("Calls     : Unlimited");
	}
	void recharge(double amount) {
		 System.out.println("Recharge Successful!");
		    System.out.println("Recharge Amount : ₹" + amount);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		MobileRecharge m=new MobileRecharge();
		m.showPlanDetails();
		m.recharge(299);
		m.bank();
		m.deposite(2000);
		m.moive();
		m.bookticket(3);
		m.ticketprice(500);

	}
	void bank(){
		System.out.println("customer name:mounika");
		System.out.println("bank name:sbi");
        System.out.println("bank balance:10000");		
	}
	void deposite(double amount) {
		System.out.println("deposite amount:"+amount);
		amount=amount+50000;
		System.out.println(amount);
	}
	void moive() {
		System.out.println("movie name:dear commarade");
		System.out.println("hero name:vijadevarakonda");
		System.out.println("heroine name:rasmika");
	
	}
	void bookticket(int ticket) {
		System.out.println("movie ticket booking members:"+ticket);
		
	}void ticketprice(int price){
		System.out.println("moive ticket price:"+price);
	}

}
