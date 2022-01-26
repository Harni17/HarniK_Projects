package com.HarniK.Assisted_Project;
import java.util.*;

public class Maps {
	public static void main(String[] args) {
		//Hashmap
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();      
		hashmap.put(1,"Harni");    
		hashmap.put(2,"Hani");    
		hashmap.put(3,"Sheka");   
	       
	     System.out.println("\nThe elements of Hashmap are ");  
	     for(Map.Entry m:hashmap.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	      Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();  
	      hashtable.put(4,"Sai");  
	      hashtable.put(5,"Anil");  
	      hashtable.put(6,"Manoj");  
	     
	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:hashtable.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();    
	      treemap.put(7,"Smita");    
	      treemap.put(8,"Sharon");    
	      treemap.put(9,"Aarathy");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry t:treemap.entrySet()){    
	       System.out.println(t.getKey()+" "+t.getValue()); 
	      }
	      
	}
	
}
