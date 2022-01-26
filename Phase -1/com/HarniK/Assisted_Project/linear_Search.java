package com.HarniK.Assisted_Project;
import java.util.Scanner;

public class linear_Search {
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int searchValue = sc.nextInt();
        int result = linear(arr,searchValue);
        
        if(result==-1){
        	System.out.println("Element not in the array");
        	}
        else{
        	System.out.println("\nElement Found!!\nElement found at "+result+" index");
        	}
        }
	
	public static int linear(int arr[], int x) {
		int arrlength = arr.length;
		for (int i = 0; i < arrlength; i++) {
			if (arr[i] == x) {
				return i;
				}
			}
		return -1;
		}
	}
