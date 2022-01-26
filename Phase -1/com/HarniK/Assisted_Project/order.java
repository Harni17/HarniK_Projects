package com.HarniK.Assisted_Project;

public class order {
	public static void main(String[] args) {
		KthSmallest ob = new KthSmallest(); 
        int arr[] = {17, 2, 8, 70, 4, 19, 46}; 
        int n = arr.length,k = 4;
        
        System.out.println(k+"'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }
}

class KthSmallest{
	int kthSmallest(int arr[], int l, int r, int k){ 
             		if (k > 0 && k <= r - l + 1) { 
            			int pos = randomPartition(arr, l, r); 
            			if (pos-l == k-1) 
                			return arr[pos]; 
            			if (pos-l > k-1) 
                			return kthSmallest(arr, l, pos-1, k); 
            			return kthSmallest(arr, pos+1, r, k-pos+l-1); 
        		} 
        return Integer.MAX_VALUE; 
    } 

    void swap(int arr[], int i, int j){ 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
    
    int partition(int arr[], int l, int r){ 
        int x = arr[r], i = l; 
        for (int j = l; j <= r - 1; j++){ 
            if (arr[j] <= x){ 
                swap(arr, i, j); 
                i++; 
            } 
        } 
        swap(arr, i, r); 
        return i; 
    } 
    
    int randomPartition(int arr[], int l, int r){ 
        int n = r-l+1; 
        int pivot = (int)(Math.random()) * (n-1); 
        swap(arr, l + pivot, r); 
        return partition(arr, l, r); 
    } 
}  

