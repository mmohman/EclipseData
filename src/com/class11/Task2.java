package com.class11;

public class Task2 {

	public static void main(String[] args) {

		String[][] name = new String[2][4];
		// 1 array or 1 row
		name[0][0] = "Mr";
		name[0][1] ="Mrs";
		name[0][2] = "Ms";
		name[0][3] = "Miss";

		// 2 array or 2 row
		name[1][0] = "Smith";
		name[1][1] = "Jordan";
		name[1][2] = "Jackson";
		name[1][3] = "Obama";

		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);
		
		String[][] names = new String[2][4];
		// 1 array or 1 row
		names[0][0] = "John";
		names[0][1] ="Gale";
		names[0][2] = "Jonathan";
		names[0][3] = "Alexa";
		
		char[][] grades=new char[1][2];
		grades[0][0]='A';
		grades[0][1]='B';
		
		System.out.println(names[0][0]+" "+grades[0][0]);
		System.out.println(names[0][1]+" "+grades[0][1]);
		System.out.println(names[0][2]+" "+grades[0][0]);
		System.out.println(names[0][3]+" "+grades[0][1]);
	}
	

}
