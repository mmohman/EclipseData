package com.class10;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];

		for (int r = 0; r < 5; r++) {
			nums[r] = scan.nextInt();
			if (r % 10 == 0) {
				System.out.println(nums[r]);

			}
		}
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
