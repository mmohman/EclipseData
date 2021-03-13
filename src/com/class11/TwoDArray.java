package com.class11;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] num = new int[3][4];
		// 1 array or 1 row
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		num[0][3] = 4;

		// 2 array or 2 row
		num[1][0] = 10;
		num[1][1] = 20;
		num[1][2] = 30;
		num[1][3] = 40;

		// 3 array or 3 row
		num[2][0] = 100;
		num[2][1] = 200;
		num[2][2] = 300;
		num[2][3] = 400;

		System.out.println(num[1][3]);
		System.out.println(num[2][2]);

		System.out.println("Another way of creating a 2D array");

		int[][] numbers = { 
					{ 1, 2, 3, 4 },
					{ 10, 20, 30, 40 },
					{ 100, 200, 300, 400 }, 
				};
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][1]);
		
		//what will be the output
		int sum=numbers[1][2]+numbers[0][3];
		System.out.println(sum);
		
		//what is the output
		// System.out.println(numbers[0][4]); does not exist 
	
		//we changed the value of numbers[2][2] from 300 to 500
		numbers[2][2]=500;
		System.out.println(numbers[2][2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
