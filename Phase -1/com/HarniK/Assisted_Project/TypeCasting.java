package com.HarniK.Assisted_Project;
import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args){
		
	System.out.println("Explicit Type Casting");
	
	Scanner sc = new Scanner(System.in);
	
	double p= sc.nextDouble();
	int q=(int)p;
	System.out.println("p= "+p);
	System.out.println("q= "+q);
	
	System.out.println("---------------------");
	
	
	System.out.println("Implicit Type Casting");
	char a='H';
	System.out.println("a = "+a);
			
	int b=a;
	System.out.println("b= "+b);
			
	long c=b;
	System.out.println("c= "+c);
			
	double d=a;
	System.out.println("d= "+d);
			
	float e=a;
	System.out.println("e= "+e);


}
}
