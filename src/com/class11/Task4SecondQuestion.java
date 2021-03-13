package com.class11;

public class Task4SecondQuestion {

	public static void main(String[] args) {

		int[][] nums = { { 2, 4, 12, 18, }, { 1, 13, 27, 89 }, { 26, 47, 10, 53 },

		};

		System.out.println(nums.length);// 3 rows
		System.out.println(nums[0].length);// columns

		System.out.println("__________________First way________________________________");
		
		System.out.println("Print even numbers");
		
		for (int r = 0; r < nums.length; r += 2) {
			for (int c = 0; c < nums[r].length; c++) {
				if (r % 2 == 0 || c % 2 == 0) {
					System.out.print(nums[r][c] + ", ");
				}
			}
			System.out.println();

		}

		System.out.println();
		System.out.println("________________Second way_______________________________________");

		for (int[] i : nums) {

			for (int a : i) {
				if (a % 2 == 0) {
					System.out.print(a + ", ");
				}

			}
			System.out.println();
		}

	}

}
