package com.class05;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		

		/*ask user to enter age
		 * based on the age we will define
		 * if age is from 1 to 3---> you are baby
		 * if age is from 3 to 5--> you are bigger baby
		 * if age is 5 to 12--> you are a kid
		 * if age is 13to 19--->teenager
		 * if age above 20-->you are an adult
		 */

		Scanner input;
		int age;
		String name;
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.nextLine();
		
		System.out.println("Please your age");
		age=input.nextInt();
		
		if (age>=1 && age<=2) {
			System.out.println(name+" you are baby");
		} else if (age>=3 && age<=5) {
			System.out.println(name+" you are bigger baby");
		}else if (age>=6 && age<=12) {
			System.out.println(name+" you are a kid");
		}else if (age>=13 && age<=19) {
			System.out.println(name+" you are teenager");
		}else {
			System.out.println(name+" you are an adult");
		}
		
		
		
		
	}

}
