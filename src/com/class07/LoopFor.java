package com.class07;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			System.out.println("Hello");
		}

		System.out.println("-------print 1 to 50-----");

		for (int n = 1; n <= 50; n++) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("------10 to 1---------");

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("---------What is my output------");
		for (int a = 0; a <= 10; a += 2) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("---------What is my output------");
		for (int a = 5; a <= 50; a += 5) {
			System.out.print(a + " ");
		}

	}

}
