package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start number");
		int start = scan.nextInt();
		System.out.println("Please enter end number");
		int end = scan.nextInt();
	

	int sumOdd = 0;
	int sumEven = 0;

	if(start<end)
	{
		for (int i = start; i < end; i++) {
			if (i % 2 != 0) {
				sumOdd += i;
			} else {
				sumEven += i;
			}
			System.out.println("Sum of odd nums  from range " + start + " to " + end + " is = " + sumOdd);
			System.out.println("Sum of even nums from range " + start + " to " + end + " is =  " + sumEven);
		}

	}
}
}

