package com.array;

import java.util.Scanner;

public class ReadArrayElements {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array size:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter  arrays are:");
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
		sum=sum+arr[i];
		 avg=sum/n;
		
	}
		System.out.println("sum of elements:"+sum);
		System.out.println("average of elements:"+avg);
		
		}
	
	}
     



	

