package com.HarniK.Assisted_Project;

public class range {
	public static void main(String args[]){ 
        int arr[] = { 2, 17, 12, 4, 8, 27 }; 
        int n = arr.length; 
        rangeTable(arr, n); 
        System.out.println(query(0, 5)); 
        System.out.println(query(3, 5));  
    }
	
	static int k = 20;
	static int N = 20000;
	static long table[][] = new long[N][k + 1];
	
	static void rangeTable(int arr[], int n){
		for (int i = 0; i < n; i++)
			table[i][0] = arr[i];
		for (int j = 1; j <= k; j++)
			for (int i = 0; i <= n - (1 << j); i++)
				table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
		}
	static long query(int L, int R){
		long result = 0;
		for (int j = k; j >= 0; j--){
			if (L + (1 << j) - 1 <= R){
				result = result + table[L][j];
				L += 1 << j;
				}
			}
		return result;
		}
	}