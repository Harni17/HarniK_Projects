package com.HarniK.Assisted_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userString {
	public static boolean isValidEmail(String email_id) {
		   String regex = "^(.+)@(.+)$";
		 //initializing the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email_id);
	       return matcher.matches();    
	   }

	   public static void main(String[] args) {
		   System.out.println("Enter an email id to check: ");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	       System.out.println("---------------------------------------------------");
	       
	       List<String> email = new ArrayList<String>();
	       // valid email id
	       email.add("hani@xyz.com");
	       email.add("harni@xyz.com");
	       
	       //invalid email id
	       email.add("kalpana.xyz.com");
	       email.add("karuna...t@xyz.com");
	       
	       for (String value : email) {
	           System.out.println("The Email Id " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       } 
	   }
}


