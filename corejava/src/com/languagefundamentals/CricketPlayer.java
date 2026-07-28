package com.languagefundamentals;
import java.util.Scanner;

public class CricketPlayer {
	 String playername;
	 int matched_played;
	 float total_runs;
	 CricketPlayer(String playername,int matched_played,float total_runs){
		 this.playername=playername;
		 this.matched_played=matched_played;
		 this.total_runs=total_runs;
		 
		 
	 }
	 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a palyername");
		String playername=sc.nextLine();
		System.out.println("enter a matched_played");
		int matched_played=sc.nextInt();
		System.out.println("enter a total_runs");
		float total_runs=sc.nextFloat();
		CricketPlayer c=new CricketPlayer(playername,matched_played,total_runs);
		c.display();
		c.average();
	}
	void display() {
		System.out.println("playername:"+playername);
		System.out.println("matched_played:"+matched_played);
		System.out.println("total runs:"+total_runs);
	}
	void average() {
		float averageruns=total_runs/matched_played;
		System.out.println("average runs:"+averageruns);
	}

}
