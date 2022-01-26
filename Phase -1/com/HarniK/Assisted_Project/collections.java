package com.HarniK.Assisted_Project;
import java.util.*;

public class collections {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Chennai");//
	      city.add("Madurai");    	   
	      System.out.println(city);  
	
	      System.out.println("\nVector");
	      Vector<Integer> vect = new Vector();
	      vect.addElement(20); 
	      vect.addElement(25); 
	      System.out.println(vect);
		
		//creating linkedlist
	      System.out.println("\nLinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Harni: ");  
	      names.add("\nHani: ");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(20);  
	       set.add(10);  
	       set.add(3);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\nLinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(9);  
	       set2.add(5);  
	       set2.add(17);	       
	       System.out.println(set2);
	       
	       
	      	} 
	      }  


}
