package com.array;

import java.util.Scanner;

public class MatrixReplace {

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("enter matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
				
				}
			}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]%2==0) {
					arr[i][j]=0;
					
				}else {
					arr[i][j]=-1;
				}
				System.out.print(arr[i][j]+" ");
		}
      System.out.println();
	}
	}
}


