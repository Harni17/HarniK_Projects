package com.HarniK.Assisted_Project;

public class AnnonymousInnerClass {
public static void main(String[] args) {
		
		//calling Remote's workFromHome()
		Remote ref = new Remote(){
			public void workFromHome() {
				System.out.println("Wow!!!");
			}
		};
		ref.workFromHome();
	}

}

interface Remote{
	void workFromHome();
}
