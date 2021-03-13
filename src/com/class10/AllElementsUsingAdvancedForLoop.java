package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {

		int[] nums = { 10, 14, 78, 5, 90 };

		// for each, enhanced for loop, advanced for loop Used only with arrays or collections 

		for (int a : nums) {
			System.out.print(a+" ");

		}
		
		
		System.out.println("-----------------First way--------------------------------------");


		String[] name1= {"Brian","Chris","Edwin","Jesus","Kisanet","Maria","Maleku"};
		
		for(int i=2; i<name1.length; i++) {
			System.out.print(name1[i]+" ");
		}
		
		System.out.println();
		System.out.println("_-----------------Second way-------------------------------");
		
		for (String b : name1) {
			System.out.print(b+" ");

		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------");
		

		char[] grades= {'A','B','C','D','E','F','G','H'};
		

		for (char b : grades) {
			System.out.print(b+" ");

		}
		System.out.println();
		System.out.println("--------------------------------------------");
		
		boolean [] boo= {true, false, false, false, true};
		
		for ( boolean b:boo) {
			System.out.print(b+" ");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
