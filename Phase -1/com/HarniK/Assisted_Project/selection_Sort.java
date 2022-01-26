package com.HarniK.Assisted_Project;

public class selection_Sort {
	public static void main(String[] args) {
		int arr[] = {19,62,55,16,98,36,52,88};
		
	    int length = arr.length;
	    Sort(arr);
	    System.out.println("The elements in the array are sorted :");
	    for(int i:arr){
	    	System.out.println(i);
	    	}
	    }
	
	public static void Sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index =i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index =j;
					}
				}
			int smallNumber = arr[index];
			arr[index]= arr[i];
			arr[i]= smallNumber;
			}
		}
	}
