package com.Operators;

import java.util.Scanner;

public class VowelOrConsonant {
	
	public static void main(String[] args) {
		
		// char ch='b';

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character:");
		char ch = sc.nextLine().toUpperCase().charAt(0);
		String result = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "vowel" : "consonant";
		System.out.println(result);
		
	


	}

}
