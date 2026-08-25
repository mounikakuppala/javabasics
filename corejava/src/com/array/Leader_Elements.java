package com.array;

import java.util.Scanner;

public class Leader_Elements {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter a elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("leader elements");
		for(int i=0;i<n;i++) {
			boolean flag=true;
			
			
		
		for(int j=i+1;j<n;j++) {
		
		if(arr[i]<=arr[j]) {
			flag=false;
			break;
		}
		}
		if(flag) {
     System.out.println(arr[i]+" ");		
		
	}
		}
		}
}




