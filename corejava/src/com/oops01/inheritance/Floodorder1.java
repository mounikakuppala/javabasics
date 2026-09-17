package com.oops01.inheritance;

class Foodorder {
	int orderid;
	String customername;
	double price;

	void orderdetails() {
		System.out.println("order id is:" + orderid);
		System.out.println("customer name is:" + customername);
		System.out.println("price is:" + price);
	}

}

class Pizzaoreder extends Foodorder {

	void preparefood() {
		System.out.println("preparing food");
	}
}
	class burgerorder extends Foodorder {
		void burgerfood() {
			System.out.println("preparing burger food");
		}
	}


public class Floodorder1 {
	public static void main(String[] args) {

		Pizzaoreder p = new Pizzaoreder();
		p.orderid = 201;
		p.customername = "mounika";
		p.price = 500.3;
		p.orderdetails();
		p.preparefood();

	}

}
