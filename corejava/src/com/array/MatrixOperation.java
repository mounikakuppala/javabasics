package com.array;

import java.util.Arrays;

public class MatrixOperation {

	
		public static void main(String[] args) {
			System.out.println("main method started");
			int[][] arr= {{1,2,3},
					      {4,5,6},
					      {7,8,9}};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
		for(int j=0;j<arr[i].length/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][arr.length-1-j];
				arr[i][arr.length-1-j]=temp;
				
          }
		}
				else {
					for(int j=0;j<arr.length;j++) {
						if(i!=j) {
							arr[i][j]=arr[i][j]*2;
						}
					}
				}
			}			
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(i==j) {
				arr[i][j]=arr[i][j]*arr[i][j];
			}
		}
	}
	System.out.println(Arrays.deepToString(arr));
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}

		
	}

}


