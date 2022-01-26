package com.HarniK.Assisted_Project;

public class exceptionHandle {
	public static void main(String args[]){
		try{
			System.out.println("This is try block");
			// throwing the custom exception using throw
			throw new MyException("It's error Message");
		}
		catch(MyException exp){
			System.out.println("This is Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}
class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("My Exception Occurred: "+str1) ;
	   }

}
