package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		 //1 way to create a variable
		short b=200; //create a variable and assign value
		             //declare a variable and initialized
		
		//2 way
		int sum; //declaration happens only once
		sum=20; //initialized the variable
		

		sum=30; //reassign the value
		/*
		 * int x;
		 * int y;
		 * int z;
		 */
		int x,y,z;
		x=10;
		y=20;
		z=30;
		//i would like to change the value of x
		x=70;
		System.out.println(x);
		
		int num=33;
		int num2=num; //33
		System.out.println(num2);
	}

}
