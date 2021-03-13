package com.class04;

import java.util.Scanner;

public class NestedExample {

	Scanner input=new Scanner(System.in); {
		boolean diploma=true;
		double gpa=3.5;
		
		if (diploma) {
			System.out.println("Congragulations");
			if (gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
				
			}else {
				System.out.println("You should have studied harder");
			}
			
		}
		
		System.out.println("-----------------------------------------");
		
		
		double rate=4.5;
		int price=200000;
		if (rate>4.5) {
			System.out.println("User will not buy a house");
		
		     if (rate<=4.5) {
				System.out.println("User will buy a house");
				
			}else if (price>200000) {
				System.out.println("User will take a loan");
			
			}else {
				System.out.println("User will pay cash");
			}
		}
		
		
		}
		

	}


