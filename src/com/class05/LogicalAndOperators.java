package com.class05;

public class LogicalAndOperators {

	public static void main(String[] args) {
		
		/*we have to identify if number is small, medium, larger, xlarge
		 *if number is between 1 and 10 --> small
		 *if number is between 11 and 100---> medium
		 *if number is between 101 and 1000---> large
		 *if number is between 1001 and 100000000--->xlarge 
		 */
		int num=2;
		
		
		if (num<1) {
			System.out.println("Number is 0 or negative");
		}else if (num>=1 && num<=10) {
		
			System.out.println(num+" is a small number");
		}else if (num>=11 && num<=100) {
			
			System.out.println(num+" is a medium number");
		}else if (num>=101 && num<=1000) {
			
			System.out.println(num+" is a larger number");
		}else if (num>=1001 && num<=100000) {
			
			System.out.println(num+" is a xlarge number");
		}else {
			System.out.println(num+" is a huge number");
			
		}
		
		
	}

}
