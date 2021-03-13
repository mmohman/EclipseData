package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		/*we need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * based on the country identify favorite food
		 */
		
		Scanner input;
		String country,food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		case "USA":
			food="Burger";
			break;
		case "Afghanistan":
			food="Kabob";
			break;
		case "Vietnam":
			food="Phon";
			break;
		case "Poland":
			food="Pierogi";
			break;
		case "Kazakstan":
			food="Horse";
			break;
		case "Belarus":
			food="draniki";
			break;
		case "Tajikistan":
			food="plov";
			break;
		case "Mexico":
			System.out.println("tacos");
			break;
		default:
			food="unknown";
			

			System.out.println("Your favorite food is "+food);
		}
		
		
		

	}

}
