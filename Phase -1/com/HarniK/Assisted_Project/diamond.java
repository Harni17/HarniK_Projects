package com.HarniK.Assisted_Project;

public class diamond implements diamond1, diamond2 {
	public static void main(String args[]){ 
		diamond obj = new diamond(); 
        obj.display(); 
    } 
	public void display(){  
		diamond1.super.display(); 
		diamond2.super.display(); 
    } 
}

interface diamond1{  
    default void display(){ 
        System.out.println("This is diamond1"); 
    } 
} 

interface diamond2{  
    default void display(){ 
        System.out.println("\nThis is diamond2"); 
    } 
}  
