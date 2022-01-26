package com.HarniK.Assisted_Project;

public class pubClass {
    public static void main(String[] args) 
    { 
        Phone android = new Phone("Realme",12000, 501, "Silver"); 
        System.out.println(android.toString()); 
    } 
}

class Phone{  
    String name; 
    int price; 
    int model; 
    String color; 
    public Phone(String name, int price, int model, String color) { 
        this.name = name; 
        this.price = price; 
        this.model = model; 
        this.color = color; 
    } 
    
    public String getName() { 
        return name; 
    } 
    
    public int getPrice() { 
        return price; 
    } 
    
    public int getModel() { 
        return model; 
    }
    
    public String getColor() { 
        return color; 
    } 
    
    @Override
    public String toString() { 
        return("This is "+ this.getName()+" phone \nPrice is " + this.getPrice()+"\nModel No is " + this.getModel()+ "\nColor is "+ this.getColor()); 
    } 
}