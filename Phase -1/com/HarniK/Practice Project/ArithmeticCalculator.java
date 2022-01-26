package com.HarniK.Practice_Project;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter two numbers: ");
		int firstNo = sc.nextInt();
		int secondNo = sc.nextInt();
		
		System.out.println("Enter the arithmetic operator: ");
		char arithmetic = sc.next().charAt(0);
		double result=0;

		switch(arithmetic){
		case '+': 
			result=firstNo+secondNo;
			break;
		case '-':
			result=firstNo-secondNo;
			break;
		case '*':
			result=firstNo*secondNo;
			break;
		case '/':
			result=firstNo/secondNo;
			break;
		}
		System.out.println("the result is: " +result);
	}

}
