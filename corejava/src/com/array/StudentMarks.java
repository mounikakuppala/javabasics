package com.array;

import java.util.Arrays;

public class StudentMarks {

	public static void main(String[] args) {
		System.out.println("main method started");
		
	int[] arr= {35,41,29,72,87};
	int n=0;
	for(int i=0;i<arr.length;i++) {
		  n=arr[i]%10;
		
		  if(n<=5) {
			  arr[i]=arr[i]-n;
		  }else {
			  arr[i]=arr[i]+(10-n);
		  }
	}
	
	System.out.print(Arrays.toString(arr));
	
		}

}
