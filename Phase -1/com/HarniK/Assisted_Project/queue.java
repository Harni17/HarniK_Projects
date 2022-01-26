package com.HarniK.Assisted_Project;
import java.util.*;

public class queue{
	public static void main(String[] args){
	        		Queue<String> element = new LinkedList<>();
	        		element .add("Pune");
	        		element .add("Chennai");
	        		element .add("Delhi");
	        		element .add("Assam");
	        		
	        		System.out.println("Elements of Queue : " + element);
	        		System.out.println("Size of Queue : " + element.size());
	        		System.out.println("Head of Queue : " + element.peek());
	        		element.remove();
	        		System.out.println("After removing Head of Queue : " + element);
	        		System.out.println("Size of Queue : " + element.size());
	    	}
}
