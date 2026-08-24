package com.languagefundamentals;

public class ArrayList {

	public static void main(String[] args) {
		int[] p= {8,4,6,2,3};
		
		for (int i=0;i< p.length;i++) {
			for (int j=i+1;j<p.length;j++) {
				if(p[j]<=p[i]) {
					p[i]=p[i]-p[j];
					break;
				}
			}
		}
		
		
				for(int a:p) {
					
					System.out.print(a+ " ");
					
					
				}
				
			}
	
}
				
			
		

	


