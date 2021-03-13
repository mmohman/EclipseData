package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=true;
		boolean classToday=false;
		
		//is it morning?----> Good morning
		  //     if there is a class: yes-----> hello classmates
		 //                otherwise-----> hello my family
		if (morning) {
			System.out.println("Let me check if I have class today");
			if(classToday) {
				System.out.println("Good morning my classmates");
			}else {
				System.out.println("Good morning my family");
			}
		}

		System.out.println("-----End of code-----");
		
		System.out.println("----------------------Example 2------------------");
		
		boolean anyAllergy=true;
		boolean pollenAllergy=false;
		
		if(anyAllergy) {
			System.out.println("Let's check which allergies you have");
			if (pollenAllergy) {
				System.out.println("Do not get closed to tress");
			}else {
				System.out.println("Ok I know you do not have pollen allergy");
			}
			
		}else {
			System.out.println("You are lucky not having any allergies");
		}
		
		System.out.println("------------------------Example 3-------------------");
		
		/*
		 * if it is friday------> go to the movie, otherwise saty at home and study
		 * if it is friday then i will check if day is 13---> watch a scary movie
		 *          if not ----> watch any movie you like
		 */
		
		boolean isFriday=true;
		int day=13;
		
		if(isFriday) {
			System.out.println("It is a movie day !!!!");
			if (day==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch any other movie");
			}
			
		}else {
			System.out.println("I will stay at home and study Java");
		}
		
		
		System.out.println("------------------examples---------------------");
		
		
		/*check assignment and based on score we display a message
		 * 
		 */
		
		boolean completed=true;
		int score=88;
		
		if (completed) {
			
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Good, but try to do better");
			}else {
				System.out.println("Good job for trying, but study more");
			}
		
		
		}else {
			System.out.println("Please makesure to complete assignments on time");
		}
		
		System.out.println("--------------example----------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
