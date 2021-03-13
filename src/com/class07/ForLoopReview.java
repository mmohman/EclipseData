package com.class07;

public class ForLoopReview {

	public static void main(String[] args) {
		/*
		 * i wantto create a multipilication table 1*1=1 1*2=2 1*3=3
		 * 
		 * 
		 * 1*10=10
		 */

		int num = 6;
		int mult;
		for (int i = 1; i <= 10; i++) {
			mult = num * i;
			System.out.println(num + " * " + i + " = " + mult);
		}

	}

}
