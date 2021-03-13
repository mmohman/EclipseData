package com.class02;

public class StringExamples {

	public static void main(String[] args) {
		
		String name;
		name="Maria";
		
		String greeting="Good Morning!";
		String phoneNumber="571-552-2860";
		String stringNumber="12";
		String space=" ";
		String letter="A"; //no space
		String letter2="A ";  //space
		char oneLetter='A';
		
		//Hello, my name is Maria
		System.out.println("Hello, my name is "+name); //space
		//spaces inside the quotation matters
		
		//How are you Maria?
		System.out.println("How are you "+"name"); //no quotation around variables
		
		int age=25;
		//I am 25
		System.out.println("I am "+age);
		
		char grade='A';
		//Maria is A student
		 
		System.out.println(name +" is "+grade+" student");
		 
		/*
		 * String concatenation operator + can be used when
		 * we attach string to another string
		 * we attach string to a number
		 * we attach string to any character or boolean
		 */
		String car="Tesla";
		int year=2021;
		//I drive 2021 Tesla
		 System.out.println("I drive "+year+" " +car); //space
		 
		 String computer="Macbook";
		 int memory=250;
		 //Maria has MAcbook with 250 GB memory
		 System.out.println(name+" has "+computer+" with "+memory+" GB memory");
		 String combineValues=year+" "+car;
		 System.out.println(combineValues);
		 
		 byte day=7;
		 String month="February ";  //space
		 String date=month+day;
		 System.out.println(date);
		 
		 
		 
		 
		 
	}

}
