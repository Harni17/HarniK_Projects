package com.HarniK.Assisted_Project;

public class increasingSub {
	static int max_ref; 
	static int _lis(int arr[], int n){
		if (n == 1)
			return 1;

		int result, max_end = 1;

		for (int i = 1; i < n; i++) {
			result = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && result + 1 > max_end)
				max_end= result + 1;
		}

		if (max_ref < max_end) 
			max_ref = max_end;
		return max_end;
	}
		
	static int lis(int arr[], int n){
		max_ref = 1;
		_lis(arr, n);
		return max_ref;
	}
	
	public static void main(String args[]){
		int arr[] = { 2, 33, 5, 8, 3, 21, 54, 48, 70, 80 };
		int n = arr.length;
		System.out.println("Elements of given array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("\nLength of list is " + lis(arr, n)+ "\n");
	}

}
