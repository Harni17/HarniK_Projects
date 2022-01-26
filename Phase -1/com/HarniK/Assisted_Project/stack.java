package com.HarniK.Assisted_Project;

public class stack {
	public static void main(String args[]){
		stack s = new stack();
		System.out.println("Pushing element into stack:");
		s.push(17);
		s.push(21);
		s.push(23);
		System.out.println("\nPopping element from stack:");
		System.out.println(s.pop() + " Popped from stack");
		}
	
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty(){
		return (top < 0);
		} 
	
	stack(){
		top = -1;
		}
	
	boolean push(int x){
		if (top >= (MAX-1)){
			System.out.println("Stack Overflow");
			return false;
			}
		else{
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
			}
		}
	int pop(){
		if (top < 0){
			System.out.println("Stack Underflow");
			return 0;
			}
		else{
			int x = a[top--];
			return x;
			}
		}
	}
