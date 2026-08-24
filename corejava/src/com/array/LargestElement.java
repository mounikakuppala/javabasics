package com.array;

public class LargestElement {

	public static void main(String[] args) {
		System.out.println("main method started");
		int arr[]= {12,45,7,89,23};
		int largest=arr[0];
		int smallest=arr[0];
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}if(arr[i]<smallest) {
				smallest=arr[i];
			}if(arr[i]%2==0) {
				even++;
				
			}else {
				odd++;
				
			}
			 

		}
     System.out.println("largest element:"+largest);
     System.out.println("smallest element:"+smallest);
     System.out.println("number of even numbers :"+even);
     System.out.println("number of odd numbers :"+odd);
    
	}
  
}
