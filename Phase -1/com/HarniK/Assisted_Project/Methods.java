package com.HarniK.Assisted_Project;

public class Methods {
	public static void main(String[] args) {

		Methods b=new Methods();
		int result= b.multiplyNo(2,5);
		System.out.println("Multipilcation is :"+result);
		
//		over load
		overloadMethod ob=new overloadMethod();
	       ob.area(2,5);
	       ob.area(4);
	       
//	    call by value  
	    callMethod d = new callMethod();
	   	System.out.println("\nBefore operation value of data is "+d.val);
	   	d.operation(100);
	   	System.out.println("After operation value of data is "+d.val);
	   	}
	
public int multiplyNo(int x,int y) {
	int z=x*y;
	return z;
}

}

class overloadMethod {
	public void area(int b,int h){
         System.out.println("\nArea of Triangle : "+(0.5*b*h));
    }
    public void area(int r) {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
}

class callMethod {

int val=500;

int operation(int val) {
	val =val*10/100;
	return(val);
}
}
