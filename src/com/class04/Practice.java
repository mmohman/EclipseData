package com.class04;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
		  
		   System.out.println("Enter your name");
		   String name=scan.next();

		   System.out.println("Enter your age");
		   int age=scan.nextInt();

		   System.out.println("Enter your mobile number");
		   int mobile=scan.nextInt();
		   
		   System.out.println("Your name is "+name+", "+"your age is "+age+" and your mobile number is "+mobile);

	}

}
