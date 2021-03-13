package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		
		
		String creditCard;   //can use string or boolean
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card");
		creditCard=scan.next();
		//lower case and upper case matters or else put IgnoreCase and it will ignore it
		if (creditCard.equalsIgnoreCase("yes")) {

			System.out.println("What is the balance on credit card?");
			balance=scan.nextDouble();
			if (balance>1000) {
				System.out.println("pay off immediately");
			}else {
				System.out.println("spend more");
			}
	
		}else {
			System.out.println("Would you like a credit card");
		}
	}
}
