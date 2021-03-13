package com.class11;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("__________________Number 5______________________");
		 int x = 10;
		    int y = 5;
		    x = x + y;
		    y = x - y;
		    x = x - y;
		    System.out.println("After Swaping:"+"x="+x+", y ="+y);
		    
		    System.out.println();
		    System.out.println("_____________________Number 6________________________");
		    
		    int num = 29;
			   boolean value = true;
			   for (int i = 2; i <= num / 2; ++i) {
			  
			     if (num % i == 0) {
			       value = false;
			       break;
			     }
			   }
			   if (!value)
			     System.out.println(num + " is not a prime number.");
			   else
			     System.out.println(num + " is a prime number.");
			   
			   System.out.println();
			   System.out.println("___________________Number 7_______________________");
			   
			   int n1 = 0, n2 = 1, n3, i, count = 10;
				System.out.print(n1 + " " + n2);
				for (i = 2; i < count; ++i) {
					n3 = n1 + n2;
					System.out.print(" " + n3);
					n1 = n2;
					n2 = n3;
				}
				
				System.out.println();
				System.out.println("_________________Number 8__________________");
				
				int arr[] = {32, 14, -24, 0, -32, 95, -33, 29, 7};		
				   int max = arr[0];
				   int min = arr[0];
				  
				   for(int b = 1; b < arr.length; b++){
				     if(max < arr[b]){
				       max = arr[b];
				     }else if(min > arr[b]){
				       min = arr[b];
				     }		   		 
				   }
				   System.out.println("Maximum number = " + max);
				   System.out.println("Minimum number = " + min);
				   
				   System.out.println();
				   System.out.println("_______________________Number 9_______________________");
				   int largest = 0;
					int secondLargest=0;
					
					int[] arre= {9,2,60,13,27};
					
					for(int c = 0; c<arre.length; c++){
						
						if(arre[c]>largest) {
							secondLargest = largest;
							largest= arr[c];
						}else if(arre[c]>secondLargest) {
							secondLargest = arre[c];
						}
						
					}
					
					System.out.println("The second Largest number is "+secondLargest);
			
		              
	}
}
