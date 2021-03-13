package com.class06;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		String month;
		System.out.println("Input any number");
		num = scan.nextInt();
		month = scan.nextLine();
		switch (num) {
		case 1:
			month = "January";
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Invalid";
		}
		System.out.println(month);
	}
}
