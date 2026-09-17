package com.oops;

public class ShoppingCart1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		ShoppingCart s=new ShoppingCart();
		s.setCartItem();
		s.setTotalAmount();
	
		System.out.println(s.getTotal(300));
		System.out.println(s.getCartItem(20));
		System.out.println(s.getTotal(200));
		s.additem(100);
		s.removeitem(50);
	}

}
