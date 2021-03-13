package com.class07;

import java.util.Scanner;

public class LotterywithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		int num;
		int lotteryNumber = 17;
		input = new Scanner(System.in);
		System.out.println("Please enter any number from 1 to 100");
		num = input.nextInt();
		
		while (num != lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100");
			num = input.nextInt();

		}
	}

}
