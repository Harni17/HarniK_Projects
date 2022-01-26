package com.HarniK.Assisted_Project;

public class tryCatch {
	public static void main(String args[]){
        int[] array = new int[4];
        
        try {
            array[5] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index not matched!"); 
        }
        finally{
            System.out.println("The size of array is " + array.length);
        }
    }

}
