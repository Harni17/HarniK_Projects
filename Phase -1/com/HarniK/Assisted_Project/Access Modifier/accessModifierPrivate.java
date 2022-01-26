package com.HarniK.Assisted_Project;

public class accessModifierPrivate {
	public static void main(String[] args) {
		
     	System.out.println("Private Access Specifier");
     	
		privateaccessModifier  obj = new privateaccessModifier(); 
//        when trying to access private method of another class 
//        obj.display(); //error

	}

}

class privateaccessModifier{
	private void display(){ 
        System.out.println("It is private access specifier"); 
    } 
}

