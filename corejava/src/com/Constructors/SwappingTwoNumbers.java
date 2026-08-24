package com.Constructors;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		
       int a=10;
       int b=20;
      // int temp=a;1st model
      // a=b;
      // b=temp;
      //( or)
      // a=a^b;2nd model
      // b=a^b;
      // a=a^b;
       System.out.println("Before swapping A value is:"+a);
       System.out.println("Berore swapping B value is :"+b);
       a=a+b;//30 3rd model
       b=a-b;//20
       a=a-b;//10
       System.out.println(" After swapping A value is:"+a);
       System.out.println("After swapping B value is:"+b);
       
       }

}
