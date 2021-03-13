package com.class11;

public class Task3 {

	public static void main(String[] args) {
		String[][] cars= {
				{"Chevy", "Ford"},
				{"Volkswagen", "Audi", "Mercedez"},
				{"Hyundai","Kia"},
				{"Fiat","Alfa","Romeo","Maserati"},
		};
		
		for(int r=0; r<cars.length; r++) {
			for(int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		for(String[] model:cars) {
			for(String a:model) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		String[][] grocery= {
				{"Cucumber","Carrots"},
				{"Apple","Banana","Strawberry"},
				{"Milk","Yogurt"},
				{"Cookies", "Biscuits",},
		};
		
		for(int r=0; r<grocery.length; r++) {
			for(int c=0; c<grocery[r].length; c++) {
				System.out.print(grocery[r][c]+" , ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-------------------");
		
		for(String[] array:grocery) {
			for(String a:array) {
				System.out.print(a+", ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
