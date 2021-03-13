package com.class04;
     //shortcut to import for window: ctrl+shift+o
import java.util.Scanner;

public class DemoClass {

	Scanner input=new Scanner(System.in); {
		

		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter any text");
        String text=scan.nextLine(); //captures text with spaces
		
		System.out.println("Text that I entered is -"+text);
		
		System.out.println("Please enter you name");
		String name=scan.next(); //captures 1 word till space
		System.out.println("Nice to meet you "+name);
		
		System.out.println("Please enter you age");
		int age=scan.nextInt();
		System.out.println("My name "+name+" and I am "+age+" years old");
		
	}
	

}
