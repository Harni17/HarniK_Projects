package com.HarniK.Assisted_Project;

public class accessModifier {
	public static void main(String[] args) {
		//default
		System.out.println("Default Access Modifier");
		defAccessModifier obj = new defAccessModifier(); 		  
        obj.display(); 

	}
}

class defAccessModifier{ 
  void display() { 
         System.out.println("It is default access modifier"); 
     } 
} 

