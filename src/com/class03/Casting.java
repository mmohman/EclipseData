package com.class03;

public class Casting {

	public static void main(String[] args) {
		
	//	int i=10; //instead of int try decimal value
	// error type mismatched	int i=10.99; 
		
		//widening or implicit casting  (from small to big value)
		double d=10; //int type of value but does not complain
		System.out.println(d); //10.0
		
		
		//explicit or narrowing casting  (from big to small value)
		int i=(int)12.99;
		System.out.println(i); //12
		
		byte b=(byte)130;
		System.out.println(b); //-126
		
		int cakePrice=11;
		cakePrice/=4;
		System.out.println(cakePrice); //the result does not show decimals (2)
		
		int number=12;
		double result=number/5;
		System.out.println(result);  //2.0
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum);
		
	  // int num1=10+10.5;
		
		double num1=10+10.5;
		System.out.println(num1);
		
		
		
		
		
		
		
		
		
		
		

	}

}
