package com.class09;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println("Good Morning");
			}
			System.out.println("-----------------------------------");
		}

		System.out.println("----------------------------------------------------");

		for (int i = 1; i < 3; i++) {

			System.out.println(i);

			for (int j = 1; j <= 4; j++) {

				System.out.println(j);
			}
		}
		System.out.println("--------------------------------------------");

		for (int i = 1; i < 3; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.println(i + " " + j);
			}
		}

		System.out.println("-------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + " " + j);
			}

		}

		System.out.println("-------------------------------------------------");

		for (int a = 0; a < 10; a++) {

			for (int b = 0; b <= 9; b++) {

				for (int c = 0; c <= 9; c++) {

					for (int d = 0; d <= 9; d++) {
						System.out.println(a + " " + b + " " + c + " " + d);
					}
				}
			}

		}

		System.out.println("--------------------------------Clock---------------------");

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {
				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (h < 10 && m >= 10) {
					System.out.println("0" + h + ":" + m);
				} else if (h >= 10 && m < 10) {
					System.out.println(+h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}

			}

		}

		System.out.println("-----------------------------------------------------");

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {
					if (m < 10) {
						System.out.println(+h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				}
			}
		}

		System.out.println("-------------------------------------------------------");
		int mult = 0;
		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= 10; b++) {
				mult = a * b;
				System.out.println(a + " * " + b + " = " + mult);

			}
		}

	}

}
