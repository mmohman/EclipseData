package com.class10;

public class Task2 {

	public static void main(String[] args) {
		String[] name=new String[7];
		name[0]="Brain";
		name[1]="Chris";
		name[2]="Edwin";
		name[3]="Jesus";
		name[4]="Kisanet";
		name[5]="Maria";
		name[6]="Maleku";
		System.out.println(name[5]);
		
		String[] name1= {"Brian","Chris","Edwin","Jesus","Kisanet","Maria","Maleku"};
		System.out.println(name1[5]);
		
		
		System.out.println("-----------------------------------");
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		System.out.println("---------------All elements from an array-----------------------------------------");
		
		//how to get all elements from an array
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
			
		}
		
		
		
		
		
		
		
		

	}

}
