package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {

		/*
		 * store gender using M or F based on gender we will specify if M-->Male if
		 * F-->Female otherwise--->not sure
		 * 
		 */

		char gender = 'A';
		String description;

		switch (gender) {

		case 'M':
			description = "Male";
			break;
		case 'F':
			description = "Female";
			break;
		default:
			description = "N/A";

		}

		System.out.println(description);
		
		/*Limitation:
		 * 
		 * switch cannot use Relational or Logical Operators(it simply check equality)
		 * 
		 * switch cannot be used with boolean, double, float,long
		 */

		System.out.println("----------------------------");
	}

}
