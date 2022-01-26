package com.HarniK.Assisted_Project;

public class quick_Sort {
	public static void main(String args[]){
		int arr[] = {20, 5, 43, 64, 17, 12};
        int n = arr.length;

        quick_Sort qs = new quick_Sort();
        qs.sort(arr, 0, n-1);

        System.out.println("The elements in the array are sorted :");
        printArray(arr);
        }
	int partition(int arr[], int low, int high){
		int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++){ 
        	if (arr[j] <= pivot){
        		i++;
        		
        		// swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
        	}
        
        // swap arr[i+1] and arr[high] 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
        }
	
	void sort(int arr[], int low, int high){
		if (low < high){
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
            sort(arr, pi+1, high);
            }
		}
	
	static void printArray(int arr[]){
		int n = arr.length;
        for (int i=0; i<n; ++i) {
        	System.out.print(arr[i]+" ");
        	}
        System.out.println();
        }
	}
