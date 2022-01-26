package com.HarniK.Assisted_Project;

public class encapsulation {
	public static void main (String[] args)  
    { 
		Student obj = new Student(); 
        obj.setName("Harni"); 
        obj.setAge(21); 
        obj.setRoll(007); 
        obj.setDept("Java");
        
        System.out.println("Name: " + obj.getName()); 
        System.out.println("Age: " + obj.getAge()); 
        System.out.println("Roll No: " + obj.getRoll());
        System.out.println("Department: "+ obj.getDept());
    } 
}

class Student { 
    private String Name; 
    private int Roll; 
    private int Age;
    private String Dept;
    
    public int getAge(){ 
      return Age; 
    } 
    
    public String getName(){ 
      return Name; 
    } 
    
    public int getRoll(){ 
       return Roll; 
    } 
    
    public String getDept(){ 
        return Dept; 
     } 
    
    public void setName(String newName){ 
      Name = newName; 
    } 
    
    public void setAge( int newAge){ 
        Age = newAge; 
      }
    
    public void setRoll( int newRoll){ 
      Roll = newRoll; 
    } 
    
    public void setDept(String newDept){ 
        Dept = newDept; 
      } 
}

