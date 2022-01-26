package com.HarniK.Assisted_Project;

public class insertion_Sort {
	public static  void main(String[] args){

        int[] arr = {29,12,3,2,48};
        Sort(arr);
        System.out.println("The elements in the array are sorted :");
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        	}
        }
	
	public static void Sort(int[] arr){
		int len = arr.length;
		for(int j=1;j<len;j++){
			int key = arr[j];
			int i=j-1;
			while ((i>-1) && (arr[i]>key)) {
				arr[i+1]=arr[i];
				i--;
				}
			arr[i+1]=key;
			}
		}
	}
