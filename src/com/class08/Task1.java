package com.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String creditCard;
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		
	
		String answer;
		do {
			System.out.println("Please apply for creditcard");
			answer=scan.nextLine();
		}while(!answer.equalsIgnoreCase("yes"));
		System.out.println("Okay, no more questions");
			
		
		
		
		
		
		
		
		
	}

}
