package com.class05;

import java.util.Scanner;

public class LogicalOperatorTask {

	public static void main(String[] args) {
		
		int h;
		Scanner input;
		 input=new Scanner(System.in);
		 
		 System.out.println("Please enter height");
		 h=input.nextInt();
		 
		 if ( h<=60) {
			System.out.println("You are person who's height is short");
			
		}else if (h>60 && h<=72) {
			System.out.println("You are person who's height is medium");
			
		}else  {
			System.out.println("You are person who's height is tall");
		}
		

	}

}
