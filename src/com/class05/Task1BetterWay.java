package com.class05;

import java.util.Scanner;

public class Task1BetterWay {

	public static void main(String[] args) {
		int h;
		Scanner input;
		 input=new Scanner(System.in);
		 
		 System.out.println("Please enter height");
		 h=input.nextInt();
		 String definition;
		 
		 if ( h<=60) {
			definition="short";
			
		}else if (h>60 && h<=72) {
			definition="medium";
			
		}else  {
			definition="tall";
		}
		 System.out.println("You are a person who's height is "+definition);

	}

}
