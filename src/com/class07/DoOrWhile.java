package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		Scanner input;
		int num;
		int lotteryNumber = 17;
		input = new Scanner(System.in);
		
		do {

		System.out.println("Please enter any number from 1 to 100");
		num = input.nextInt();
		
		}while(num!=lotteryNumber);
		System.out.println("Congrats you entered  "+num+" which is lucky number");
	}

}
