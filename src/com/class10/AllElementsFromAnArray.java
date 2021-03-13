package com.class10;

public class AllElementsFromAnArray {

	public static void main(String[] args) {
		int[] nums = { 10, 14, 78, 5, 90, 76, 1, 8 };

		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + " ");
		}

		System.out.println();
		System.out.println("-----------------Print in reverse-----------------------------------------");

		for (int i = nums.length - 1; i >= 0; i--) {

			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");

		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				System.out.print(nums[i] + " ");
			}
		}
			System.out.println();
			System.out.println("--------------------------------------------");

			for (int a : nums) {
				if(a%2==0) {
					System.out.print(a+" ");
				}
			}
				
			
			
			
			
			
			
			
			
		
	}

}
