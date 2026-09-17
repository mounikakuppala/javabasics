package com.methods;
//with return type +with arguments;
public class BasicMathematics {
 int addition(int a,int b) {
	 return a+b;
 }
 int subtration(int a,int b) {
	 return a-b;
 }
 int multiplication(int a,int b) {
	 return a*b;
	 }
 int division(int a,int b) {
	 return a/b;
	 
 }int modulus(int a,int b){
	 return a%b;
 }
 int findsquare(int n) {
	 return n*n;
 }
 int findcube(int n) {
	 return n*n*n;
 }
 int findlargest(int a,int b) {
	 return a>b?a:b;
 }
 int findsmallest(int a,int b) {
	 return a>b?a:b;
 }
	public static void main(String[] args) {
		System.out.println("main method started");
		BasicMathematics b=new BasicMathematics();
		System.out.println("addition is:"+b.addition(10, 20));
		
		System.out.println("subtration is:"+b.subtration(10, 20));
		
		System.out.println("multiplication is:"+b.modulus(10, 20));
		System.out.println("division is:"+b.division(10, 20));
		
		System.out.println("modulus is:"+b.modulus(10, 20));
		
		System.out.println("the given  number is square:"+b.findsquare(3));
		System.out.println(" the given number cube is:"+b.findcube(5));
		System.out.println("largest number is:"+b.findlargest(50,60));
		System.out.println("smallest number is:"+b.findsmallest(45,20));
		
		

	}

}
