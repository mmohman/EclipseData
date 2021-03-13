package com.class05;

import java.util.Scanner;

public class LogicalOperatorExample2 {

	public static void main(String[] args) {
		 
		 int d;
		 Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a day");
		  d=scan.nextInt();
		 if (d>=1 && d<=5) {
			  System.out.println("Weekday");
		  }else if (d>=6 && d<=7) {
			  System.out.println("weekend");
		  }
		  else {
			  System.out.println("invalid");
		  }
		  System.out.println("--------------------------");
		  
		 
          System.out.println("Enter your day");
		  int day=scan.nextInt();
		  
		  if (day==1 || day==2 || day==3 || day==4 || day==5) {
			  System.out.println("It is weeday");
		  }else if (day==6 || day==7) {
			  System.out.println("It is weekend");
		  }else {
			  System.out.println("Invalid day");
		  }
		  
		  
		  
		  
	}

}
