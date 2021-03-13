package com.class11;

public class Practice {

	public static void main(String[] args) {
		System.out.println("_____________dmv group tasks____________________");
		System.out.println("__________________Number 1__________________________");
		int[][] numbers = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9, } };
		int sum = 0;
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println(numbers[row][col] + " ");
				{
					sum += numbers[row][col];
				}
			}
			System.out.println("Sum of all numbers are " + sum);
		}

		System.out.println();
		System.out.println("_____________________Number 2_________________________________");
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
		System.out.println("Sum of rows and columns are =" + sum);

		System.out.println();
		System.out.println("______________Number 3______________________________");
		int[][] number = { { 1, 3, 31, 7 }, { 6, 12, 44, 28 }, { 9, 13, 15, 21 } };
		int sumeven = 0;
		int sumodd = 0;

		for (int row = 0; row < number.length; row++) {
			for (int col = 0; col < number[row].length; col++)

				if (col % 2 != 0) {
					sumodd += number[row][col];
				} else {
					sumeven += number[row][col];
				}

			

		}System.out.println("Sum of even numbers are =" + sumeven);
			System.out.println("Sum of odd numbers are =" + sumodd);

		System.out.println();
		System.out.println("______________________Number 4__________________________");

		int count=0;
		String[][] countries = { { "Canada", "United States", "Mexico" }, { "Brazil", "Colombia", "Peru" },
				{ "Germany", "France", "Italy" }, { "Japan", "India", "China", }, { "Nigeria", "Ethiopia", "Egypt" } };

		System.out.println(countries.length); // 5 rows
		System.out.println(countries[0].length);// 3 columns

		for (int r = 0; r < countries.length; r++) {

			for (int c = 0; c < countries[r].length; c++)
				System.out.print(countries[r][c] + ",  ");
		}
		System.out.println("------------------------------------------------");

		for (String[] cities : countries) {
			for (String city : cities) {
				System.out.print(city + ", ");
				count++;

			}

		}

	}


}
