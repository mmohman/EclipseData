package com.class06;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String gender, M, F;

		System.out.println("Please enter your gender: M or F");

		M = scan.next();
		F = scan.next();
		int age;

		System.out.println("Please enter your age");
		age = scan.nextInt();
		if (age > 25) {
			gender = "Women";
		} else {
			gender = "Men";

		}
		{
			if (age < 25) {
				gender = "Girl";

			} else {
				gender = "Boy";
			}
		}
	}

}
