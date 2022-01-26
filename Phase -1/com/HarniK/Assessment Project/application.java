package com.HarniK.Assessment_Project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class application {
	public static void main(String[] args){
		System.out.println(WELCOME);
        application menu = new application();
        menu.Main_Menu();
	}
	
	static String DIRECTORY;
    File FolderName;

    public application() {
        DIRECTORY = System.getProperty("user.dir");
        FolderName = new File(DIRECTORY+"/files");
        if (!FolderName.exists())
            FolderName.mkdirs();
        System.out.println("DIRECTORY : "+ FolderName.getAbsolutePath());
    }

    private static final String WELCOME=
            "\n*****************  WELCOME TO THE APPLICATION *******************"+
            "\n                  ----------------------------                  "+
            "\n\n*******************  Developer: HARNI K  *******************"+
            "\n                    ---------------------                     ";

    private static final String MAIN_MENU_PROMPT =
            "\nMAIN MENU - Select any of the following: \n"+
                    "1 : View`` files in directory\n"+
                    "2 : Add, Delete or Search\n"+
                    "3 : Exit Program";

    private static final String SUB_MENU_PROMPT =
            "   \n---------------------------------------------------------------\nSelect any of the following: \n"+
                    "   a : Add a file\n"+
                    "   b : Delete a file\n"+
                    "   c : Search a file\n"+
                    "   d : Go Back to Main Menu";

    void Main_Menu() {
        System.out.println(MAIN_MENU_PROMPT);
        try{
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option){
                case 1 : {
                    showFiles();
                    Main_Menu();
                }
                case 2 : {
                    Sub_Menu();
                }
                case 3 : {
                    System.out.println("Thank You!!");
                    System.exit(0);
                }
                default: Main_Menu();
            }
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2 or 3");
            Main_Menu();
        }
    }

    void Sub_Menu() {
        System.out.println(SUB_MENU_PROMPT);
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("***Please BE CAREFUL while entering the file name to delete or search files!!*** ");
            char[] input = sc.nextLine().toLowerCase().trim().toCharArray();
            char option = input[0];

            switch (option){
                case 'a' : {
                    System.out.print("Enter a file name to ADD : ");
                    String filename = sc.next().trim().toLowerCase();
                    add_File(filename);
                    break;
                }
                case 'b' : {
                    System.out.print("Enter a file name to DELETE : ");
                    String filename = sc.next().trim();
                    delete_File(filename);
                    break;
                }
                case 'c' : {
                    System.out.print("Enter a file name to SEARCH : ");
                    String filename = sc.next().trim();
                    search_File(filename);
                    break;
                }
                case 'd' : {
                    System.out.println("Going Back to MAIN menu");
                    Main_Menu();
                    break;
                }
                default : System.out.println("Please enter a, b, c or d");
            }
            Sub_Menu();
        }
        catch (Exception e){
            System.out.println("Please enter a, b, c or d");
            Sub_Menu();
        }
    }

    void showFiles() {
        if (FolderName.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] list = FolderName.list();
            System.out.println("The files in "+ FolderName +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }

    void add_File(String filename) throws IOException {
        File filepath = new File(FolderName +"/"+filename);
        String[] list = FolderName.list();
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " already exists at " + FolderName);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+" added to "+ FolderName);
    }

    void delete_File(String filename) {
        File filepath = new File(FolderName +"/"+filename);
        String[] list = FolderName.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + FolderName);
                return;
            }
        }
        System.out.println("Delete Operation failed!! FILE NOT FOUND!!!");
    }

    void search_File(String filename) {
        String[] list = FolderName.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("FOUND : File " + filename + " exists at " + FolderName);
                return;
            }
        }
        System.out.println("FILE NOT FOUND!!!");
    }   
}
