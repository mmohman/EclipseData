package com.class04;

public class NestedExam {

	public static void main(String[] args) {
		
		double rate=4.6;
		int price=10000;
		
		if (rate<4.5) {
			System.out.println("User will  buy a house");
		
			if (price>200000) {
				System.out.println("I need a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}else {
			System.out.println("User will not consider buying");
			
		}

	}

}
