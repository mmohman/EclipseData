package com.class05;

import java.util.Scanner;

public class LogicalOperatorTask2 {

	public static void main(String[] args) {
		
		
		Scanner score;
		int quiz,midterm,finaly,gpa;
		char grade;
		score=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		quiz=score.nextInt();
		
		System.out.println("Please emter your midterm score");
		midterm=score.nextInt();
		
		System.out.println("Please enter your final score");
		finaly=score.nextInt();
		
		gpa=(quiz+midterm+finaly)/3;
		
		if (gpa>=90) {
			grade='A';
		}else if (gpa>=70 && gpa<90) {
			grade='B';
			
		}else if (gpa>=50 && gpa <70) {
			grade='C';
			
		} else if (gpa<50) {
			grade='F';
		}else {
			grade='D';
		}
		System.out.println("Your gpa is " +grade);
		
		if (grade=='A' || grade=='B') {
			System.out.println("I am happy !!!");
		}
		
		
		
		
		
		
		
		

	}

}
