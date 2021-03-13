package com.class11;

public class NestedForLoopFor2DArray {

	public static void main(String[] args) {
	
		int[][] nums= {
				{10,20,30,40},
				{90,80},
				{1,2,3,4,5,6,7}
		};
		
		System.out.println(nums.length);
		System.out.println(nums[1].length);
		
		System.out.println("--------------- nested for loop------------------------------");
		
		for(int r=0; r<nums.length; r++) {
			for(int c=0; c<nums[r].length; c++) {
				System.out.print(nums[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------Advanced nested for loop------------------------------------");
		
		for(int[] array:nums) {
			
			for(int a:array ) {
				
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
