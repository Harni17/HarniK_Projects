package com.HarniK.Assisted_Project;

public class polymorphism {
	public static void main(String args[]){ 
		Multiply m = new Multiply(); 
        System.out.println(m.mult(10, 22)); 
        System.out.println(m.mult(20, 20, 30)); 
        System.out.println(m.mult(20.5, 30.5)); 
    } 
}

class Multiply{
    public int mult(int a, int b){ 
        return (a * b); 
    } 
    
    public int mult(int a, int b, int c){ 
        return (a * b * c); 
    } 
    
    public double mult(double a, double b){ 
        return (a * b); 
    } 
}


