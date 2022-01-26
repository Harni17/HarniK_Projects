package com.HarniK.Assisted_Project;
import java.io.*; 

public class singleList {
	public static void main(String[] args) { 
		
		singleList list = new singleList(); 
		// Inserting the values 
		list = insert(list, 12); 
		list = insert(list, 32); 
		list = insert(list, 43); 
		list = insert(list, 45); 
		list = insert(list, 65); 
		list = insert(list, 68); 
		list = insert(list, 27); 
		list = insert(list, 80); 
		
		printList(list); 
		 
		deleteByKey(list, 27); 
		
		printList(list); 
		 
		deleteByKey(list, 43); 
		
		printList(list); 
		 
		deleteByKey(list, 80); 
		 
		printList(list); 

	}
	
	Node head; // head of list
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
			}
		} 

// to insert a new node 
    	public static singleList insert(singleList list, int data){
    		Node new_node = new Node(data); 
        		new_node.next = null; 
   		// If the Linked List is empty, then make the new node as head
        		if (list.head == null){
        			list.head = new_node; 
        		} 
        		else{
        			// traverse till the last node and insert the new_node there 
        			Node last = list.head;
        			while (last.next != null){
        				last = last.next; 
            			} 
   			// Insert the new_node at last node 
            			last.next = new_node; 
        		} 
        		return list;
    	}
    	
    	public static void printList(singleList list){	 
        		Node presNode = list.head; 
        		System.out.print("\nLinkedList: "); 
        		// Traverse through the LinkedList 
        		while (presNode != null){ 
            			// Print the data at present node 
            			System.out.print(presNode.data + " "); 
            			// Go to next node 
            			presNode = presNode.next; 
        		} 
        		System.out.println(); 
    	} 
    	
    	// to delete a node in the LinkedList by KEY 
    	public static singleList deleteByKey(singleList list, int key){ 
        		// Store head node 
        		Node presNode = list.head, prev = null;
        		if (presNode != null && presNode.data == key){
        			list.head = presNode.next; // Changed head
        			System.out.println(key + " found and deleted");
        			return list;
        			}
        		while (presNode != null && presNode.data != key){
        			prev = presNode;
        			presNode= presNode.next;
        			} 
        		if (presNode != null){
        			prev.next = presNode.next;
        			System.out.println(key + " found and deleted");
        			} 
        		if (presNode == null){
        			System.out.println(key + " not found");
        			}
        		return list;
        		}
    	}

