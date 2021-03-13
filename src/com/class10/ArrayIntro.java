package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int num = 10;
		num = 20;
		System.out.println(num);

		System.out.println("----------------------------------------------------");
		int[] array = new int[5];

		array[0] = 10;
		array[1] = 12;
		array[2] = 15;
		array[3] = 9;
		array[4] = 13;

		System.out.println(array[0] + array[4]);

		System.out.println("----------------------------------------------------");

		double[] numbers = new double[2];
		numbers[0] = 10.99;
		numbers[1] = 19.01;

		numbers[0] = 11.99;

		System.out.println(numbers[0]);

		System.out.println("----------------------------------------------------");
		// Arrays are fixed in size

		String[] names = new String[3];
		names[0] = "Jahanzeb";
		names[1] = "Ozoda";
		// names[2]="Alex";
		// names[3]="Yulia";

		System.out.println(names[2]);

		System.out.println("----------------------------------------------------");

		int[] nums = new int[3]; // more preferable way

		System.out.println(nums[1]);

		System.out.println("----------------------------------------------------");

		boolean b[] = new boolean[3]; // not more preferable
		b[0] = true;
		b[1] = true;
		b[2] = false;
		System.out.println(b[2]);

		System.out.println("----------------------------------------------------");

		int size = b.length;
		System.out.println("Size of an array is " + size);

		System.out.println("----------------------------------------------------");

	}

}
