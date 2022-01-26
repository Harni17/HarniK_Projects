package com.HarniK.Assisted_Project;
import java.util.Arrays;
import java.util.Scanner;

public class exponential_Search {
	public static  void main(String[] args){
		int[] arr = {6,12,18,24,32};
	    int length= arr.length;
	    
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
		int value = sc.nextInt();
	   
	    int search = exponentialSearch(arr,length,value);

	    if(search<0){
	    	System.out.println( "Element Not Found!!");
	    	}
	    else{
	    	System.out.println( "Element Found at "+search+" index");
	    	}
	    }
	
	public static int exponentialSearch(int[] arr ,int length, int value ){
		if(arr[0]==value){
			return 0;
			}
		int i=1;
		while(i<length && arr[i]<=value){
			i=i*2;
			}
		return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
		}
	}
