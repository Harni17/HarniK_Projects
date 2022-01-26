package com.HarniK.Assisted_Project;

public class parameterConstructor {
	public static void main(String[] args) {
		Students student1 = new Students(21,"Harni");
		Students student2 = new Students(22,"Hani");
		
		System.out.println("Student details:");
		System.out.println("ID   NAME ");
		System.out.println("------------");
		student1.display();
		student2.display();
		}
}

class Students{
	int id;
	String name;
	
	Students(int i,String n){
		id=i;
		name=n;
	}
	
	void display(){
		System.out.println(id+"   "+name);
	}
	
}
