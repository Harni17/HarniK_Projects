package com.HarniK.Assisted_Project;
import java.util.Scanner;

public class defaultConstructor {
	public static void main(String[] args) {

		System.out.println("Enter first student details:");
		student emp1=new student();
		System.out.println("Enter second student details:");
		student emp2=new student();
		
        System.out.println("Student Details:");
        System.out.println("ID   NAME ");
		System.out.println("------------");
		emp1.display();
		emp2.display();
		}
}

class student{
//	int id;        -> 0
//	String name;   -> null
	
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int id=sc.nextInt();
	
	void display() {
	System.out.println(id+"   "+name);
	}
}

