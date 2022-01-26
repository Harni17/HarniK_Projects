package com.HarniK.Assisted_Project;

public class dimensionalString {
	public static void main(String[] args) {

		//single-dimensional array
		int single[]= {15,21,43,26,78};
		
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array single: "+single[i]);
		}
		
		//multidimensional array
		int[][] multi = {{2, 4, 6, 8}, 
		                  {3, 6, 9} };
		      
		System.out.println("\nLength of row 1: " + multi[0].length);

	} 

}
