package com.HarniK.Assisted_Project;

public class InnerClass {
	public static void main(String[] args) {
//		new Outer().met();
		new Outer().new Inner().in();
	}

}

class Outer{
	private long someVar;
	int val;
	class Inner{
		int val;
		void in() {
			int val = 10;
			System.out.println("someVar : " + someVar);//Accessible here
			System.out.println("Inside Inner's in...");
			System.out.println("Local val : " + val);
			System.out.println("Instance val : " + this.val);
			System.out.println("Outer's Instance val : " + Outer.this.val);
			
			
		}
	}
	
	void met() {
		Inner ref = new Inner();
		ref.in();
	}
}

	
		
