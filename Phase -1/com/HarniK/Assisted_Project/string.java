package com.HarniK.Assisted_Project;

public class string {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Strings Methods: ");
		
		String str1=new String("Hello Everyone");
		System.out.println(str1.length());

		//substring
		String sub=new String("Hello");
		System.out.println(sub.substring(2));


		//toLowerCase
		String s1="Hello";
		System.out.println(s1.toLowerCase());
		
//		toupperCase
		String s2 ="hello";
		System.out.println(s2.toUpperCase());
		
		//replace
		String s3="Hells";
		String replace=s3.replace('s', 'o');
		System.out.println(replace);

		//equals
		String s4="Welcome to Java";
		String s5="WeLcOmE tO JaVa";
		System.out.println(s4.equals(s5));
		
		//String Comparison
		String s6="Hello";
		String s7="Heldo";
		System.out.println(s6.compareTo(s7));
		
		//IsEmpty
		String s8="";
		System.out.println(s8.isEmpty());
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer:");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Learn Java");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEL");
		System.out.println(sb);

		//delete method
		sb.delete(0, 2);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\nConverting String to StringBuffer and StringBuilder:");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer strbuf = new StringBuffer(str); 
        strbuf.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(strbuf); 
          
        // conversion from String object to StringBuilder 
        StringBuilder strbu = new StringBuilder(str); 
        strbu.append("world"); 
        System.out.println("\nString to StringBuilder");
        System.out.println(strbu);              		
	}
}
