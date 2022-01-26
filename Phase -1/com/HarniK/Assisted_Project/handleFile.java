package com.HarniK.Assisted_Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class handleFile {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      
	        while( true ) {        	
	        	   System.out.println("\n\t Employee Information System");
	        	   System.out.println("\t------------------------------\n\n");
	        
		        System.out.println("1 ===> Add New Employee Record ");
		        System.out.println("2 ===> View All Employee Record ");	
		        System.out.println("3 ===> Delete Employee Record ");
		        System.out.println("4 ===> Search Specific Record ");
		        System.out.println("5 ===> Update Specific Record ");	        
		    
		        System.out.print("\n\n");
		        System.out.println("Enter your choice: ");
		        int choice = sc.nextInt();
		          
		        switch(choice) {
		        case 1:
		        	try {
		        		AddRecord();
		        		} catch (IOException e) {
		        			e.printStackTrace();
		        			}
		        	break;
		        
		        case 2:
		        	try {
		        		ViewAllRecord();
		        		} catch (IOException e) {
		        			e.printStackTrace();
		        			}
		        	break;
		        
		        case 3:
		        	try {
		        		DeleteRecordByID();
		        		} catch (IOException e) {
		        			e.printStackTrace();
		        			}
		        	break;
		        	
		        case 4:
		        	try {
		        		SearchRecordbyID();
		        		} catch (IOException e) {
		        			e.printStackTrace();
		        			}
		        	break;
		        	
		        case 5:
		        	try {
		        		updateRecordbyID();
		        		}catch (IOException e) {
		        			e.printStackTrace();
		        			}
		        	break;
		        	
		        default:
		        	System.out.println("you have entered invalid number");  
	        }
	        }
	}
	
	  public static void AddRecord() throws IOException {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("records.txt",true) );
		Scanner Input = new Scanner(System.in);
		
		String ID, name, age, addr;
		
		System.out.print("Enter the Employee ID: ");
		ID = Input.nextLine();
		System.out.print("Enter the Employee Name: ");
		name = Input.nextLine();
		System.out.print("Enter the Employee Age: ");
		age = Input.nextLine();
		System.out.print("Enter the Employee Address: ");
		addr = Input.nextLine();    		
		   		
		bw.write(ID+","+name+","+age+","+addr);
		bw.flush();
		bw.newLine();
		bw.close();		
	
}  
	public static void ViewAllRecord() throws IOException {
	    	BufferedReader br = new BufferedReader( new FileReader("records.txt") );
	    		
	    	String record;
	    		
	    	System.out.println(" ------------------------------------------------------------- ");
	    	System.out.println("|	ID	   Name   	Age	          Address                    ");
	    	System.out.println(" ------------------------------------------------------------- ");
	    		
	    	while( ( record = br.readLine() ) != null ) {
	    			
	    		StringTokenizer st = new StringTokenizer(record,",");
	    			
	    		System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		 "+st.nextToken()+"		  "+st.nextToken()+"     ");
		
	    	}
	    		
	    	System.out.println("|	                                            	          ");
	    	System.out.println(" ------------------------------------------------------------- ");
	    	br.close();    		
	    		
	    }

	public static void DeleteRecordByID() throws IOException {
	    		Scanner strInput =  new Scanner(System.in);
	    		String ID, record;
	    		
	    		
	    		File tempDB = new File("records_temp.txt");
	    		File db = new File("records.txt");
	    		
	    		
	    		BufferedReader br = new BufferedReader( new FileReader( db ) );
	    		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
	    		
	    		System.out.println("\t\t Delete Employee Record\n");
	    		
	    		System.out.println("Enter the Employee ID: ");
	    		ID =  strInput.nextLine();
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			if( record.contains(ID) ) 
	    				continue;
	   
	    			bw.write(record);
	    			bw.flush();
	    			bw.newLine();
	 
	    		}
	    		br.close();
	    		bw.close();
	    		db.delete();
	    		
	    		tempDB.renameTo(db);
	    }
	
	public static void SearchRecordbyID() throws IOException {
	    		String ID,record;
	    		Scanner strInput = new Scanner(System.in);
	    		
	    		BufferedReader br = new BufferedReader( new FileReader("records.txt") );
	    		
	    		System.out.println("\t\t Search Employee Record\n");
	    	
	    		
	    		System.out.println("Enter the Employee ID: ");
	    		ID = strInput.nextLine();
	    		
	    		System.out.println(" ------------------------------------------------------------- ");
	    		System.out.println("|	ID	   Name   	Age	          Address                    ");
	    		System.out.println(" ------------------------------------------------------------- ");
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			
	    			StringTokenizer st = new StringTokenizer(record,",");
	    			if( record.contains(ID) ) {
	    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"    ");
	    			}	
	    		}
	    		
	    		System.out.println("|	                                            	          ");
	    		System.out.println(" ------------------------------------------------------------- ");
	    		
	    		br.close();
	    				
	    }
	
	public static void updateRecordbyID() throws IOException {
	    		String newName, newAge, newAddr, record, ID,record2;
	    		
	    		File db = new File("records.txt");
	    		File tempDB = new File("records_temp.txt");
	    		
	    		BufferedReader br = new BufferedReader( new FileReader(db) );
	    		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
	    		    		
	    		Scanner strInput = new Scanner(System.in);
	    		
	    		System.out.println("\t\t Update Employee Record\n\n");   
					
				System.out.println("Enter the Employee ID: ");
		    		ID = strInput.nextLine();	    		
		    		System.out.println(" ------------------------------------------------------------- ");
		    		System.out.println("|	ID	   Name   	Age	          Address                    ");
		    		System.out.println(" ------------------------------------------------------------- ");
		    		
		    		while( ( record = br.readLine() ) != null ) {
		    			
		    			StringTokenizer st = new StringTokenizer(record,",");
		    			if( record.contains(ID) ) {
		    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
		    			}
		    			
		    		}	    		
		    		System.out.println("|	                                            	          ");
		    		System.out.println(" ------------------------------------------------------------- ");
		    		
		    	br.close();
			    	   
	    		System.out.println("Enter the new Name: ");
	    		newName = strInput.nextLine();    		
	    		System.out.println("Enter the new Age: ");
	    		newAge = strInput.nextLine();  
	    		System.out.println("Enter the new Address: ");
	    		newAddr = strInput.nextLine();  
	    		
	    		BufferedReader br2 = new BufferedReader( new FileReader(db) );
	    			
	    		while( (record2 = br2.readLine() ) != null ) {    			
	    			if(record2.contains(ID)) {
	    				bw.write(ID+","+newName+","+newAge+","+newAddr);
	    			} else {
	    			
	    				bw.write(record2);	
	    			}    			
	    			bw.flush();
	    			bw.newLine();
	    		}
	    		
	    		bw.close();
	    		br2.close();    		
	    		db.delete();    		
	    		boolean success = tempDB.renameTo(db);    		
	    		System.out.println(success);    		
	    		
	    }

}
