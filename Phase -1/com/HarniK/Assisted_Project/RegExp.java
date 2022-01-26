package com.HarniK.Assisted_Project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Hello World";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(check);
		
		while (m.find())
	      	System.out.println( check.substring( m.start(), m.end() ) );
		}

}
