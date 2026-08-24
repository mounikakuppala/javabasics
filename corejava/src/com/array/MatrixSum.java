package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int sum=0;
		System.out.print("enter 9 elements:");
		for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j]=sc.nextInt();
			sum=sum+arr[i][j];
			
			
		}
		
		
	}
		
		System.out.println("sum of all elements:"+sum);
		int left_sum=0;
	int right_sum=0;
	for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
				left_sum=left_sum+arr[i][j];
				}if(i+j==2) {
				right_sum=right_sum+arr[i][j];
				
				}
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
	}
			System.out.println("left sum is:"+left_sum);
			System.out.println("right sum is:"+right_sum);

	
				
			System.out.println();
		}
     
	}

