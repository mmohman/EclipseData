package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strassburg", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},
				{"Miami","Orlando", "Tampa","Tallahasee"},
		};
		
		System.out.println(usa.length);//5 rows
		System.out.println(usa[0].length);// 5 columns in 1 array
		System.out.println(usa[1].length);// 3 columns in 2 array
		System.out.println(usa[2].length);// 4 columns in 3 array
		System.out.println(usa[3].length);// 5 columns in 4 array
		System.out.println(usa[4].length);// 4 columns in 5 array
		
		System.out.println("______________________________________________________");
		
		for (int r=0; r<usa.length; r++) {
			
			for(int c=0; c<usa[r].length; c++) {
				
				System.out.print(usa[r][c]+", ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(" ----using nested for each loop-------");
		System.out.println();
		
		for(String[] cities:usa) {
			for(String a:cities) {
				System.out.print(a+",  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
