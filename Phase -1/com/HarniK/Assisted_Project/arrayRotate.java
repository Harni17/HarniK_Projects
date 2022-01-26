package com.HarniK.Assisted_Project;

public class arrayRotate {
	public static void main(String[] args) {
		Rotation rot = new Rotation();
        		int arr[] = { 15, 23, 54, 59, 96, 70 }; 
        		rot.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}

class Rotation { 
public void rotate(int[] num, int k) {
    		if(k > num.length) 
       			k=k%num.length;
    		
 		int[] result = new int[num.length];
 		for(int i=0; i < k; i++){
        			result[i] = num[num.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<num.length; i++){
        			result[i] = num[j];
        			j++;
    		}
 		System.arraycopy( result, 0, num, 0, num.length );
 		}
} 
