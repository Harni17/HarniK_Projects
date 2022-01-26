package com.HarniK.Assisted_Project;

public class inheritance {
	public static void main(String[] args) {
		harni har = new harni();
		har.breathe();
		har.eat();
		System.out.println("--------------");
		
		hani han = new hani();
		han.breathe();
		han.dance();
	}
}

class human{
	void breathe() {
		System.out.println("human breathe ");
	}
	void eat() {
		System.out.println("human eat");
	}
	void walk() {
		System.out.println("human walk");
	}
}

class harni extends human{
	
}

class hani extends human{
	void dance() {
		System.out.println("hani dance");
	}
}


