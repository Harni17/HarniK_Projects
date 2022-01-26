package com.HarniK.Assisted_Project;
import java.util.Scanner;

public class binary_Search {
	public static  void main(String[] args){
		int[] arr = {23,7,12,9,18};
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
		int key = sc.nextInt();
		
        int arrlength = arr.length;
        Search(arr,0,key,arrlength);
        }
	public static void Search(int[] arr, int start, int key, int length){
		int midValue = (start+length)/2;
		while(start<=length){
        	if(arr[midValue]<key){
            	start = midValue + 1;
            	}
            else if(arr[midValue]==key){
                System.out.println("Element found at "+midValue +" index");
                break;
            }
            else{
            	length=midValue-1;
            }
        	midValue = (start+length)/2;
        	}
		
		if(start>length){
			System.out.println("Element is not found");
			}
		}
	}
