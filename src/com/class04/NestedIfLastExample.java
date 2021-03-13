package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		/*
		 * to donate
		 * you must be 18 or older, otherwise you cannot
		 * your weight must be more than 110 lbs, otherwise you cannot donate
		 */

		
		int age=19;
		int weight=112;
		 if (age>=18) {
			 System.out.println("Can donate");
			 if (weight>110) {
				 System.out.println("is also eligible");
			 }else {
				 System.out.println("Otherwise cannot donate");
			 }
		 }else {
			 System.out.println("You cannot donate");
		 }
	}

}
