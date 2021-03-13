package com.class07;

import java.util.Scanner;

public class WHILELoopReview {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int money;

		do {
			System.out.println("Please pay for the soda");
		
			money=input.nextInt();
			if (money<3 ) {
				System.out.println("Please give more money");
			}else if (money>3) {
				System.out.println("Please give less money");
			}
			 
				
			}while (money!=3);
		System.out.println("thank you for your purchase");
		
	}

}
