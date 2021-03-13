package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		int num=0;
		while (num<=5) {
			System.out.println("Hello");
			num++;
		}

		System.out.println("------------------Do while--------------");
		
		int num1=6;
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=5);
		/*
		 * while=first check then execute
		 * do=first execute then check
		 */
	}

}
