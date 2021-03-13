package com.class04;

public class NestedIfElseExamples {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.7;
		
		if (diploma) {
			System.out.println("Congratulations");
			
			if (gpa > 3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
			
		}else {
			System.out.println("Maybe you should get a degree");
		}
		
		System.out.println("-------------------------------------------");
		
		double rate=4.6;
		int price=10000;
		
		if (rate<4.5) {
			System.out.println("User will not buy a house");
		
		}else {
			System.out.println("User will consider buying");
			if (price>200000) {
				System.out.println("I need a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
